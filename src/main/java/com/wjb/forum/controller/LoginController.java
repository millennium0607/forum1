package com.wjb.forum.controller;

import com.google.code.kaptcha.Constants;
import com.wjb.forum.constant.Constant;
import com.wjb.forum.db.po.User;
import com.wjb.forum.service.UserService;
import com.wjb.forum.utils.ForumTools;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class LoginController {
    private Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserService userService;
    @Autowired
    private ForumTools forumTools;

    @RequestMapping("/login")
    public String userLogin(HttpServletRequest request){
        if (forumTools.getKaptchaSwitch()){
            String kaptchaRecevied = request.getParameter("kaptcha");
            log.info("a----------------"+kaptchaRecevied);
            //user input verification code
            String kaptchaExpected = (String) request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
            log.info("b----------------"+kaptchaExpected);
            //check verification code
            if(kaptchaExpected == null || !kaptchaRecevied.equals(kaptchaExpected)){
                request.setAttribute("msg","Verification Code Error!");
                request.setAttribute("status", Constant.ERROR_CODE_VERIFICATION_CODE);
                log.info("msg:"+request.getAttribute("msg"));
                log.info("status:"+request.getAttribute("status"));
                return "error";
            }
        }
        String userName  = request.getParameter("username");
        String password = request.getParameter("password");
        log.info("1----------------"+userName);
        log.info("2----------------"+password);
        User user = userService.getUserByName(userName);
        //check userName and password.V1.0
        if (user == null||!user.getPassword().equals(password))
            return "/";
        //Get current subject
        Subject currentSubject= SecurityUtils.getSubject();

       //在调用了login方法后，SecurityManager会收到AuthenticationToken，并将其发送给已配置的Realm执行必须的认证检查
       //每个Realm都能在必要时对提交的AuthenticationTokens作出反应
       //所以这一步在调用login(token)方法时，它会走到MyRealm.doGetAuthenticationInfo()方法中，具体验证方式详见此方法
       UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(),user.getPassword());
       try {
           currentSubject.login(token);
       }catch (AuthenticationException e){
           log.warn("login fail");
           request.setAttribute("status",Constant.ERROR_CODE_USERNAME_PASSWORD_MISMATCH);
           request.setAttribute("msg","UserName or password error.");
           return "error";
       }
        return "helloHtml";
    }

    @RequestMapping("/register")
    public String userRegister(Map<String,Object> map){
        User user = userService.getUserByName("test");
        map.put("hello","aha,this is test again!!!  This is "+user.getUsername()+"!!!");
        return "helloHtml";
    }

    @RequestMapping(value = "/greeting")
    public ModelAndView index(ModelAndView mv){
        User user=userService.getUserByName("sfd");
        System.out.println(user.getUsername()+"--------------------");
        mv.setViewName("greeting");
        mv.addObject("title",user.getUsername());
        return mv;
    }
}

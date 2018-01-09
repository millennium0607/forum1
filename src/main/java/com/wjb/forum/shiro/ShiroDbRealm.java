package com.wjb.forum.shiro;

import com.wjb.forum.db.dao.UserMapper;
import com.wjb.forum.db.po.User;
import com.wjb.forum.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShiroDbRealm extends AuthorizingRealm {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;
 /*   @Resource
    private UserService userService;*/

    /**
     * 为当前登录的Subject授予角色和权限
     * -----------------------------------------------------------------------------------------------
     * 经测试：本例中该方法的调用时机为需授权资源被访问时
     * 经测试：并且每次访问需授权资源时都会执行该方法中的逻辑，这表明本例中默认并未启用AuthorizationCache
     * 个人感觉若使用了Spring3.1开始提供的ConcurrentMapCache支持，则可灵活决定是否启用AuthorizationCache
     * 比如说这里从数据库获取权限信息时，先去访问Spring3.1提供的缓存，而不使用Shior提供的AuthorizationCache
     * -----------------------------------------------------------------------------------------------
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //获取当前登录的用户名
//        String currentUsername = (String) super.getAvailablePrincipal(principals);
//        User user = userService.getUserByName(currentUsername);
        User user =(User)principals.getPrimaryPrincipal();
        ////为当前用户设置角色和权限
        SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();

        return simpleAuthorInfo;
    }

    /**
     * 验证当前登录的Subject
     * 经测试：本例中该方法的调用时机为LoginController.login()方法中执行Subject.login()的时候
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
        //获取基于用户名和密码的令牌
        //实际上这个authcToken是从LoginController里面currentUser.login(token)传过来的
        //两个token的引用都是一样的，本例中是：org.apache.shiro.authc.UsernamePasswordToken@33799a1e
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        try {
            User user = userService.getUserByName(token.getUsername());
            if (null != user) {
                String username = user.getUsername();
                String password = user.getPassword();
                AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(username, password, this.getName());
                //  SessionUtil.setSession(ConstantUtil.CURRENT_LOGIN_USER,user);
                this.setAuthenticationSession(user);
                return authcInfo;
            } else {
                return null;
            }
        } catch (Exception e) {
            log.error("错误", e);
        }
     /*   //此处无需比对，比对的逻辑Shiro会做，我们只需返回一个和令牌相关的正确的验证信息
        //说白了就是第一个参数填登录用户名，第二个参数填合法的登录密码（可以是从数据库中取到的，本例中为了演示就硬编码了）
        //这样一来，在随后的登录页面上就只有这里指定的用户和密码才能通过验证
        if ("yangshuang".equals(token.getUsername())) {
            AuthenticationInfo authcInfo = new SimpleAuthenticationInfo("yangshuang", "123456", this.getName());
            this.setAuthenticationSession("yangshuang");
            return authcInfo;
        }
        if ("xuanyu".equals(token.getUsername())) {
            AuthenticationInfo authcInfo = new SimpleAuthenticationInfo("xuanyu", "xuanyu", this.getName());
            this.setAuthenticationSession("xuanyu");
            return authcInfo;
        }*/
        //没有返回登录用户名对应的SimpleAuthenticationInfo对象时，就会在LoginController中抛出UnknownAccountException异常
        return null;
    }

    /**
     * 将一些数据放到ShiroSession中，以便于其它地方使用
     * 比如Controller里面，使用时直接用HttpSession.getAttribute(key)就可以取到
     */
    private void setAuthenticationSession(Object value) {
        Subject currentUser = SecurityUtils.getSubject();
        if (null != currentUser) {
            Session session = currentUser.getSession();
            System.out.println("当前Session超时时间为[" + session.getTimeout() + "]毫秒");
            session.setTimeout(1000 * 60 * 60 * 2);
            System.out.println("修改Session超时时间为[" + session.getTimeout() + "]毫秒");
            session.setAttribute("currentUser", value);
        }
    }
}

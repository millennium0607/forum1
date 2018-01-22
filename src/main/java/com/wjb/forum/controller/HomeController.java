package com.wjb.forum.controller;

import com.wjb.forum.config.properties.ForumProperties;
import com.wjb.forum.service.MenuService;
import com.wjb.forum.service.NoticeService;
import com.wjb.forum.utils.UserVOInfo;
import com.wjb.forum.vo.NoticeVO;
import com.wjb.forum.vo.UserVO;
import org.apache.catalina.security.SecurityUtil;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class HomeController {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ForumProperties forumProperties;
    @Autowired
    private NoticeService noticeService;
    @Autowired
    private MenuService menuService;

    @RequestMapping(value = "/")
    public String home(HttpServletRequest request) {
        log.info("home page");
        if(!SecurityUtils.getSubject().isAuthenticated()){
            request.setAttribute("kaptcha",forumProperties.isKaptchaSwitch());
            return "login";
        }
        //right side notice
        List<NoticeVO> noticeVOList = noticeService.getAllNoticeVO();
        request.setAttribute("noticeList",noticeVOList);

        //left side menuList
        request.setAttribute("menuList",menuService.getUserMenu());
        request.setAttribute("userName", UserVOInfo.getUserName());
        request.setAttribute("tip",UserVOInfo.getRoleTip());
        request.setAttribute("sex",UserVOInfo.getSex());
        return "index1";

    }
}

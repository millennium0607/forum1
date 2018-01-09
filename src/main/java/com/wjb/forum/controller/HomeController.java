package com.wjb.forum.controller;

import com.wjb.forum.config.properties.ForumProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ForumProperties forumProperties;

    @RequestMapping(value = "/")
    public String home(HttpServletRequest request) {
        log.info("home page");
        if(true){
            request.setAttribute("kaptcha",forumProperties.isKaptchaSwitch());
            return "login";
        }else {
            return "login";
        }

    }
}

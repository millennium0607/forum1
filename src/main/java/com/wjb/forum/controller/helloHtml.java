package com.wjb.forum.controller;

import com.wjb.forum.db.po.User;
import com.wjb.forum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class helloHtml {
    @Autowired
    private UserService userService;
    @RequestMapping("/helloHtml")
    public String helloHtml(Map<String,Object> map){
        User user = userService.getUserByName("test");
        map.put("hello","aha,this is test again!!!  This is "+user.getUserName()+"!!!");
        return "helloHtml";
    }
    @RequestMapping(value = "/greeting")
    public ModelAndView index(ModelAndView mv){
        User user=userService.getUserByName("sfd");
        System.out.println(user.getUserName()+"--------------------");
        mv.setViewName("greeting");
        mv.addObject("title",user.getUserName());
        return mv;
    }
}

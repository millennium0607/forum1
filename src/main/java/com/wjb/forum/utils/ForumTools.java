package com.wjb.forum.utils;

import com.wjb.forum.config.properties.ForumProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ForumTools {
    @Autowired
    private ForumProperties forumProperties;

    /**
     * get verification code switch
     */
    public boolean getKaptchaSwitch(){
        return forumProperties.isKaptchaSwitch();
    }
}

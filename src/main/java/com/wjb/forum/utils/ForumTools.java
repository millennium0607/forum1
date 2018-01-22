package com.wjb.forum.utils;

import com.wjb.forum.config.properties.ForumProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

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

    /**
     * get random salt
     * @return
     */
    public String getSalt(){
        String random = String.valueOf(new Random().nextLong());
        String randomMD5 = MD5Util.encrypt(random);
        return randomMD5.substring(0,5);
    }
}

package com.wjb.forum.kaptcha;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sun.misc.ObjectInputFilter;

import java.util.Properties;

@Configuration
public class kaptchaConfig{
    /**
     * creat verification code
     */
    @Bean
    public DefaultKaptcha kaptcha(){
        Properties properties = new Properties();
        properties.put("kaptcha.border","no");
        properties.put("kaptcha.border.color","105,179,90");
        properties.put("kaptcha.textProducer.font.color","red");
        properties.put("kaptcha.image.width","125");
        properties.put("kaptcha.image.height","45");
        properties.put("kaptcha.textProducer.font.size","45");
        properties.put("kaptcha.session.key","code");
        properties.put("kaptcha.textProducer.char.length","4");
        properties.put("kaptcha.textProducer.font.names","微软雅黑");
        Config config = new Config(properties);
        DefaultKaptcha defaultKaptcha = new DefaultKaptcha();
        defaultKaptcha.setConfig(config);
        return defaultKaptcha;
    }
}

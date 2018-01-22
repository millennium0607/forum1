package com.wjb.forum.utils;

import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.google.gson.Gson;


@Configuration
public class UtilsConfig {
    @Bean
    public Gson gson(){
        return new Gson();
    }

    @Bean
    public BeanUtil beanUtil(){
        return new BeanUtil();
    }
}

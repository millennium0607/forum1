package com.wjb.forum.shiro;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {
    /**
     * Security manager
     */
    @Bean
    public DefaultWebSecurityManager securityManager(CookieRememberMeManager rememberMeManager){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRememberMeManager(rememberMeManager);
        securityManager.setRealm(this.shiroDbRealm());
        return securityManager;
    }

    @Bean
    public ShiroDbRealm shiroDbRealm(){
        return new ShiroDbRealm();
    }


    /**
     * remember me manager
     * @param rememberMeCookie
     * @return
     */
    @Bean
    public CookieRememberMeManager rememberMeManager(SimpleCookie rememberMeCookie){
        CookieRememberMeManager rememberMeManager = new CookieRememberMeManager();
        rememberMeManager.setCookie(rememberMeCookie);
        return rememberMeManager;
    }


    /**
     * remember password cookie
     * @return
     */
    @Bean
    public SimpleCookie rememberMeCookie(){
        SimpleCookie cookie = new SimpleCookie("rememberMe");
        cookie.setHttpOnly(true);
        cookie.setMaxAge(60*60*24*7);
        return cookie;
    }


    @Bean
    public ShiroFilterFactoryBean shiroFilter(DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        //set login html
        shiroFilterFactoryBean.setLoginUrl("/login");
        //set error html
        shiroFilterFactoryBean.setUnauthorizedUrl("/error");
        //set success html
        shiroFilterFactoryBean.setSuccessUrl("/success");

        /**
         * set shiro intercept
         *
         * anon  no need authentication
         * authc  need authentication
         * user   authentication or remember me
         */
        Map<String ,String> map = new HashMap<>();
        map.put("/login","anon");
        map.put("/logout","anon");
        map.put("/","anon");
        map.put("/static/**","anon");
        map.put("/**","anon");

        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);
        return shiroFilterFactoryBean;

    }



}

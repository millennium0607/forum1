package com.wjb.forum.config.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * system properties
 */
@Component
public class ForumProperties {
    /**
     * kaptchaSwitch
     */
    @Value("${forum.kaptchaswitch}")
    private boolean kaptchaSwitch = false;

    public boolean isKaptchaSwitch() {
        return kaptchaSwitch;
    }

    public void setKaptchaSwitch(boolean kaptchaSwitch) {
        this.kaptchaSwitch = kaptchaSwitch;
    }
}

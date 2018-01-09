package com.wjb.forum.kaptcha;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.ServletResponseMethodArgumentResolver;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ResourceBundle;

@Controller
public class KaptchaController {
    @Autowired
    private Producer kaptchaProducer;
    @RequestMapping("/static/kaptcha.jpg")
    public void kaptchaImage(HttpServletRequest request, HttpServletResponse response) throws IOException{
        // Set to expire far in the past.
        response.setDateHeader("Expire",0);
        // Set standard HTTP/1.1 no-cache headers.
        response.setHeader("Cache-Controller","no-store,no-cache,must-revalidate");
        // Set IE extended HTTP/1.1 no-cache no-header.
        response.addHeader("Cache-Controller","post-check=0,pre-check=0");
        // Set standard HTTP/1.1 no-cache header.
        response.setHeader("Pragma","no-cache");

        //return a jpeg
        response.setContentType("image/jpeg");

        // create the text for image
        String kapText = kaptchaProducer.createText();

        //store the text in the session
        request.getSession().setAttribute(Constants.KAPTCHA_SESSION_KEY,kapText);

        // create the image with the text
        BufferedImage bi =  kaptchaProducer.createImage(kapText);

        ServletOutputStream out = response.getOutputStream();

        // write the data out
        ImageIO.write(bi,"jpg",out);
        try {
            out.flush();
        }finally {
            out.close();
        }


    }
}

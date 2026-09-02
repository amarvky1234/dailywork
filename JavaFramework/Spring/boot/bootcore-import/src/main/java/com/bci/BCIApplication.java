package com.bci;

import com.bci.beans.Radio;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BCIApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(BCIApplication.class, args);
        Radio radio = applicationContext.getBean(Radio.class);
        System.out.println(radio);
    }
}

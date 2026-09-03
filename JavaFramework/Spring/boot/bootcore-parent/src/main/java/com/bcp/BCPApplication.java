package com.bcp;

import com.bcp.beans.Launcher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BCPApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(BCPApplication.class, args);
        Launcher launcher = applicationContext.getBean(Launcher.class);
        System.out.println(launcher);
    }
}

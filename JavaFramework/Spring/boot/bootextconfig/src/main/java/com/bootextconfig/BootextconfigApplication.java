package com.bootextconfig;

import com.bootextconfig.beans.Tournament;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootextconfigApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(BootextconfigApplication.class, args);
        Tournament tournament = applicationContext.getBean(Tournament.class);
        System.out.println(tournament);
    }
}

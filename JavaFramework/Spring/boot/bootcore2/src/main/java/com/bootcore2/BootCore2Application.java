package com.bootcore2;

import com.bootcore2.beans.Motor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootCore2Application {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BootCore2Application.class);
        Motor motor = context.getBean(Motor.class);
        System.out.println(motor);
    }
}

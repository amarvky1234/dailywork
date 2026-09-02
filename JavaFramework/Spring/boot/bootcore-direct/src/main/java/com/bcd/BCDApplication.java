package com.bcd;

import com.bcd.beans.Robot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BCDApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(BCDApplication.class, args);
        Robot robot = applicationContext.getBean(Robot.class);
        System.out.println(robot);
    }
}

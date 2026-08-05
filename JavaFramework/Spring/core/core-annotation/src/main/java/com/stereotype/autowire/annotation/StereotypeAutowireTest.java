package com.stereotype.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StereotypeAutowireTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.stereotype.autowire.annotation");
        Robot robot = applicationContext.getBean("robot", Robot.class);
        robot.walk();
    }
}

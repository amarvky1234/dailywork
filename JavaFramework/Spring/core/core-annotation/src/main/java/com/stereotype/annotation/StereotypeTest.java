package com.stereotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StereotypeTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.stereotype.annotation");
        Robot robot = applicationContext.getBean("machine", Robot.class);
        robot.walk(7, "Left");
    }
}

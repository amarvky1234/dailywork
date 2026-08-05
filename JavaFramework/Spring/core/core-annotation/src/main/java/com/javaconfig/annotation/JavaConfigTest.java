package com.javaconfig.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.javaconfig.annotation");
        Bike bike = applicationContext.getBean("bike", Bike.class);
        bike.accelerate();
    }
}

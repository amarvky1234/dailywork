package com.qualifier.stereotypejavaconfig.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SJQualifierTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SJQualifierConfig.class);
        Television tv = applicationContext.getBean("television", Television.class);
        tv.on("S45");
    }
}

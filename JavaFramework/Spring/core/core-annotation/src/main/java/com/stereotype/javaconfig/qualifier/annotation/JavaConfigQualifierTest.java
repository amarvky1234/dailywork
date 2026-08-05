package com.stereotype.javaconfig.qualifier.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigQualifierTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfigQualifierConfig.class);
        Mobile mobile = applicationContext.getBean("mobile", Mobile.class);
        mobile.reqSim("499 unlimited", "CI98");
    }
}

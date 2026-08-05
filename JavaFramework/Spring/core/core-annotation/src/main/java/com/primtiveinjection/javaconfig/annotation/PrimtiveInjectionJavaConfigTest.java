package com.primtiveinjection.javaconfig.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimtiveInjectionJavaConfigTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PrimtiveInjectionJavaConfig.class);
        Branch branch = applicationContext.getBean("branch2", Branch.class);
        System.out.println(branch);
    }
}

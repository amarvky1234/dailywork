package com.stereotype.autowired.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiredTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutowiredJavaConfig.class);
        Toy toy = applicationContext.getBean("toy", Toy.class);
        toy.play();
    }
}

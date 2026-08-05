package com.stereotype.primitiveinjection.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StereotypePrimtiveInjectionTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.stereotype.primitiveinjection.annotation");
        Book book = applicationContext.getBean(Book.class);
        System.out.println(book);
    }
}

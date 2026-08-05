package com.stereotype.javaconfig.primary.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigPrimaryTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfigPrimaryConfig.class);
        Printer printer = applicationContext.getBean("printer", Printer.class);
        printer.print("Excel");
    }
}

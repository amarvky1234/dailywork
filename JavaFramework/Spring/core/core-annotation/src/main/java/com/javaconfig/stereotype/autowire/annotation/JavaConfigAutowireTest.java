package com.javaconfig.stereotype.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigAutowireTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfigStereotypeConfig.class);
        Radio radio = applicationContext.getBean("radio", Radio.class);
        radio.listen(93);
    }
}

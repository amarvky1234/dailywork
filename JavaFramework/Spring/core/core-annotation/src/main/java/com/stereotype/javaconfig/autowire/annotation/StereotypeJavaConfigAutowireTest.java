package com.stereotype.javaconfig.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StereotypeJavaConfigAutowireTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StereotypeJavaConfigAutowireConfig.class);

        PowerUnit powerUnit = applicationContext.getBean("powerUnit", PowerUnit.class);
        Motor motor = applicationContext.getBean(Motor.class);
        powerUnit.on();
    }
}

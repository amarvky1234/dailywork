package com.ta.test;

import com.ta.beans.Thrower;
import com.ta.config.ThrowAdviceConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TATest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ThrowAdviceConfig.class);

        Thrower thrower = context.getBean("thrower", Thrower.class);
        int val = thrower.willThrow(-10);

        System.out.println("val : "+ val);
    }
}

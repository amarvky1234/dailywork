package com.ara.test;

import com.ara.beans.KeyGenerator;
import com.ara.config.AfterAdviceConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AfterAdviceTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AfterAdviceConfig.class);

        KeyGenerator keyGenerator = context.getBean("keyGenerator", KeyGenerator.class);
        int key = keyGenerator.generate(10);
        System.out.println("key : "+key);
    }
}

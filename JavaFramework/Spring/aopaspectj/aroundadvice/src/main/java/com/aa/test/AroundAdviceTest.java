package com.aa.test;

import com.aa.beans.Calculator;
import com.aa.config.AroundAdviceConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AroundAdviceTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AroundAdviceConfig.class);

        Calculator calculator = context.getBean("calculator", Calculator.class);
        int sum = calculator.add(10, 20);
        System.out.println("sum : "+sum);

        sum = calculator.add(10, 20);
        System.out.println("sum : "+sum);

        sum = calculator.add(23, 24);
        System.out.println("sum : "+sum);
    }
}

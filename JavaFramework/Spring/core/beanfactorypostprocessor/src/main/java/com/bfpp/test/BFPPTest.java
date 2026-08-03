package com.bfpp.test;

import com.bfpp.beans.OrderService;
import com.bfpp.config.BFPPJavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.Collections;

public class BFPPTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BFPPJavaConfig.class);
        OrderService orderService = context.getBean(OrderService.class);

        orderService.checkout(Collections.emptyList());

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}

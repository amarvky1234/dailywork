package com.pcd.test;

import com.pcd.beans.Calculator;
import com.pcd.beans.MultiplyCalculator;
import com.pcd.beans.ScientificCalculator;
import com.pcd.config.AAConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AATest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AAConfig.class);

        Calculator calculator = context.getBean("calculator", Calculator.class);
        int sum = calculator.add(10, 20);
        System.out.println("sum : "+ sum);

        /*ScientificCalculator scientificCalculator = context.getBean(ScientificCalculator.class);
        int sub = scientificCalculator.subtract(10, 20);
        System.out.println("sub : "+ sub);*/

        MultiplyCalculator multiplyCalculator = context.getBean(MultiplyCalculator.class);
        int mul = multiplyCalculator.multiply(10, 20);
        System.out.println("mul : "+ mul);
    }
}

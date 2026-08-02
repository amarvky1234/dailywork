package com.balias.test;

import com.balias.beans.FuelTank;
import com.balias.config.BeanAliasConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class BeanAliasTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanAliasConfig.class);
        FuelTank tank = applicationContext.getBean("tank" , FuelTank.class);
        System.out.println(tank);

        String[] aliases = applicationContext.getAliases("fuelTank");
        Arrays.stream(aliases).forEach(System.out::println);
    }
}

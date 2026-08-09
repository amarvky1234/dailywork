package com.lmi.test;

import com.lmi.beans.PropertyManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LMITest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.lmi.beans");
        PropertyManager propertyManager = context.getBean(PropertyManager.class);

        System.out.println("PropertyManager classType: " +propertyManager.getClass().getName());

        double estimatedCost = propertyManager.estimate
                ("2 story building", 2, "east", 300, "saguna Danapurcantt");
        System.out.println(estimatedCost);

        estimatedCost = propertyManager.estimate
                ("3 story building", 3, "west", 500, "saguna Danapurcantt");
        System.out.println(estimatedCost);

    }
}

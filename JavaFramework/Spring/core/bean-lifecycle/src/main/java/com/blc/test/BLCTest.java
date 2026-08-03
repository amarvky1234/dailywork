package com.blc.test;

import com.blc.beans.Calculator;
import com.blc.beans.Rectangle;
import com.blc.config.BLCConfig;
import com.blc.hook.ShutdownHook;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BLCTest {
    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext(BLCConfig.class);
        ((ConfigurableApplicationContext)context).registerShutdownHook();

        //Runtime.getRuntime().addShutdownHook(new Thread(new ShutdownHook(context)));
        //register the shutdownHook thread to jvm asking him to inform when it is going to die

        Calculator cal = context.getBean(Calculator.class);
        System.out.println(cal);

        //end of the application
        //((ConfigurableApplicationContext)context).close();

        Rectangle rectangle = context.getBean(Rectangle.class);
        System.out.println(rectangle);
    }
}

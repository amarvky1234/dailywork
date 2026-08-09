package com.nbf.test;

import com.nbf.beans.Motor;
import com.nbf.config.ChildConfig;
import com.nbf.config.ParentConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NestedBeanFactTest {
    public static void main(String[] args) {

        ApplicationContext parentContext = new AnnotationConfigApplicationContext(ParentConfig.class);
        ApplicationContext childContext = new AnnotationConfigApplicationContext();
        ((AnnotationConfigApplicationContext) childContext).register(ChildConfig.class);
        ((AnnotationConfigApplicationContext) childContext).setParent(parentContext);
        ((AnnotationConfigApplicationContext) childContext).refresh();

        Motor motor = childContext.getBean(Motor.class);
        System.out.println(motor);
    }
}

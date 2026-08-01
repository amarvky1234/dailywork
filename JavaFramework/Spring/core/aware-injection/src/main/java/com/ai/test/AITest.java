package com.ai.test;

import com.ai.beans.Television;
import com.ai.config.AIConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.text.TabExpander;

public class AITest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AIConfig.class);
        Television television = context.getBean(Television.class);
        television.powerOn();
    }
}

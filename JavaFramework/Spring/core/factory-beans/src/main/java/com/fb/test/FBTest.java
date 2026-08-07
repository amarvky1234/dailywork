package com.fb.test;

import com.fb.beans.Reminder;
import com.fb.config.FBJavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FBTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(FBJavaConfig.class);
        Reminder reminder = context.getBean(Reminder.class);
        System.out.println(reminder);
    }
}

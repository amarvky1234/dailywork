package com.si18n.test;

import com.si18n.config.I18NJavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

public class SI18NTest {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(I18NJavaConfig.class);

        MessageSource messageSource = context.getBean(MessageSource.class);
        //String message = messageSource.getMessage("home.title", null, new Locale("ch", "CH"));

        String message = context.getMessage("firstName.blank", null, new Locale("hi", "IN"));

        System.out.println(message);
    }
}

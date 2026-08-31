package com.bcp;

import com.bcp.beans.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties
public class BootConfigurationPropertiesApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(BootConfigurationPropertiesApplication.class, args);
        Book book = applicationContext.getBean(Book.class);
        System.out.println(book);
    }
}

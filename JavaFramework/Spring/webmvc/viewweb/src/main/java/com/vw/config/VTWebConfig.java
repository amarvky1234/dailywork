package com.vw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.Properties;

@Configuration
@ComponentScan(basePackages = {"com.vw.controller", "com.vw.view"})
public class VTWebConfig {

    @Bean
    @Order(1)
    public ViewResolver beanNameViewResolver(){
        return new BeanNameViewResolver();
    }

    @Bean
    @Order(2)
    public ViewResolver internalResourceViewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver("/WEB-INF/jsp/", ".jsp");
        return viewResolver;
    }
}

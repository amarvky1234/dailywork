package com.aw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.Properties;

@Configuration
@ComponentScan(basePackages = {"com.aw.controller"})
public class WebConfig {

    @Bean
    public HandlerMapping handlerMapping(){
        final SimpleUrlHandlerMapping handlerMapping = new SimpleUrlHandlerMapping();
        final Properties mapping = new Properties();
        mapping.put("/about-us.htm", "viewAboutUsController");
        handlerMapping.setMappings(mapping);

        return handlerMapping;
    }

    @Bean
    public ViewResolver jspViewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver("/WEB-INF/jsp/", ".jsp");

        return viewResolver;
    }
}

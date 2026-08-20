package com.an2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.Properties;

@Configuration
@ComponentScan(basePackages = {"com.an2.controller"})
public class WebConfig {

    @Bean
    public HandlerMapping handlerMapping(){
        final SimpleUrlHandlerMapping handlerMapping = new SimpleUrlHandlerMapping();
        final Properties mappings = new Properties();
        mappings.put("/our-mission.htm", "viewOurMissionController");
        handlerMapping.setMappings(mappings);

        return handlerMapping;
    }

    @Bean
    public ViewResolver jspViewResolver(){

        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");

        return viewResolver;
    }
}

package com.fc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.ParameterizableViewController;
import org.springframework.web.servlet.mvc.UrlFilenameViewController;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class FWCWebConfig {

    /*@Bean("/locate-us.htm")
    public Controller locateUsController(){
        ParameterizableViewController locateUsController = new ParameterizableViewController();
        locateUsController.setViewName("locate-us");
        return locateUsController;
    }

    @Bean("/our-mission.htm")
    public Controller ourMissionController(){
        ParameterizableViewController ourMissionController = new ParameterizableViewController();
        ourMissionController.setViewName("our-mission");
        return ourMissionController;
    }*/

    @Bean({"/locate-us.htm", "/our-mission.htm", "/locateUs.htm", "/ourMission.htm"})
    public Controller globalController(){
        UrlFilenameViewController gc = new UrlFilenameViewController();
        return gc;
    }

    @Bean
    public ViewResolver jspViewResolver(){
        return new InternalResourceViewResolver("WEB-INF/jsp/", ".jsp");
    }
}

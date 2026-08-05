package com.javaconfig.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public Bike bike(){
        Bike bike = new Bike();
        return bike;
    }
}

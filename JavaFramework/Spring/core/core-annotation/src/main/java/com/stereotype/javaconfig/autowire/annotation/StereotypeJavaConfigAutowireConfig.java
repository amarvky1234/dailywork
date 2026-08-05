package com.stereotype.javaconfig.autowire.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.stereotype.javaconfig.autowire.annotation"})
public class StereotypeJavaConfigAutowireConfig {

    @Bean
    public Motor motor(){
        Motor motor = new Motor();
        return motor;
    }
}

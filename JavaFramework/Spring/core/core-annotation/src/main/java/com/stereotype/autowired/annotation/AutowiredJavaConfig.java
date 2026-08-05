package com.stereotype.autowired.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.stereotype.autowired.annotation"})
public class AutowiredJavaConfig {

    @Bean
    public Circuit circuit(){
        return new Circuit();
    }

    @Bean
    public Motor motor(){
        return new Motor();
    }
}

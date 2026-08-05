package com.javaconfig.stereotype.autowire.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.javaconfig.stereotype.autowire.annotation"})
public class JavaConfigStereotypeConfig {

    @Bean
    public Radio radio(IReceiver receiver){
        Radio radio = new Radio();
        radio.setReceiver(receiver);
        return radio;
    }
}

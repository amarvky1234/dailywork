package com.stereotype.javaconfig.primary.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"com.stereotype.javaconfig.primary.annotation"})
public class JavaConfigPrimaryConfig {

    @Bean
    public IToner hpToner(){
        IToner hpToner = new HPTonerImpl();
        return hpToner;
    }

    @Bean
    @Primary
    public IToner genericToner(){
        IToner genericToner = new GenericTonerImpl();
        return genericToner;
    }
}

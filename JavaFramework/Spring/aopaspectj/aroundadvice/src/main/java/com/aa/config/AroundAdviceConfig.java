package com.aa.config;

import com.aa.helper.Cache;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.aa.beans, com.aa.aspect"})
@EnableAspectJAutoProxy
public class AroundAdviceConfig {

    @Bean
    public Cache cache(){
        return Cache.getInstance();
    }
}

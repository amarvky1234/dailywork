package com.mba.config;

import com.mba.helper.SecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.mba.beans, com.mba.aspect"})
@EnableAspectJAutoProxy
public class BeforeAdviceConfig {

    @Bean
    public SecurityManager securityManager(){
        return SecurityManager.getInstance();
    }
}

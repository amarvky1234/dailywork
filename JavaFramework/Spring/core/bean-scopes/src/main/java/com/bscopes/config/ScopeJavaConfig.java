package com.bscopes.config;

import com.bscopes.beans.Game;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ScopeJavaConfig {

    @Bean
    @Scope("singleton")
    public Game chess(){
        System.out.println("instantiating chess()");
        return new Game();
    }

    @Bean
    @Scope("prototype")
    public Game carom(){
        System.out.println("instantiating caroms()");
        return new Game();
    }
}

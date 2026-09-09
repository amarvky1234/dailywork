package com.bec.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Rocket {

    @PostConstruct
    public void init(){
        System.out.println("initialized");
    }

    public void launch(int initLevel){
        if(initLevel <=0){
            throw new IllegalArgumentException("invalid launch!");
        }
        System.out.println("launching...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroying!");
    }
}

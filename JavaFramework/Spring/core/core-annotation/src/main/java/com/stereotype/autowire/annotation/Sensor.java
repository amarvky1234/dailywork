package com.stereotype.autowire.annotation;

import org.springframework.stereotype.Component;

@Component
public class Sensor {
    public void detect(){
        System.out.println("detecting obstacles!");
    }
}

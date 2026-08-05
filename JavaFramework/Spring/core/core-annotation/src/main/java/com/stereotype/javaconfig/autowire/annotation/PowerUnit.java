package com.stereotype.javaconfig.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//sourcecode
@Component
public class PowerUnit {
    @Autowired
    private Motor motor;

    public void on(){
        System.out.println("turned on the power-unit, so asking the motor to run!");
        motor.run();
    }
}

package com.nbf.config;

import com.nbf.beans.FuelTank;
import com.nbf.beans.Motor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChildConfig {

    @Bean
    public Motor motor(FuelTank fuelTank){
        Motor motor = new Motor();
        motor.setFuelTank(fuelTank);
        return motor;
    }
}

package com.nbf.config;

import com.nbf.beans.FuelTank;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:app-config.properties")
@Configuration
public class ParentConfig {

    @Bean
    public FuelTank fuelTank(@Value("${fuelType}") String fuelType, @Value("${capacity}") int capacity){
        FuelTank fuelTank = new FuelTank();
        fuelTank.setFuelType(fuelType);
        fuelTank.setCapacity(capacity);
        return fuelTank;
    }
}

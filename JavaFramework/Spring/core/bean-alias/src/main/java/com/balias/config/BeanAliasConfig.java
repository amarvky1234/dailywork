package com.balias.config;

import com.balias.beans.FuelTank;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:app-config.properties")
public class BeanAliasConfig {

    @Bean({"fuelTank", "gasTank", "petrolTank", "tank"})
    public FuelTank fuelTank(@Value("${fuelTank.tankNo}") int tankNo,
                             @Value("${fuelTank.capacity}") int capacity,
                             @Value("${fuelTank.fuelType}") String fuelType){
        FuelTank fuelTank = new FuelTank();
        fuelTank.setTankNo(tankNo);
        fuelTank.setCapacity(capacity);
        fuelTank.setFuelType(fuelType);
        return fuelTank;
    }
}

package com.bootcore2.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FuelTank {
    @Value("${capacity}")
    private int capacity;
    @Value("${fuelType}")
    private String fuelType;

    /*public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }*/

    @Override
    public String toString() {
        return "FuelTank{" +
                "capacity=" + capacity +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}

package com.bootcore2.beans;

import org.springframework.stereotype.Component;

@Component
public class Motor {
    private final FuelTank fuelTank;

    public Motor(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "fuelTank=" + fuelTank +
                '}';
    }
}

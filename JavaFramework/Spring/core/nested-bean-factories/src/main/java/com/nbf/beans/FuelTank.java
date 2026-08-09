package com.nbf.beans;

import lombok.Setter;
import lombok.ToString;

//no sourcecode
@Setter
@ToString
public class FuelTank {
    private String fuelType;
    private int capacity;

    public void setFuelType(String fuelType) {

        this.fuelType = fuelType;
    }
}

package com.nbf.beans;

import lombok.Setter;
import lombok.ToString;

//no sourcecode
@Setter
@ToString
public class Motor {
    private FuelTank fuelTank;

    public void setFuelTank(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }
}

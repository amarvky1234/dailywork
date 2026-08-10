package com.singleton.beans;

import com.singleton.pattern.UnitConverter;

public class Measurement {
    public void measure(){
        UnitConverter unitConverter = UnitConverter.getInstance();
        System.out.println("unitConverter hashcode: " + unitConverter.hashCode());
    }
}

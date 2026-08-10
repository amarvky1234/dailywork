package com.singleton.beans;

import com.singleton.pattern.UnitConverter;

public class Navigation {
    public void navigate(){
        UnitConverter unitConverter = UnitConverter.getInstance();
        System.out.println("unitConverter hashcode: " + unitConverter.hashCode());
    }
}

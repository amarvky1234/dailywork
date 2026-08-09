package com.lmi.beans;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;

@Component
@Scope("prototype")
@Data
public class PropertyEstimator {
    private String propertyType;
    private int floors;
    private String facing;
    private int sqYards;
    private String address;

    public PropertyEstimator() {
        System.out.println("PropertyEstimator()");
    }

    public double estimate(){
        System.out.println("estimating the property: "+ toString());
        return new SecureRandom().nextDouble(2500000, 200000000);
    }

    @Override
    public String toString() {
        return "PropertyEstimator{" +
                "propertyType='" + propertyType + '\'' +
                ", floors=" + floors +
                ", facing='" + facing + '\'' +
                ", sqYards=" + sqYards +
                ", address='" + address + '\'' +
                '}';
    }
}

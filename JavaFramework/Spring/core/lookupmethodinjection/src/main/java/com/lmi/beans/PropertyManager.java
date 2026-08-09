package com.lmi.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public abstract class PropertyManager {

    public double estimate(String propertyType, int floors, String facing, int sqYards, String address){
        double estimateValue = 0.0;
        PropertyEstimator propertyEstimator = null;

        propertyEstimator = lookupPropertyEstimator();
        System.out.println("property estimator ref# " +propertyEstimator.hashCode());
        propertyEstimator.setPropertyType(propertyType);
        propertyEstimator.setFloors(floors);
        propertyEstimator.setFacing(facing);
        propertyEstimator.setSqYards(sqYards);
        propertyEstimator.setAddress(address);
        estimateValue = propertyEstimator.estimate();

        return estimateValue;
    }

    @Lookup("propertyEstimator")
    abstract public PropertyEstimator lookupPropertyEstimator();

}

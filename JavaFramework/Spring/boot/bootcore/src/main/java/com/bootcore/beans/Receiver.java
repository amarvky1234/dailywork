package com.bootcore.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
    @Value("${minFrequency}")
    private int minFrequency;
    @Value("${maxFrequency}")
    private int maxFrequency;

    public void init(){
        System.out.println("initializing receiver with bounded frequency of "+ minFrequency + " and "+ maxFrequency);
    }
}

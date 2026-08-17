package com.pcd.beans;

import org.springframework.stereotype.Component;

@Component
public class MultiplyCalculator {

    public int multiply(int a, int b){
        System.out.println("in mul(..)");
        return a*b;
    }
}

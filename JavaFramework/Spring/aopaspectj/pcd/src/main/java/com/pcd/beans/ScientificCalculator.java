package com.pcd.beans;

import org.springframework.stereotype.Component;

@Component
public class ScientificCalculator extends Calculator{

    public int subtract(int a, int b){
        System.out.println("in sub(..)");
        return b-a;
    }
}

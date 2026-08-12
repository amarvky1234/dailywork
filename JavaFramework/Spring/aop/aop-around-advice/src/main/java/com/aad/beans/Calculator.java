package com.aad.beans;

public class Calculator {

    public int add(int a, int b){
        int sum = 0;

        System.out.println("in add()");
        sum = a + b;

        return sum;
    }
}

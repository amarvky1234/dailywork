package com.stereotype.javaconfig.primary.annotation;

//no sourcecode
public class HPTonerImpl implements IToner{
    @Override
    public void roll(String doc) {
        System.out.println("hp toner is rolling the doc " + doc);
    }
}

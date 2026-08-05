package com.stereotype.javaconfig.primary.annotation;

//no sourcecode
public class GenericTonerImpl implements IToner{
    @Override
    public void roll(String doc) {
        System.out.println("generic toner is rolling doc " +doc);
    }
}

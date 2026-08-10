package com.singleton.pattern;

public class UnitConverter {
    private static UnitConverter instance;

    private UnitConverter(){
        //no-op
    }
    public static UnitConverter getInstance(){
        synchronized (UnitConverter.class){
            if (instance==null){
                instance = new UnitConverter();
            }
        }
        return instance;
    }
}

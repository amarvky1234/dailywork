package com.bpp.helper;

import java.util.concurrent.atomic.AtomicInteger;

public class ObjectWatcher {
    //AtomicInteger is synchronized primitive types
    private static AtomicInteger instance = new AtomicInteger(0);

    public static int increment(){
        return instance.incrementAndGet();
    }

    public static int get(){
        return instance.get();
    }
}

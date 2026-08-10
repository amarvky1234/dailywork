package com.singleton.runnable;

import com.singleton.pattern.UnitConverter;

public class NavigatorRunnable implements Runnable{
    @Override
    public void run() {
        UnitConverter unitConverter = UnitConverter.getInstance();
        System.out.println("unitConverter hashcode: " +unitConverter);
    }
}

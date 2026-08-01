package com.ai.beans;

import org.springframework.stereotype.Component;

@Component
public class AirtelSetTopBox implements SetTopBox{
    @Override
    public void on() {
        System.out.println("airtel settopbox is on");
    }
}

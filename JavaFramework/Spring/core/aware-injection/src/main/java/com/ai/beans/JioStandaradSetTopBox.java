package com.ai.beans;

import org.springframework.stereotype.Component;

@Component
public class JioStandaradSetTopBox implements SetTopBox{
    @Override
    public void on() {
        System.out.println("jio settopbox is on");
    }
}

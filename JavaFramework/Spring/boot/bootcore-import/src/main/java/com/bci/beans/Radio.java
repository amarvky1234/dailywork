package com.bci.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Radio {
    @Value("${radio.frequency}")
    private double frequency;

    public void on(){
        System.out.println("transmitted at frequency : "+ frequency);
    }

    @Override
    public String toString() {
        return "Radio{" +
                "frequency=" + frequency +
                '}';
    }
}

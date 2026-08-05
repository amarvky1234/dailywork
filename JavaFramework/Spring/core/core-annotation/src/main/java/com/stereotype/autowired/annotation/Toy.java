package com.stereotype.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Toy {
    private Circuit circuit;
    private Motor motor;

    /*@Autowired(required = false)
    public Toy(Circuit circuit, Motor motor) {
        this.circuit = circuit;
        this.motor = motor;
    }*/

    @Autowired(required = false)
    public Toy(Motor motor){
        this.motor = motor;
    }

    @Autowired(required = false)
    public Toy(Circuit circuit){
        this.circuit = circuit;
    }

    public void play(){
        if (circuit != null){
            circuit.on();
        }
        if (motor != null){
            motor.rotate();
        }
    }
}

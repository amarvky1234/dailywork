package com.stereotype.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {
    //@Autowired
    private Sensor sensor;

   /* @Autowired(required = false)
    public Robot(Sensor sensor) {
        System.out.println("Robot(sensor)");
        this.sensor = sensor;
    }*/

    @Autowired
    public void newRobot(Sensor sensor){
        System.out.println("newRobot(sensor)");
        this.sensor = sensor;
    }

    public void walk(){
       if (sensor !=null){
            sensor.detect();
            System.out.println("walking...");
        }else {
            System.out.println("mal-farmed sensor, unable to walk");
        }
    }

    //@Autowired(required = false)
    public void setSensor(Sensor sensor) {
        System.out.println("setSensor(sensor)");
        this.sensor = sensor;
    }
}

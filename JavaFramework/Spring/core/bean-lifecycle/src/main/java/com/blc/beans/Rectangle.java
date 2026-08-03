package com.blc.beans;

import lombok.ToString;

@ToString
public class Rectangle {
    private double length;
    private double breadth;
    private double area;

    public void init(){
        System.out.println("initializing..");
        this.area = this.length * this.breadth;
    }

    public Rectangle(double length) {
        this.length = length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public void terminate(){
        this.length = 0;
        this.breadth = 0;
        this.area = 0;
        System.out.println("closing..");
    }
}

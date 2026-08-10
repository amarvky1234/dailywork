package com.pdi.beans;

import lombok.Setter;
import lombok.ToString;


@ToString
public class Person {
    private int id;
    @Setter
    private  String fullname;

    public Person(int id) {
        this.id = id;
    }
}

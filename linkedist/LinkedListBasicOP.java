package com.edupoly.collection.linkedist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListBasicOP {
    public static void main(String[] args) {
        List<String> animals = new LinkedList<>();

        //1.ADD
        animals.add("Dog");
        animals.add("Cat");
        System.out.println(animals);

        //2.INSERT
        animals.add(1, "Horse");
        System.out.println(animals);

        //3.GET
        String s1 = animals.get(2);
        System.out.println(s1);

        //4.SET(UPDATE)
        String s2 = animals.set(0, "Wolf");
        System.out.println(s2);
        System.out.println(animals);

        //5.REMOVE
        String remove = animals.remove(1);
        System.out.println(remove);
        boolean cat = animals.remove("Cat");
        System.out.println(cat);

        System.out.println("Final List : "+animals);
    }
}

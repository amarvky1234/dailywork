package com.edupoly.collection.arraylist;

/* Insert an element at a specific position in an arraylist. */

import java.util.ArrayList;
import java.util.List;

public class Ex35 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(34, 12, 67, 23, 45, 51, 101));
        System.out.println(list);

        list.add(3, 111);
        System.out.println(list);
    }
}

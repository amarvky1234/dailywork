package com.edupoly.collection.arraylist;

/*Print the index of a given element.
o Input: [23, 34, 54, 10, 4, 7], Query: 34 → Output: 1*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Ex19 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(23, 21, 34, 54, 10, 4, 7));
        System.out.println(list);

        //using indexOf()
        /*int i = list.indexOf(34);
        System.out.println(i);*/

        //using loop
        /*int query = 34;
        int index = -1;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == query) {
                index = i;
                break; // stop after first occurrence
            }
        }
        System.out.println("Index = " + index);*/

        //using stream api
        int i = IntStream.range(0, list.size())
                .filter(j -> list.get(j) == 34)
                .findFirst()
                .orElse(-1);
        System.out.println(i);
    }
}

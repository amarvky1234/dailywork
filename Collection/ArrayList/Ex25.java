package com.edupoly.collection.arraylist;

/*Print only the perfect squares in an arraylist*/

import java.util.ArrayList;
import java.util.List;

public class Ex25 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 4, 7, 9, 10, 16));
        System.out.println(list);

        //using stream api
        //list.stream().filter()
    }
}

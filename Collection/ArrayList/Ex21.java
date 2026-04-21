package com.edupoly.collection.arraylist;

/*Create a duplicate arraylist for a given arraylist*/

import java.util.ArrayList;
import java.util.List;

public class Ex21 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("India", "USA", "Russia", "China", "France"));

        //using constructor
        /*List<String> duplicateList = new ArrayList<>(list);
        System.out.println(duplicateList);*/

        //using addAll()
        /*List<String> duplicateList = new ArrayList<>();
        duplicateList.addAll(list);
        System.out.println(duplicateList);*/

        //using stream api
       /* List<String> list1 = list.stream().toList();
        System.out.println(list1);*/

        //using clone
        List<String> duplicateList = (List<String>) ((ArrayList<String>) list).clone();
        System.out.println(duplicateList);
    }
}

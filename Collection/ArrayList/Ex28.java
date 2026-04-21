package com.edupoly.collection.arraylist;

/*Print only numbers that are multiples of 2 AND 3.*/

import java.util.ArrayList;
import java.util.List;

public class Ex28 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(6, 21, 8, 12, 15, 18));
        System.out.println(list);

        //using stream api
        //list.stream().filter(n -> n%2 == 0 && n%3 == 0).forEach(System.out::println);

        //using for each loop
        for (int num : list) {
            if(num%2 == 0 && num%3 == 0){
                System.out.print(num+" ");
            }
        }
    }
}

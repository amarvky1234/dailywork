package com.edupoly.collection.arraylist;

/* Print odd numbers divisible by 3.*/

import java.util.ArrayList;
import java.util.List;

public class Ex32 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(3, 6, 9, 12, 15, 18, 21, 24, 27, 30));
        System.out.println(list);

        //stream api
        //list.stream().filter(n -> n%3 == 0 && n%2 == 0).forEach(System.out::println);

        //for each loop
        for (Integer num : list){
           if(num%3 == 0 && num%2 == 0) {
               System.out.print(num+"  ");
           }
        }
    }
}

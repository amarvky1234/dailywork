package com.edupoly.collection.arraylist;

/*Print only multiples of 5 from an arraylist.*/

import java.util.ArrayList;
import java.util.List;

public class Ex27 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(23, 25, 837, 670, 79, 75));
        System.out.println(list);

        //stream api
        //list.stream().filter(n -> n%5 == 0).forEach(System.out::println);

        //for each loop
        for (int num : list){
            if(num % 5 == 0){
                System.out.print(num+"  ");
            }
        }
    }
}

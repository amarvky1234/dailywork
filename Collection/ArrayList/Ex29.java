package com.edupoly.collection.arraylist;

/*Print numbers that are factors of 54 AND 42.*/

import java.util.ArrayList;
import java.util.List;

public class Ex29 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 6, 7, 9, 14, 21, 27, 42, 54));
        System.out.println(list);

        //for each loop
        /*for (int num : list){
            if(54%num == 0 && 42%num == 0){
                System.out.print(num+" ");
            }
        }*/

        //using stream api
        list.stream().filter(num -> 54%num == 0 && 42%num == 0).forEach(System.out::println);
    }
}

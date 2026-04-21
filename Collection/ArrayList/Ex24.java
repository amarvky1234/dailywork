package com.edupoly.collection.arraylist;

/*Store only even numbers of an array into another array.*/

import java.util.ArrayList;
import java.util.List;

public class Ex24 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(14, 15, 23, 24, 37, 38, 99, 100, 250, 251));
        System.out.println(list);

        //using stream api
        /*List<Integer> list1 = list.stream().filter(n -> n % 2 == 0).toList();
        System.out.println(list1);*/

        //for each loop
        List<Integer> evenNum = new ArrayList<>();
        for (int num : list){
            if(num%2 == 0){
                evenNum.add(num);
            }
        }
        System.out.println(evenNum);
    }
}

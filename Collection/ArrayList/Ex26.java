package com.edupoly.collection.arraylist;

/*Print only 2-digit numbers from an arraylist.*/

import java.util.ArrayList;
import java.util.List;

public class Ex26 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(23, 123, 45, 345, 13, 234, 56, 876, 7, -98));
        System.out.println(list);

        //using for each loop
        /*for(int num : list){
            if(num >= 10 && num <= 99 || (num <= -10 && num >= -99){
                System.out.print(num+" ");
            }
        }*/

        //using Math.abs()
        /*for (int num : list) {
            if (Math.abs(num) >= 10 && Math.abs(num) <= 99) {
                System.out.print(num + "  ");
            }
        }*/

        //using stream api
        list.stream().filter(n -> Math.abs(n) >= 10 && Math.abs(n) <= 99 ).forEach(System.out::println);
    }
}

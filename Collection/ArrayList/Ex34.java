package com.edupoly.collection.arraylist;

/*Find the greatest two-digit number in an arraylist.*/

import java.util.*;

public class Ex34 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(-23, -16, 1234, 877, -78, -65, 7));
        System.out.println(list);

        //stream api
        Optional<Integer> max = list.stream().filter(n -> Math.abs(n) >= 10 && Math.abs(n) <= 99).max(Integer::compareTo);
        System.out.println(max.orElse(null));

        //using
        /*Integer max = null;
        for (int num : list){
            if(num >= 10 && num <= 99){
                if(max == null || num > max){
                    max = num;
                }
            }
        }
        System.out.println("Max val : "+max);*/

        //using

    }
}

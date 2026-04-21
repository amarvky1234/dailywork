package com.edupoly.collection.arraylist;

/* Find the second-largest element in an arraylist. */

import java.util.*;

public class Ex38 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(23, -23, 67, 45, 89, 101, 56, 99));

        //using stream api
        /*Optional<Integer> first = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println("second largest element : "+first.orElse(null));*/

        //using sorting
        /*Collections.sort(list);
        int secMax = list.get(list.size()-2);
        System.out.println(secMax);*/

        //using for each loop
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int num : list){
            if(num > max){
                secMax = max;
                max = num;
            } else if (num > secMax && num != max) {
                secMax = num;
            }
        }
        System.out.println("Second Largest element : "+secMax);
    }
}

package com.edupoly.collection.arraylist;

/*Eliminate duplicates in an array.
Input: [23, 34, 54, 10, 34, 7, 23] → Output: [23, 34, 54, 10, 7] */

import java.util.ArrayList;
import java.util.List;

public class Ex20 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(3, 25, 7, 25, 3, 7, 34, 21, 11, 21, 34, 11));
        System.out.println(list);
        System.out.println(list.size());


        //using indexOf() and lastIndexOf
        /*for(int i=0; i<list.size(); i++){
            int i1 = list.indexOf(list.get(i));
            int i2 = list.lastIndexOf(list.get(i));
            System.out.println(i1+"   "+i2);
            if(i1 != i2){
                list.remove(i);
                i--; // after removing
            }
            System.out.println(list);
            System.out.println("size:"+list.size());
        }
        System.out.println(list);*/

        //using stream api
        /*List<Integer> list1 = list.stream().distinct().toList();
        System.out.println(list1);*/

        // using set
        /*Set<Integer> set = new HashSet<>(list); //not maintain order
        List<Integer> res = new ArrayList<>(set);
        System.out.println(res);

        Set<Integer> integerSet = new LinkedHashSet<>(list); //maintain insertion order
        List<Integer> result = new ArrayList<>(integerSet);
        System.out.println(result);*/

        //using nested for loop
        for (int i = 0; i < list.size(); i++){
            for (int j = i + 1; j < list.size(); j++){
                boolean b = list.get(i).equals(list.get(j));
                System.out.println(b);
                if (list.get(i).equals(list.get(j))){
                    list.remove(j);
                    //j--;
                }
            }
        }
        System.out.println(list);
    }
}

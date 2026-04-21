package com.edupoly.collection.arraylist;

/*Write a program to remove elements that are not in ascending order.
o Input: [12, 34, 11, 56, 37, 98, 23] → Output: [12, 34, 56, 98] */

import java.util.ArrayList;
import java.util.List;

public class Ex31 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(12, 34, 11, 56, 37, 98, 23));
        System.out.println(list);

        //using
        int k = 0;
        for (int num : list){
            if(num>k){
                System.out.print(num+" ");
                k = num;
            }
        }
    }
}

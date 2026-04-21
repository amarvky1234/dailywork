package com.edupoly.collection.arraylist;

/*. Count the total negative numbers in an arraylist.*/

import java.util.ArrayList;
import java.util.List;

public class Ex39 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(12, -9, 0, -87, 98, -65, 78, 89, -21, -23, -11, 0, 34, 89, -11));

        //uisng for each loop
        int count = 0;
        for (int num : list){
            if(num < 0){
                count++;
                System.out.println(num);
            }
        }
        System.out.println("total negative numbers : "+count);
    }
}

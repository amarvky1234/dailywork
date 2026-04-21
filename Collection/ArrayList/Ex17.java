package com.edupoly.collection.arraylist;

/*Search if a number exists in an array.
o Input: [23, 34, 54, 10, 4, 7], Query: 34 → Output: true*/

import java.util.ArrayList;
import java.util.List;

public class Ex17 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(23, 34, 54, 10, 4, 7));
        System.out.println(list);

        boolean contains = list.contains(11);
        System.out.println(contains);
        boolean contains1 = list.contains(34);
        System.out.println(contains1);

        //using for each loop
        /*for (int num : list){
            if(num == 34){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);*/

        //using iterator
        /*var it = list.iterator();
        while (it.hasNext()){
            if(it.next() == 35){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);*/
    }
}

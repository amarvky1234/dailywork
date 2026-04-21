package com.edupoly.collection.arraylist;

/*Print all positive numbers in an arraylist.*/

import java.util.ArrayList;
import java.util.List;

public class Ex22 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(23, -8, 12, 8, -234, 837, -11, 11));
        System.out.println(list);

        //using iterator
        /*var it = list.iterator();
        while (it.hasNext()){
            Integer next = it.next();
            if(next > 0){
                System.out.print(next+"  ");
            }
        }*/

        //using for each loop
        /*for (int num : list){
            if(num > 0){
                System.out.println(num);
            }
        }*/

        //using stream api
        /*List<Integer> list1 = list.stream().filter(n -> n > 0).toList();
        System.out.println(list1);
        list.stream().filter(e -> e > 0).forEach(System.out::println);*/
    }
}

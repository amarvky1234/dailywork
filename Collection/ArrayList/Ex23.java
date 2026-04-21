package com.edupoly.collection.arraylist;

/*Reduce each element of an array by 25% and store in another arraylist*/

import java.util.ArrayList;
import java.util.List;

public class Ex23 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(100, 200, 250, 500, 1000));
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();

        //using for each loop
        /*for (int n : list){
            int res = n - (n*25/100);
            newList.add(res);
        }
        System.out.println(newList);*/

        //using stream api
        /*list.stream().forEach(n -> {
            int res = n- (n*25)/100;
            newList.add(res);
        });
        System.out.println(newList);

        List<Integer> list1 = list.stream().map(n -> n - (n * 25 / 100)).toList();
        System.out.println(list1);*/
    }
}

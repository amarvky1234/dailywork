package com.edupoly.collection.arraylist;

/*.Print all unique elements in an arraylist*/

import java.util.*;
import java.util.stream.Collectors;

public class Ex41 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, -1, 23, 0, -6, 6, -1, 23, 7, 6, -6, 0, 11, 21));
        System.out.println(list);

        //using map and loop
        /*Map<Integer, Integer> map = new HashMap<>();

        for (int num : list){
            map.put(num, map.getOrDefault(num , 0)+1);
        }
        System.out.println(map);

        *//*for (int num : list){
            if(map.get(num) == 1){
                System.out.print(num+"  ");
            }
        }*//* //or
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
            }
        }*/

        //using stream api
        Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(collect);

        list.stream().filter(num -> collect.get(num) == 1).forEach(System.out::println);
    }
}

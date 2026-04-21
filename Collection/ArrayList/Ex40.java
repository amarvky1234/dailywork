package com.edupoly.collection.arraylist;

/* Count the frequency of each element in an arraylist.*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex40 {
    public static void main(String[] args) {
       List<Integer> list = new ArrayList<>(List.of(11, 12 , 54, 12, 34, 11, 34, 12, 11));
        System.out.println(list);

        //using map
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : list){
            map.put(num, map.getOrDefault(num , 0)+1);
        }
        System.out.println(map);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+ " -> "+ entry.getValue());
        }

        //using stream
        /*Map<Integer, Long> collect = list.stream()
                .collect(Collectors
                        .groupingBy(n -> n, Collectors.counting()));
        System.out.println(collect);*/
    }
}

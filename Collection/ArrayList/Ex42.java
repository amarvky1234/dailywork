package com.edupoly.collection.arraylist;

/*Count the total duplicate elements in an arraylist */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex42 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, -1, 23, 0, -6, 6, -1, 23, 7, 6, -6, 0, 11, 21, 6));
        System.out.println(list.size());

        //using stream api
        /*int dupEle = (int) (list.size() - list.stream().distinct().count());
        System.out.println("total duplicate elements : "+dupEle);*/

        //map and loop
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : list){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        System.out.println(map);

        int count = 0;
        for (int i : map.values()){
            if (i > 1){
                count += (i-1);
            }
        }
        System.out.println(count);
    }
}

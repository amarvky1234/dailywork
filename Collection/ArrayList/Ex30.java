package com.edupoly.collection.arraylist;

/*Sort an array based on the number of occurrences of elements.
Input: [1, 2, 5, 6, 2, 1, 6, 1, 2]
Output: [5, 6, 6, 1, 1, 1, 2, 2, 2]*/

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex30 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 5, 6, 2, 1, 6, 1, 2));
        System.out.println(list);

        /*Map<Integer, Integer> map = new HashMap<>();
        for (int num : list){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        System.out.println(map);

        List<Integer> result = new ArrayList<>(list);

        result.sort((a, b) -> {
            int x = map.get(a);
            int y = map.get(b);
            if(x != y){
                return x-y;
            }else {
                return a-b;
            }
        });
        System.out.println(result);*/

        //using stream api
        // Step 1: Frequency map
        Map<Integer, Long> freq =
                list.stream()
                        .collect(Collectors.groupingBy(
                                x -> x,
                                Collectors.counting()
                        ));

        // Step 2: Sort using stream
        List<Integer> result =
                list.stream()
                        .sorted((a, b) -> {
                            int fa = freq.get(a).intValue();
                            int fb = freq.get(b).intValue();

                            if (fa != fb) {
                                return fa - fb; // ascending frequency
                            } else {
                                return a - b;   // tie-breaker (optional)
                            }
                        })
                        .toList();

        System.out.println(result);
    }
}

package com.edupoly.collection.arraylist;

/*Find the minimum number in an array.
o Input: [23, 34, 54, 10, 4, 7] → Output: 4*/

import java.util.*;

public class Ex12 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(23, 34, 54, 10, 4, 7));
        System.out.println(list);

        //using for each loop
        /*int min = list.get(0);
        for(int num : list){
            if(num < min){
                min = num;
            }
        }
        System.out.println("Min val : "+min);*/

        //using stream
        /*Integer i = list.stream().mapToInt(Integer::intValue).min().getAsInt();
        System.out.println("Min Val : "+i);*/

        //using stream api
        Optional<Integer> min = list.stream().min(Integer::compareTo);
        System.out.println("min val : "+min.orElse(null));


        //using Collections.min()
        /*Integer min = Collections.min(list);
        System.out.println("MIN VAL : "+min);*/

        //using iterator
        int minVal = list.get(0);
        var it = list.iterator();
        while (it.hasNext()){
            Integer next = it.next();
            if(next < minVal){
                minVal = next;
            }
        }
        System.out.println("Min Val = "+minVal);
    }
}

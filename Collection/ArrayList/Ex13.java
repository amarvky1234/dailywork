package com.edupoly.collection.arraylist;

/*Find the maximum number in an array.
o Input: [23, 34, 54, 10, 4, 7] → Output: 54*/

import java.util.ArrayList;
import java.util.List;

public class Ex13 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(23, 34, 54, 10, 4, 7));
        System.out.println(list);

        //using stream
        /*int asInt = list.stream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.println("Max Val : "+asInt);

        Integer i = list.stream().max(Integer::compareTo).get();
        System.out.println("Max Value : "+i);*/

        //using Collections.max()
        /*Integer max = Collections.max(list);
        System.out.println("Max Val : "+max);*/

        //using for each loop
        /*int max = list.get(0);
        for(int num : list){
            if(num > max){
                max = num;
            }
        }
        System.out.println("Maximum Val : "+max);*/

        //using iterator
        int maxVal = list.get(0);
        var it = list.iterator();
        while (it.hasNext()){
            Integer next = it.next();
            if(next > maxVal){
                maxVal = next;
            }
        }
        System.out.println("Max Value : "+maxVal);
    }
}

package com.edupoly.collection.arraylist;

/*Sum all elements in an array.
o Input: [23, 34, 54, 10, 4, 7] → Output: 132*/

import java.util.ArrayList;
import java.util.List;

public class Ex14 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(23, 34, 54, 10, 4, 7));
        System.out.println(list);

        //using stream api
        /*int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum : "+sum);*/

        //using for each loop
        /*int sum = 0;
        for(int num : list){
            sum += num;
        }
        System.out.println(sum);*/

        //using iterator
        /*int sum = 0;
        var it = list.iterator();
        while (it.hasNext()){
            Integer next = it.next();
            sum += next;
        }
        System.out.println(sum);*/

        //using reduce()
        //Integer sum = list.stream().reduce(0, (a, b) -> a + b); //or
        Integer sum = list.stream().reduce(0, Integer::sum);
        System.out.println("sum = "+sum);
    }
}

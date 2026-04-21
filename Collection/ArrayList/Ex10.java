package com.edupoly.collection.arraylist;

/*Print only odd numbers from an array.
o Input: [23, 34, 54, 10, 13, 4, 7] → Output: 23 13 7 */

import java.util.ArrayList;
import java.util.List;

public class Ex10 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(23, 43, 34, 54, 10, 13, 4, 7, 11));
        System.out.println(list);

        //using stream api
        /*list.stream()
                .filter(n -> n%2 != 0)
                .forEach(e-> System.out.print(e+" "));*/

        //using for each loop
        /*for(int num : list){
            if(num%2 != 0){
                System.out.print(num+" ");
            }
        }*/

        //store odd num in new list
        /*List<Integer> oddNum = list.stream()
                .filter(n -> n%2 != 0)
                .toList();
        System.out.println(oddNum);*/

        //using iterator
        var it = list.iterator();
        while (it.hasNext()){
            Integer next = it.next();
            if (next%2 != 0){
                System.out.println(next);
            }
        }
    }
}

package com.edupoly.collection.arraylist;

/*Find all numbers greater than a given number.
o Input: [23, 34, 54, 10, 4, 7], Threshold: 20 → Output: 23, 34, 54 */

import java.util.ArrayList;
import java.util.List;

public class Ex16 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(10, 11, 23, 34, 54, 10, 4, 7));
        System.out.println(list);

        //using traditional loop
        /*for(int i=0; i<list.size(); i++){
            if(list.get(i) > 20){
                System.out.print(list.get(i)+" ");
            }
        }*/

        //using for each loop
        /*for(int num : list){
            if(num > 20){
                System.out.print(num+" ");
            }
        }*/

        //using stream api
        list.stream().filter(n -> n > 20).forEach(System.out::println);

        //store result in new list
        List<Integer> res = list.stream().filter(n -> n > 20).toList();
        System.out.println(res);
    }
}

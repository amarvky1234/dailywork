package com.edupoly.collection.arraylist;

/*Print only even numbers from an array.
o Input: [23, 34, 54, 10, 4, 7] → Output: 34 54 10 4
*/

import java.util.ArrayList;
import java.util.List;

public class Ex9 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(23, 34, 54, 10, 4, 7));
        System.out.println(list);

        //1. using stream api
        list.stream().filter(n -> n%2 == 0).forEach(System.out::println);

        //2. using for each loop
        /*for(int num : list){
            if(num%2 == 0){
                System.out.print(num+" ");
            }
        }*/

        //3. using traditional loop
        /*for(int i=0; i<list.size(); i++){
            if(list.get(i)%2 == 0){
                System.out.print(list.get(i)+" ");
            }
        }*/

        //4. store even number in new list
        /*List<Integer> evenNum = list.stream().filter(n-> n%2 == 0).toList();
        System.out.println(evenNum);*/
    }
}

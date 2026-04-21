package com.edupoly.collection.arraylist;

/*Find the total number of times an element appears in an array.
o Input: [23, 34, 54, 10, 34, 7, 23], Query: 34 → Output: 2 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex18 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(23, 34, 54, 10, 34, 7, 23));
        System.out.println(list);

        //using while
        //int k =0;
        //if(list.contains(34))
        //using for each loop
        /*int count = 0;
        for(int num : list){
            if(num == 34){
                count++;
            }
        }
        System.out.println(count);*/

        //using stream
        long count = list.stream().filter(n -> n == 34).count();
        System.out.println(count);

        //using Collections.frequency()
        int frequency = Collections.frequency(list, 34);
        System.out.println(frequency);
    }
}

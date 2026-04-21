package com.edupoly.collection.arraylist;

/*Find the average of all elements in an array.
o Input: [23, 34, 54, 10, 4, 7] → Output: 22 */

import java.util.ArrayList;
import java.util.List;

public class Ex15 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(23, 34, 54, 10, 4, 7));
        System.out.println(list);

        //using reduce()
        /*Integer sum = list.stream().reduce(0, (a, b) -> (a + b));
        Integer avg = sum/list.size();
        System.out.println(avg);*/

        //using stream api
        /*OptionalDouble average = list.stream().mapToInt(Integer::intValue).average();
        System.out.println(average);*/

        //using for each loop
        int total = 0;
        for(int num : list){
            total += num;
        }
        int avg = total/list.size();
        System.out.println(avg);
    }
}

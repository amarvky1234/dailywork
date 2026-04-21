package com.edupoly.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

/*Sort an array in ascending order.
o Input: [23, 34, 54, 10, 4, 7] → Output: 4 7 10 23 34 54 */
public class Ex8 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(23, 34, 54, 10, 4, 7));
        System.out.println(list);

        //1. using Collections.sort()
        /*Collections.sort(list);
        System.out.println(list);*/

        //2. using List.sort() (java 8+)
        /*list.sort(Integer::compareTo);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);*/

        //3. using java stream api
        List<Integer> sortedList = list.stream().sorted().toList();
        System.out.println(sortedList);

        //4. using custom object

    }
}

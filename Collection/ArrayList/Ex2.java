package com.edupoly.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

/**Print all numbers in an array except the first element.
 o Input: [23, 34, 54, 0, 4, 7] → Output: 34 54 0 4 7 */

class Ex2{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(23, 34, 54, 0, 4, 7));
        list.remove(0);
        System.out.println(list);
    }
}

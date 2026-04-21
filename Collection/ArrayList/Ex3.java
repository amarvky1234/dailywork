package com.edupoly.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

/**Print all elements in an array except the last element.
 o Input: [23, 34, 54, 0, 4, 7] → Output: 23 34 54 0 4 */

class Ex3{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(23, 34, 54, 0, 4, 7));
        System.out.println(list.size());
        list.remove(list.size()-1);
        System.out.println(list);
        System.out.println(list.size());
    }
}

package com.edupoly.collection.arraylist;

/*Remove an element from a specific position*/

import java.util.ArrayList;
import java.util.List;

public class Ex36 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(34, 12, 67, 23, 45, 51, 101));
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        list.remove(Integer.valueOf(101));
        System.out.println(list);
    }
}

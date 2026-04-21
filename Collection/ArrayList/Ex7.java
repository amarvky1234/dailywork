package com.edupoly.collection.arraylist;

/*Print only the last 4 elements of an array.
o Input: [23, 34, 54, 0, 4, 7] → Output: 54 0 4 7*/

import java.util.ArrayList;
import java.util.List;

public class Ex7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(23, 34, 54, 0, 4, 7));
        System.out.println(list);

        /*int j = list.size() - 4;
        for(int i=j; i<list.size(); i++){
            System.out.print(list.get(j)+" ");
            j++;
        }*/

        //using suubList()
        List<Integer> list1 = list.subList(list.size() - 4, list.size());
        System.out.println(list1);

        //using java 8 stream
        list.stream().skip(Math.max(0, list.size()-4)).forEach(n-> System.out.print(n+" "));
    }
}

package com.edupoly.collection.arraylist;
/*Store an array into another array (copy array).
o Input: ar = [23, 34, 54, 10, 4, 7] → Output: br = [23, 34, 54, 10, 4, 7]*/

import java.util.ArrayList;
import java.util.List;

public class Ex6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(23, 34, 54, 10, 4, 7));
        ArrayList<Integer> copyList = list;
        System.out.println(copyList);
        System.out.println(copyList.hashCode()+"      "+list.hashCode());

        ArrayList<Integer> newList = new ArrayList<>();
        newList.addAll(list);
        System.out.println(newList);
        System.out.println(newList.hashCode()+"     "+list.hashCode());

        ArrayList<Integer> list1 = new ArrayList<>(List.of(45,67,78,33,24));
        System.out.println(list1);
        System.out.println(list1.hashCode()+"    "+list.hashCode());


        ArrayList<Integer> list2 = new ArrayList<>();
        for (int num : list){
            list2.add(num);
        }
        System.out.println(list2);
        System.out.println(list2.hashCode()+"   "+list.hashCode());
    }
}

package com.edupoly.collection.arraylist;

import java.util.*;

public class Assignment1 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(List.of("Apple", "Banana"));
        List<String> list2 = new ArrayList<>(List.of("Banana", "Cherry"));

        List<String> list3 = new ArrayList<>(list1);
        /*System.out.println(list3);
        for (String s : list2){
           if(!list3.contains(s)) {
               list3.add(s);
           }
        }
        System.out.println(list3);*/

        //using set
        Set<String> set = new HashSet<>();
        for(String s : list1){
            set.add(s);
        }
        System.out.println(set);
        for(String str : list2){
            set.add(str);
        }
        System.out.println(set);
    }
}

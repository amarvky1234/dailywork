package com.edupoly.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

/*Print the first 4 elements in an ArrayList*/
public class Ex5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("A", "B", "C", "D", "E", "F"));
        System.out.println(list);

        /*int ele = 4;
        int i = 0;
        while (i<4){
            System.out.println(list.get(i));
            i++;
        }*/

        //using java 8 stream
        list.stream().forEach(n->{
            if(list.indexOf(n)<4){
                //int i = list.indexOf(n);
                System.out.println(list.get(list.indexOf(n)));
            }
        });
    }
}

package com.edupoly.collection.arraylist;

/*Insert the first 10 odd numbers into an empty arraylist*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Ex33 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        //using
        /*for(int i=0; i<10; i++){
            list.add(i*2+1);
        }
        System.out.println(list);*/

        //using
        /*int oddNum = 1;
        while (list.size()<10){
            list.add(oddNum);
            oddNum += 2;
        }
        System.out.println(list);*/

        //using stream api
        List<Integer> list1 = IntStream.iterate(1, n -> n + 2).limit(10).boxed().toList();
        System.out.println(list1);
    }
}

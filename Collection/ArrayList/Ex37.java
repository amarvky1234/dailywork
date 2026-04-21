package com.edupoly.collection.arraylist;

/* Count the total even and odd elements in an arraylist*/

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex37 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,  2, 3, 4, 5, 6, 7, 8, 9, 10, 21));
        System.out.println(list);

        //using stream
        /*long evenCount = list.stream().filter(n -> n % 2 == 0).count();
        long oddCount = list.stream().filter(n -> n%2 != 0).count();
        System.out.println("Total even element :"+evenCount);
        System.out.println("Total odd element  :"+oddCount);*/

        //using for each loop
        /*int evenCountNo = 0;
        int oddCountNo = 0;
        for (int num : list){
            if(num%2 == 0){
                evenCountNo++;
            }else {
                oddCountNo++;
            }
        }
        System.out.println("Total even element :"+evenCountNo);
        System.out.println("Total odd element  :"+oddCountNo);*/

        //using iterator
        /*int k1=0;
        int k2=0;
        var it = list.iterator();
        while (it.hasNext()){
            Integer next = it.next();
            if(next%2 == 0){
                k1++;
            }else {
                k2++;
            }
        }
        System.out.println("Total even element :"+k1);
        System.out.println("Total odd element  :"+k2);*/

        //Using partitioningBy()
        /*Map<Boolean, List<Integer>> map =*/
        Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        //System.out.println(collect);
        System.out.println("Total even element :"+collect.get(true).stream().count());
        System.out.println("Total odd element  :"+collect.get(false).stream().count());
    }
}

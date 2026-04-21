package com.edupoly.collection.arraylist;

/*Print all the numbers from the last index to the first index except the first element.
13. Print all the numbers from the last index to the first index except the last element. */

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ex11 {
    public static void main(String[] args) {
        lastToFirstExceptFirst();
        System.out.println();
        lastToFirstExceptLast();
    }
    public static void lastToFirstExceptFirst(){
        List<Integer> list = new ArrayList<>(List.of(23, 34, 12, 14, 45, 56));
        System.out.println(list);

        //using traditional loop
        /*for(int i=list.size()-1 ; i>=1; i--){
            System.out.println(list.get(i));
        }*/

        //using ListIterator
        ListIterator<Integer> lt = list.listIterator(list.size());
        while (lt.hasPrevious()){
            Integer previous = lt.previous();
            if(lt.nextIndex() == 0){
                continue;
            }
            System.out.println(previous);
        }
    }

    public static void lastToFirstExceptLast(){
        List<Integer> list = new ArrayList<>(List.of(23, 34, 12, 14, 45, 56));
        System.out.println(list);

        //using traditional loop
        /*for(int i=list.size()-2 ; i>=0; i--){
            System.out.println(list.get(i));
        }*/

        //using ListIterator
        var lt = list.listIterator(list.size());
        while (lt.hasPrevious()){
            Integer previous = lt.previous();
            if (lt.nextIndex() == list.size()-1){
                continue;
            }
            System.out.println(previous);
        }
    }
}

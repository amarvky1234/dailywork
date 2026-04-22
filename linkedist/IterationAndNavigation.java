package com.edupoly.collection.linkedist;

import java.util.LinkedList;
import java.util.List;

public class IterationAndNavigation {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(List.of(10, 20, 30, 40));

        //standard forward iterator
        /*var it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/

        //Descending Iterator
        var reverseIt = list.descendingIterator();
        while(reverseIt.hasNext()){
            System.out.println(reverseIt.next());
        }
    }
}

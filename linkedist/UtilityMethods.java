package com.edupoly.collection.linkedist;

import java.util.LinkedList;
import java.util.List;

public class UtilityMethods {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(List.of(10,323,23,45,21,36));
        System.out.println(list);

        //getFirst() and getLast() => Throws exception if list is empty
        Integer first = list.getFirst();
        Integer last = list.getLast();
        System.out.println(first+"   "+last);

        //peekFirst() and peekLast() => return null if list is empty (safer)
        Integer i1 = list.peekFirst();
        Integer i2 = list.peekLast();
        System.out.println(i1+"   "+i2);

        //pollFirst() and pollLast() => removes and returns the element, or null if empty.
        Integer pollFirst = list.pollFirst();
        Integer pollLast = list.pollLast();
        System.out.println(pollFirst+"   "+pollLast);
        System.out.println(list);

        //offerFirst() and offerLast() => add element and return true
        boolean b1 = list.offerFirst(101);
        boolean b2 = list.offerLast(105);
        System.out.println(b1+"   "+b2);
        System.out.println(list);

    }
}

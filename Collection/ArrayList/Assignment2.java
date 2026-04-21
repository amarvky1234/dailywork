/* Challenge 2: The "In-Place Filter"
Goal: You have an ArrayList<Integer> with numbers like [10, 5, 20, 8, 15].
The Task: Remove all numbers less than 10 without creating a new list.
The Trap: Remember what we learned about the ConcurrentModificationException! How will you handle the loop?
*/
package com.edupoly.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Assignment2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(7,4,10, 5, 20, 8, 15));

        for(int i=0; i<list.size(); i++){
            if(list.get(i) < 10){
                list.remove(list.get(i));
                i--;
            }
        }
        System.out.println(list);

        //Best Choice
        /*Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            if(it.next()<10){
              it.remove();
            }
        }
        System.out.println(list);*/

        //gives error
        /*for(int num : list){
            if(num < 10){
                list.remove(num); //here modifying while iterating
            }
        }
        System.out.println(list);*/

        //java 8+
        /*list.removeIf(n -> n<10);
        System.out.println(list);*/
    }
}

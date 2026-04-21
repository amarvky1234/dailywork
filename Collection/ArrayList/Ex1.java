package com.edupoly.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

/*Print all the array values using a for loop.
o Input: [23, 34, 54, 0, 4, 7] → Output: 23 34 54 0 4 7*/

class Ex1{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(23, 34, 54, 0, 4, 7));

        for(int num : list){
            System.out.print(num+" ");
        }
    }
}

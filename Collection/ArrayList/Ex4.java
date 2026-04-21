package com.edupoly.collection.arraylist;
import java.util.ArrayList;
import java.util.List;

/**Print all numbers in reverse order (last index to first index).
 o Input: [23, 34, 54, 0, 4, 7] → Output: 7 4 0 54 34 23  */

class Ex4{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(23, 34, 54, 0, 4, 7));
        System.out.println("Original list "+list);

        //using traditional for loop
        /*int i = list.size()-1;
        while (i>=0) {
            System.out.print(list.get(i)+" ");
            i--;
        }
        System.out.println();*/

        //using loop(manual swap)
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }

        System.out.println(list);

        //using ListIterator
        /*ListIterator<Integer> lt = list.listIterator(list.size());
        while(lt.hasPrevious()){
            System.out.print(lt.previous()+" ");
        }
        System.out.println();*/

        //using Collections.reverse()
        /*Collections.reverse(list);
        System.out.println(list);*/

        //using Java 8 Stream
        /*List<Integer> reversed = IntStream.range(0, list.size()).mapToObj(i-> list.get(list.size()-1-i))
                .collect(Collectors.toList());
        System.out.println(reversed);*/
    }
}


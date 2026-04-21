package com.edupoly.collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        rotateArrayFromRight(arr, 12);
    }

    static void rotateArrayFromRight(int[] arr, int shiftCount) {
        shiftCount = shiftCount % arr.length; // if shiftCount greater than arr size
        if (shiftCount > 0) {
            for (int i=0; i < shiftCount; i++) {
                int lastVal = arr[arr.length - 1];
                for (int j = arr.length - 2; j >= 0; j--) {
                    arr[j+1] = arr[j];
                }
                arr[0] = lastVal;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

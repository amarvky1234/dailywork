package com.edupoly.collection.arraylist;

import java.util.*;

public class Assignment3 {
    public static void main(String[] args) {
        List<String> votes = new ArrayList<>(List.of("Red", "Blue", "Red", "Red", "Green", "Blue", "Blue", "Green"));

        Map<String, Integer> map = new HashMap<>();
        for(String s : votes){
            map.put(s, map.getOrDefault(s,0)+1);
        }
        System.out.println(map);

        //using 8 stream
        /*String key = map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
        System.out.println("Color with get more votes is "+key);*/

        //using for each
        String color = null;
        int colorVal = 0;
        int val = Integer.MAX_VALUE;
        String minColor = null;
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > colorVal){
                colorVal = entry.getValue();
                //val = entry.getValue();
                color = entry.getKey();
            }
            if(entry.getValue() < val){
                val = entry.getValue();
                minColor = entry.getKey();
            }
        }
        System.out.println(color+" get maximum number of votes that is "+colorVal);
        System.out.println(minColor+" get minimum of votes that is "+val);
    }
}

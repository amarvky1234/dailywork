package com.edupoly.collection.map;

import java.util.HashMap;
import java.util.Map;

public class QueryAndUtilityMethods {
    public static void main(String[] args) {
        Map<Integer, String> users = new HashMap<>();
        System.out.println(users.isEmpty());
        System.out.println(users.size());
        users.put(101, "Amber");
        users.put(102, "Bob");
        users.put(103, "David");
        users.put(104, "Lewis");
        users.put(105, "Lewis");
        System.out.println(users);
        System.out.println(users.isEmpty());
        System.out.println(users.size());
        System.out.println();

        //containsKey(key)
        boolean b = users.containsKey(101);
        System.out.println(b);
        System.out.println(users.containsKey(111));

        //containsValue(val)
        System.out.println(users.containsValue("Lewis"));
        System.out.println(users.containsValue("Priya"));

        //putAll(Map m)
        /*Map<Integer, String> copyOtherMap = new HashMap<>(users);
        System.out.println(copyOtherMap);*/
        Map<Integer, String> copyOtherMap = new HashMap<>(users);
        copyOtherMap.putAll(users);
        System.out.println(copyOtherMap);

        //clear()
        users.clear();
        System.out.println(users);
    }
}

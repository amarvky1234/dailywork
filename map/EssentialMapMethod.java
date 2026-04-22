package com.edupoly.collection.map;

import java.util.HashMap;
import java.util.Map;

public class EssentialMapMethod {
    public static void main(String[] args) {
        Map<Integer, String> users = new HashMap<>();
        users.put(101, "Alice");
        users.put(102, "Bob");
        users.put(103, "David");
        users.put(104, "Lewis");
        users.put(105, "Lewis");
        System.out.println(users);
        String oldUser = users.put(101, "Charlie");
        System.out.println(oldUser);
        System.out.println(users);

        //get(Object key)
        String s = users.get(103);
        System.out.println(s);

        String str = users.get(110);
        System.out.println(str);

        //remove(Object key);
        /*String remove = users.remove(101);
        System.out.println(remove);*/ //or
        boolean charlie = users.remove(101, "Charlie");
        System.out.println(charlie);
        System.out.println(users);
    }
}

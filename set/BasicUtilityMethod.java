package com.edupoly.collection.set;

import java.util.HashSet;
import java.util.Set;

public class BasicUtilityMethod {
    public static void main(String[] args) {
        Set<String> tools = new HashSet<>();
        System.out.println(tools.isEmpty());
        tools.add("Hammer");
        tools.add("Drill");
        System.out.println(tools.size());
        System.out.println(tools.isEmpty());
        System.out.println(tools);

        tools.remove("Hammer");
        System.out.println(tools);

        tools.clear();
        System.out.println(tools.size());
        System.out.println(tools.isEmpty());
    }
}

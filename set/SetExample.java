package com.edupoly.collection.set;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        List<String> rawSignUp = Arrays.asList("Alice", "Bob", "Alice", "Charlie", "Bob");

        Set<String> uniqueUsers = new HashSet<>(rawSignUp);
        System.out.println(uniqueUsers);

        if (uniqueUsers.contains("Alice")) {
            System.out.println("Alice is already in the system.");
        }

        Set<String> sortedUsers = new TreeSet<>(uniqueUsers);
        System.out.println(sortedUsers);
    }
}

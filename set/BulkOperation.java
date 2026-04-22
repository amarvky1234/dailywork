package com.edupoly.collection.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BulkOperation {
    public static void main(String[] args) {
        Set<String> mathStudents = new HashSet<>(List.of("Alice", "Bob", "Charlie"));
        Set<String> artStudents = new HashSet<>(List.of("Charlie", "David", "Alice"));

        //addAll() -> The Union
        Set<String> allStudent = new HashSet<>(mathStudents);
        allStudent.addAll(artStudents);
        System.out.println(allStudent);

        //retainAll() -> Intersection
        Set<String> common = new HashSet<>(mathStudents);
        common.retainAll(artStudents);
        System.out.println(common);

        //removeAll() -> The Difference
        Set<String> onlyMath = new HashSet<>(mathStudents);
        onlyMath.removeAll(artStudents);
        System.out.println(onlyMath);

        Set<String> onlyArts = new HashSet<>(artStudents);
        onlyArts.removeAll(mathStudents);
        System.out.println(onlyArts);
    }
}

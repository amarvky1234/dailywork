package com.edupoly.collection;

import java.util.List;

public class EmployeeListForChangingSalary {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(101, "Amit", "Male", 25, 50000, 9876543210L),
                new Employee(102, "Priya", "Female", 30, 65000, 9123456780L),
                new Employee(103, "Rahul", "Male", 28, 55000, 9988776655L),
                new Employee(104, "Sneha", "Female", 35, 70000, 9090909090L),
                new Employee(105, "Vikram", "Male", 40, 80000, 8899776655L),
                new Employee(106, "Anjali", "Female", 22, 40000, 8765432109L),
                new Employee(107, "Karan", "Male", 27, 52000, 9345678901L),
                new Employee(108, "Pooja", "Female", 32, 68000, 9234567890L),
                new Employee(109, "Rohit", "Male", 29, 60000, 9111222333L),
                new Employee(110, "Neha", "Female", 26, 80000, 9001122334L)
        );
        //employees.stream().forEach(System.out::println);
        increaseSalaryBy10Per(employees);
    }

    public static void increaseSalaryBy10Per(List<Employee> employees){
        List<Employee> list = employees.stream().map(e -> new Employee(e.getEmpid(), e.getName(),
                e.getGender(), e.getAge(), (int) (e.getSalary() * 1.10), e.getMobileNo())).toList();
        System.out.println(list);
    }
}

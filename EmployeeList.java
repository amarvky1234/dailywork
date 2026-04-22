package com.edupoly.collection;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeList {
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
                new Employee(110, "Raja", "Male", 26, 80000, 9001122334L)
        );
        //System.out.println(employees);

        //findHighestPaidEmployee(employees);
        //findSecondHighestSalary(employees);
        //groupEmployeesByGender(employees);
        //countEmployeesByGender(employees);
        //averageSalaryByGender(employees);
        //findEmployeesWhoseAgeGreaterThan30(employees);
        //findYoungestEmployee(employees);
        //sortEmployeesBySalaryDescending(employees);
        //partitionEmployeesByAge(employees);
        //findNamesOfAllEmployees(employees);
        //findEmployeeWithLongestName(employees);
        //checkEmployeeSalary(employees);
        //findEmployeeBasedOnSalary(employees);
        //totalSalaryExpenseOfCompany(employees);
        //sortEmployeesByAgeThenSalary(employees);
        //getTop3HighestPaidEmployees(employees);
        //convertListToMap(employees);
        //findDuplicateMobileNumbers(employees);
        groupEmployeesByAgeRange(employees);
    }

    public static void findHighestPaidEmployee(List<Employee> employees){
        List<Integer> salList = employees.stream().map(e -> e.getSalary()).collect(Collectors.toList());

        Optional<Integer> max = salList.stream().max((a, b) -> (a - b));

        //Employee employee = employees.stream().filter(e -> e.getSalary() == max.get()).findFirst().get();

        //if salaries are duplicate
        List<Employee> list = employees.stream().filter(e -> e.getSalary() == max.get()).toList();
        System.out.println(list);
    }

    public static void findSecondHighestSalary(List<Employee> employees){
        Optional<Integer> first = employees.stream()
                .sorted((e1, e2) -> e2.getSalary() - e1.getSalary())
                .map(e -> e.getSalary())
                .distinct().skip(1).findFirst();

        int sal = first.get();
        System.out.println(sal);

        List<Employee> list = employees.stream().filter(e -> e.getSalary() == sal).toList();
        System.out.println(list);
    }

    public static void groupEmployeesByGender(List<Employee> employees){
        List<Employee> maleEmployees = employees.stream().filter(e -> e.getGender() == "Male").toList();
        //System.out.println("Male Employees : "+maleEmployees);
        List<Employee> femaleEmployees = employees.stream().filter(e -> e.getGender() == "Female").toList();
        //System.out.println("Female Employees : "+femaleEmployees);

        /*Map<String, List<Employee>> empMap = new HashMap<>();
        empMap.put("Male", maleEmployees);
        empMap.put("Female", femaleEmployees);
        System.out.println(empMap);*/

        Map<String, List<Employee>> empMap = Map.of("Male", maleEmployees, "Female", femaleEmployees);
        System.out.println(empMap);

        /*Map<String, List<Employee>> groupedByGender = employees.stream()
                                                                .collect(Collectors.groupingBy(Employee::getGender));

        groupedByGender.forEach((gender, list) -> {
            System.out.println(gender+" -> "+list);
        });*/

        //pretty print
        /*groupedByGender.forEach((gender, list) -> {
            List<String> names = list.stream()
                    .map(Employee::getName)
                    .toList();

            System.out.println(gender + " -> " + names);
        });*/
    }

    public static void countEmployeesByGender(List<Employee> employeeList){
        Map<String, Long> countByGender = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println(countByGender);
    }

    public static void averageSalaryByGender(List<Employee> employees){
        Map<String, Double> avgSalary = employees.stream()
                .collect(Collectors.groupingBy
                        (Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalary);
    }

    public static void findEmployeesWhoseAgeGreaterThan30(List<Employee> employees){
        List<Employee> list = employees.stream().filter(e -> e.getAge() > 30).toList();
        System.out.println(list);
    }

    public static void findYoungestEmployee(List<Employee> employees){
        Optional<Employee> min = employees.stream().min(Comparator.comparingInt(Employee::getAge));
        System.out.println(min.orElse(null));
    }

    public static void sortEmployeesBySalaryDescending(List<Employee> employees){
        //List<Employee> list = employees.stream().sorted(Comparator.comparingInt(Employee::getSalary)).toList();
        List<Employee> list = employees.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).toList();
        System.out.println(list);
    }

    public static void partitionEmployeesByAge(List<Employee> employees){
        Map<Boolean, List<Employee>> collect = employees.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 30));
        collect.forEach((key, list) ->{
            //System.out.println(key+" -> "+ list.stream().toList()); //or
            System.out.println(key+" -> "+list.stream().map(Employee::getName).toList());
        });
    }

    public static void findNamesOfAllEmployees (List<Employee> employees){
        List<String> list = employees.stream().map(Employee::getName).toList();
        System.out.println(list);
    }

    public static void findEmployeeWithLongestName(List<Employee> employees){
        //using max()
        Optional<Employee> optionalEmployee = employees.stream().max(Comparator.comparingInt(e -> e.getName().length()));
        optionalEmployee.ifPresent(e ->
                System.out.println(e.getName()+"  -> "+e.getName().length()));
    }

    public static void checkEmployeeSalary(List<Employee> employees){
        /*Check if Any Employee Has Salary > 75,000*/
        long count = employees.stream().filter(e -> e.getSalary() > 75000).count();
        System.out.println(count);

        //using anymatch()
        boolean b = employees.stream().anyMatch(e -> e.getSalary() > 75000);
        System.out.println(b);
    }

    public static void findEmployeeBasedOnSalary(List<Employee> employees){
        /*Find First Employee with Salary > 60,000*/
        Optional<Employee> first = employees.stream().filter(e -> e.getSalary() > 60000).findFirst();
        System.out.println(first.orElse(null));
    }

    public static void totalSalaryExpenseOfCompany(List<Employee> employees){
        //using stream and loop
        /*List<Integer> list = employees.stream().map(Employee::getSalary).toList();
        System.out.println(list);

        int totalSal = 0;
        for (int sal : list){
            totalSal += sal;
        }
        System.out.println("Total Salary Expense Of Company : "+totalSal);*/

        //using sum() (in stream)
        int totalSalary = employees.stream()
                .mapToInt(Employee::getSalary)
                .sum();
        System.out.println("Total Salary Expense Of Company : "+totalSalary);

        // using reduce()
        double total = employees.stream()
                .map(Employee::getSalary)
                .reduce(0, Integer::sum);
        System.out.println(total);

        //Using summarizingDouble()
        double sum = employees.stream()
                .collect(Collectors
                        .summarizingDouble(Employee::getSalary))
                .getSum();
        System.out.println("Total Salary Expense Of Company : "+sum);
    }

    public static void sortEmployeesByAgeThenSalary(List<Employee> employees){
        List<Employee> list = employees.stream().sorted(Comparator.comparingInt(Employee::getAge)).toList();
        System.out.println("sorted by age : "+list);
        list.stream().sorted(Comparator.comparingInt(Employee::getSalary)).forEach(System.out::println);

        //OR

        Stream<Employee> sorted = employees.stream()
                .sorted(Comparator
                        .comparingInt(Employee::getAge)
                        .thenComparingDouble(Employee::getSalary));
        sorted.forEach(System.out::println);
    }
    
    public static void getTop3HighestPaidEmployees(List<Employee> employees){
        List<Employee> list = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .toList();
        list.stream().forEach(System.out::println);
        list.stream().forEach(e -> System.out.println( e.getName()+" -> "+e.getSalary()));

        //if only name of employee
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .map(Employee::getName).forEach(System.out::println);
    }

    public static void convertListToMap(List<Employee> employees){
        /*Map<Integer, Employee> map = new HashMap<>();
        employees.stream().forEach(e -> map.put(e.getEmpid(), e));
        System.out.println(map);*/
        /*Map<Integer, Employee> empMap =
                employees.stream()
                        .collect(Collectors.toMap(
                                Employee::getEmpid,
                                e -> e
                        ));
        System.out.println(empMap);*/

        //
    }

    public static void findDuplicateMobileNumbers(List<Employee> employees){
        Map<Long, Long> collect = employees.stream().collect(Collectors.groupingBy(Employee::getMobileNo, Collectors.counting()));
        System.out.println(collect);

        List<Long> list = collect.entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).toList();
        System.out.println(list);
    }

    public static void groupEmployeesByAgeRange(List<Employee> employees){
        employees.stream().filter(e-> e.getAge()>28 && e.getAge()<45).forEach(System.out::println);

        employees.stream()
                .filter(e-> e.getAge()>28 && e.getAge()<45)
                .forEach(e-> System.out.println(e.getName()+" -> "+e.getAge()));
    }
}

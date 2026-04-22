package com.edupoly.collection;

public class Employee {
    private int empid;
    private String name;
    private String gender;
    private int age;
    private int salary;
    private long mobileNo;

    public Employee(int empid, String name, String gender, int age, int salary, long mobileNo) {
        this.empid = empid;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        this.mobileNo = mobileNo;
    }

    public String getName() {
        return name;
    }

    public int getEmpid() {
        return empid;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", mobileNo=" + mobileNo +
                '}';
    }
}

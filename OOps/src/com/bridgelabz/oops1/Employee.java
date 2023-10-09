package com.bridgelabz.oops1;



//   Write a Java program to create a class called "Employee" with instance variables "name," "salary," and "ID."
//        Include a method to calculate the employee's yearly salary and a method to print the employee's name and salary.
public class Employee {
    private String name;
    private int slaray;
    private int id;

    public Employee(String name, int slaray, int id) {
        this.name = name;
        this.slaray = slaray;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", slaray=" + slaray +
                ", id=" + id +
                ", Yearly Salary=" + (slaray*12) +
                '}';
    }

    public static void main(String[] args) {
        Employee e = new Employee("Sanket",100,1);
        System.out.println(e.toString());
    }
}

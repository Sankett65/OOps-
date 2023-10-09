package com.bridgelabz.oops1;

//        Write a Java program to create a class called "Student" with instance
//        variables "name," "age," and "ID." Include a method to print the name and age of the student.

public class Student {
    private  String name;
    private int age;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void print(Student student){
        System.out.println("Name is: "+this.getName());
        System.out.println("Age is: "+this.getAge());
        System.out.println("Id is: "+this.getId());
    }

    public static void main(String[] args) {
        Student s = new Student();
       s.setName("Sanket");
       s.setAge(22);
       s.setId(1);
       s.print(s);
//        Student s2 = new Student();
//        System.out.println();
//        s.setName("Swpnil");
//        s.setAge(20);
//        s.setId(11);
//        s.print(s2);
       // System.out.println(s.getName());

    }
}

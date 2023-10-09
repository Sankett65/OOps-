package com.bridgelabz.oops2;

public class Student {
     String name;
     int id;
    static int count;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
         count++;
    }
    public void print (){
        System.out.println("Name is: "+name);
        System.out.println("Id is : "+id);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Sanket",1);
        Student s2 = new Student("Rohit",2);
        Student s3 = new Student("Virat",14);
        Student s4 = new Student("Sachine",154);
        Student s5 = new Student("Sonu",12464);
        s1.print();
        System.out.println();
        s2.print();
        System.out.println();
        s3.print();
        System.out.println();
        s4.print();
        System.out.println();
        s5.print();
        System.out.println("\nCount is: "+Student.count);

    }

}

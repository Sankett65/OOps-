package com.bridgelabz.oops1;


//      Write a Java program to create a class called "Dog" with instance variables "breed," "age," and "weight."
//        Include a method to calculate the dog's age in human years and a method to print the dog's breed, age, and weight.
public class Dog {
    private String breed;
    private int age;
    private double weight;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String print() {
        return "Dog's breed='" + breed + '\'' +
                ",Dog's age=" + age +
                ",Dog's weight=" + weight ;
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.setBreed("Huskey");
        d.setAge(2);
        d.setWeight(34);
       String str= d.print();
        System.out.println(str);
    }
}

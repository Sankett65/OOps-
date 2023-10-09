package com.bridgelabz.oops1;


// Write a Java program to create a class called "Circle" with an instance variable "radius."
//        Include a method to calculate the area of the circle and a method to calculate the circumference of the circle.
public class Circle {
    double radius;

    public Circle() {
        this.radius = radius;
    }
}

class Operation extends Circle{
    public void calculateArea(double radius){
        double area = Math.PI*radius*radius;
        System.out.println("Area of Circle is : "+area);
    }
    public void calculateCircumference(double radius){
        double circumference = 2*Math.PI*radius;
        System.out.println("Area of Circle is : "+circumference);
    }

    public static void main(String[] args) {
        Operation obj = new Operation();
        obj.calculateArea(8.5);
        obj.calculateCircumference(5.5);
    }
}

package com.bridgelabz.oops3;

import com.bridgelabz.oops2.Utiity;



//       Java Program to Implement Shape Interface using Circle and Rectangle Class
//        Explanation:
//        Interfaces are syntactically similar to classes, but they lack instance variables,
//        and their methods are declared without any body. Here we make the interface as
//        Shape with two methods as input() and area()
//        which are implemented by further two classes as circle and rectangle who implements the interface Shape.
public interface Shape {
    abstract double input();
    void area();
}

class Circle implements Shape{

    @Override
    public  double input() {
        System.out.print("Enter the Radius: ");
        double radius= Utiity.scannerDouble();
        return radius;
    }

    @Override
    public void area() {
         double radius= input();
          double area = Math.PI*radius*radius;
        System.out.println("Area of Circle is : "+area);
    }
}

class Rectangle implements Shape{

    @Override
    public double input() {
        System.out.print("Enter a Length: ");
        double length=Utiity.scannerDouble();
        System.out.print("Enter a Width: ");
        double width = Utiity.scannerDouble();
        double area = length*width;
        return area;
    }

    @Override
    public void area() {
          double area = input();
        System.out.println("Area of Rectangle : "+area);
    }
}



class Main{
    public static void main(String[] args) {
        Shape s = new Circle();
        s.area();
        Shape s1 = new Rectangle();
        System.out.println();
        s1.area();
    }
}


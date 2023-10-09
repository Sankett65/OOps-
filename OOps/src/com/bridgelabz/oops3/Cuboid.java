package com.bridgelabz.oops3;


import com.bridgelabz.oops2.Utiity;

//        Java Program to Create a Method without Parameters and with Return Type
//        Explanation:
//        We have made a method to calculate the volume of a cuboid which takes
//        the dimensions length, breadth and height as input and returns the volume as output back to the main method.
public class Cuboid {
      public double volumeOfCuboid(){
          System.out.print("Enter the Length: ");
          double length = Utiity.scannerDouble();
          System.out.print("Enter the Breadth: ");
          double breadth = Utiity.scannerDouble();
          System.out.print("Enter the Height: ");
          double height = Utiity.scannerDouble();
          double volume= length*breadth*height;
          return volume;
      }

    public static void main(String[] args) {
        Cuboid c = new Cuboid();
        double ans = c.volumeOfCuboid();
        System.out.println("Volume of Cuboid is : "+ans);

    }
}

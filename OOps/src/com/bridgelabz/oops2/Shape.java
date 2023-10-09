package com.bridgelabz.oops2;

//3. Java Program to create an Area of triangle and rectangle and Passing and Returning Objects in Java
//        Explanation:
//        Enter length and breadth of the rectangle as input.
//        After that we create an object of that class and pass the reference variable to two different methods.
//        Now we calculate the area for two different objects and return them to the main method.
//        Hence we get two different areas as output.

public class Shape {
     private  int length;
      private int breadth;
      private int height;

    public Shape(int length, int breadth,int height) {
        this.length = length;
        this.breadth = breadth;
        this.height=height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

   static Shape s = new Shape(10,5,0);
   static Shape s1 = new Shape(10,5,4);


    public static void areaOfTrianglr(Shape s){
        int area = (s.getLength()*s.getBreadth())/2;
        System.out.println("Area Of a Triangle: "+area);
    }
    public static void areaOfRectangle(Shape s){
        int area = (s.getLength()*s.getBreadth());
        System.out.println("Area Of a Rectangle: "+area);
    }
    public static void areaOfCuboid(Shape s){
        if (s.getHeight()==0){
            System.out.println("Because Height is 0 it is Invalid");
        }else {
            int area = 2 * (s.getLength() * s.getBreadth() + s.getBreadth() * s.getHeight() + s.getHeight() * s.getLength());
            System.out.println("Area Of a Cuboid: " + area);
        }
        volume(s);
    }
    public static void volume(Shape s){
        if (s.getHeight()==0){
            System.out.println("Because Height is 0 it is Invalid");
        }else {
            int volume = s.getBreadth() * s.getLength() * s.getBreadth();
            System.out.println("Volume of Cuboid: " + volume);
        }
        perimeter(s);
    }
    public static void perimeter(Shape s ){
            if (s.getHeight() == 0) {
                System.out.println("Because Height is 0 it is Invalid");
            } else {

            int perimeter = 4 * (s.getLength() + s.getBreadth() + s.getHeight());
            System.out.println("Perimeter of Cuboid: " + perimeter);
        }
    }


    public static void main(String[] args) {
        areaOfCuboid(s);
        areaOfRectangle(s);
        areaOfTrianglr(s);
        System.out.println();
        areaOfCuboid(s1);
        areaOfRectangle(s1);
        areaOfTrianglr(s1);


    }

}




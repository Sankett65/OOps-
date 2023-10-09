package com.bridgelabz.oops2;


//        7. Java Program to Find Area of Square, Rectangle and Circle using Method Overloading
//        Explanation
//        This is a Java Program to Find Area of Square, Rectangle and Circle using Method Overloading.
//        We declare three methods of the same name but with different numbers of arguments or with different data types.
//        Now when we call these methods using objects, corresponding methods will be
//        called as per the number of arguments or their data types.
public class Shape2 {
   public void area(int side){
       double area = side*side;
       System.out.println("Area of Square is : "+area);
   }
    public void area(int width,int length){
       double area= width * length;
        System.out.println("Area of Rectangle is : "+area);
    }
    public void area(double radius){
       double area = Math.PI*radius*radius;
        System.out.println("Area of Circle is : "+area);
    }

    public void input(){
        System.out.print(
                "Option 1:- To get Area of Square" +
                "\nOption 2 :- To get Area of Rectangle" +
                "\nOption 3 :- To get Area Of Circle"+
                "\nEnter a option: ");
        int n = Utiity.scannerInt();
        switch (n){
            case 1:
                System.out.print("Enter a length of Side: ");
                int side=Utiity.scannerInt();
                area(side);
                break;
            case 2:
                System.out.print("Enter the Width: ");
                int width=Utiity.scannerInt();
                System.out.print("Enter the Length: ");
                int length=Utiity.scannerInt();
                area(width,length);
                break;
            case 3:
                System.out.print("Enter the Radius: ");
                double radius=Utiity.scannerDouble();
                area(radius);
                break;
        }
    }

    public static void main(String[] args) {
        Shape2 s = new Shape2();
        s.input();
    }
}

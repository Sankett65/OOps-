package com.bridgelabz.oops2;


//       1. Java Program to create a calculator and Return a Value from a Method.
//        Explanation:
//        We make a method named input which is used to get input from the user.
//        We also make a method named add which is used to perform addition and return the result back
//        to input method where we finally print the result.


public class Calculator {
    public static void main(String[] args) {
        input();

    }

    private static void input() {
        System.out.print("Enter first Number: ");
        int a =Utiity.scannerInt();
        System.out.print("Enter Second Number: ");
        int b =Utiity.scannerInt();
        System.out.println("Enter 1:-For addition" +
                "\nEnter 2:- For Substraction" +
                "\nEnter 3 :- For Multiplication" +
                "\nEnter 4 :- For Division");
        int check=Utiity.scannerInt();
        switch (check){
            case 1:
                int sum=add(a,b);
                System.out.println("Sum is: "+sum);
                break;
            case 2:
                int sum1=sub(a,b);
                System.out.println("Sum is: "+sum1);
                break;
            case 3:
                int sum2=mul(a,b);
                System.out.println("Sum is: "+sum2);
                break;
            case 4:
                int sum3=div(a,b);
                System.out.println("Sum is: "+sum3);
                break;
        }
    }

    private static int add(int a,int b) {
            return a+b;
    }
    private static int sub(int a,int b) {
        return a-b;
    }
    private static int mul(int a,int b) {
        return a*b;
    }
    private static int div(int a,int b) {
        return a/b;
    }
}

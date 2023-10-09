package com.bridgelabz.oops2;

public class MethodOverloadding {
    public static void main(String[] args) {
        System.out.print("Enter First Number: ");
        int a = Utiity.scannerInt();
        System.out.print("Enter Second Number: ");
        int b = Utiity.scannerInt();
        System.out.print("Enter Third Number: ");
        int c = Utiity.scannerInt();
        arthimatic(a);
        arthimatic(a,b);
        arthimatic(a,b,c);
    }

    private static void arthimatic(int a) {
        System.out.println("Sum is: "+(a+a));
    }

    private static void arthimatic(int a,int b) {
        System.out.println("Sum is: "+(a+b));
    }

    private static void arthimatic(int a,int b ,int c) {
        System.out.println("Sum is: "+(a+b+c));
    }


}

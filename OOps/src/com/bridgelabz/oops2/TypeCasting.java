package com.bridgelabz.oops2;


import java.util.Scanner;

//       5. Java Program to Calculate Sum of Two Byte Values using Type Casting
//        Explanation: This is a Java Program to Calculate Sum of Two Byte Values Using Type Casting.
//        Type casting in Java is to cast one type, a class or interface, into another type i.e. another class or interface.
//        Enter any two byte values as input.
//        After that we first convert these two bytes into integers using type casting and then we add those
//        values and get the desired output.
public class TypeCasting {
    public static void main(String[] args) {


        typecasting();
    }

    private static void typecasting() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        byte a = sc.nextByte();
        System.out.print("Enter a Number: ");
        byte b = sc.nextByte();

        int c = (int)a+(int)b;
        System.out.println("Sum is: "+c);
    }
}

package com.bridgelabz.oops2;

import java.util.Scanner;

public class Utiity {

    public static String scannerString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        return str;
    }

    public static int scannerInt() {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the Number: ");
        int x = sc.nextInt();
        return x;
    }

    public static char scannerChar() {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the Charater: ");
        char x = sc.nextLine().charAt(0);
        return x;
    }

    public static double scannerDouble() {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the Number: ");
        double x = sc.nextDouble();
        return x;
    }
}


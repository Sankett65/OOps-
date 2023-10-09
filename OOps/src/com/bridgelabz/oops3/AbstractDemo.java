package com.bridgelabz.oops3;

import com.bridgelabz.oops2.Utiity;

abstract public class AbstractDemo {
     abstract public void add(int a,int b);
     abstract public void sub(int a,int b);
     abstract public void mul(int a,int b);
     abstract public void div(int a,int b);
}


class Calculator extends AbstractDemo{

    @Override
    public void add(int a, int b) {
        System.out.println("Addition of "+a+" & "+b+" is: "+(a+b));
    }

    @Override
    public void sub(int a, int b) {
        System.out.println("Substraction of "+a+" & "+b+" is: "+(a-b));
    }

    @Override
    public void mul(int a, int b) {
        System.out.println("Multiplication of "+a+" & "+b+" is: "+(a*b));
    }

    @Override
    public void div(int a, int b) {
        System.out.println("Division of "+a+" & "+b+" is: "+(a/b));
    }

    public static void main(String[] args) {
        Calculator c= new Calculator();
        System.out.print("Enter  a Number: ");
        int a = Utiity.scannerInt();
        System.out.print("Enter a Number: ");
        int b = Utiity.scannerInt();
        c.add(a,b);
       c.sub(a,b);
        c.mul(a,b);
        c.div(a,b);
    }
}


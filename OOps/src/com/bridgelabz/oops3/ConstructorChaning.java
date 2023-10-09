package com.bridgelabz.oops3;

public class ConstructorChaning {
    ConstructorChaning(){
        this(20);
        System.out.println("This is Default Constructor");
    }

    ConstructorChaning(int x){
        System.out.println(x);
        System.out.println("This is One paramaterized Constructor");
    }

    ConstructorChaning(int x,int y){
        this();
        System.out.println("The value of x is: "+x);
        System.out.println("The value of y is: "+y);
        System.out.println("Sum of x and y is: "+(x+y));
    }

    public static void main(String[] args) {
        ConstructorChaning c = new ConstructorChaning(11,12);
    }



}

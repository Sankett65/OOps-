package com.bridgelabz.oops3;

public class OuterClass {
    int a= 10;
    int b = 20;

    static class Innerclass{
        int a = 1;
        int b = 2;
        public  void show(int a,int b){
            System.out.println("Sum is: "+(a+b));
        }
    }
}


class TestMain{
    public static void main(String[] args) {
        OuterClass o = new OuterClass();
        System.out.println("a="+o.a+" b="+o.b+" this variable are from Outerclass");

        OuterClass.Innerclass i = new OuterClass.Innerclass();
        System.out.println("a="+i.a+" b="+i.b+" this variable are from Innerclass");
        i.show(1,2);
    }
}
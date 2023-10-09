package com.bridgelabz.oops3;


class Superclass {
    String str;
    public Superclass(String str) {
        this.str = str;
    }

    public void displaySuperString() {
        System.out.println(str);
    }
}
class Subclass extends Superclass {
    String str2;
    public Subclass(String str1, String str2) {
        super(str1);
        this.str2 = str2;
    }
    public void printSubString() {
        System.out.println(str2);
    }
}

 class MainTest {
    public static void main(String[] args) {
        Subclass subObj = new Subclass("String from Superclass", "String from Subclass");
        subObj.displaySuperString();
        subObj.printSubString();
    }
}

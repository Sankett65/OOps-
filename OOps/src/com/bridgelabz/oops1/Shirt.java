package com.bridgelabz.oops1;


//    Write a Java program to create a class called "Shirt" with instance variables "size," "color," and "price."
//        Include a method to calculate the discount on the shirt with instance variables "size," "color," and "price."
//        Include a method to calculate the discount on the shirt based on  its
//        size and a method to print the shirt's size, color, and discounted price

import java.util.Random;

interface Type{

    void discount(String size);

    void print();
}
public class Shirt implements Type {
    private String size;
    private String color;
    private int price;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void discount(String size) {
        Random r = new Random();
        int a = r.nextInt(1,9);
        int [] arr ={5,10,15,20,25,30,35,40};
        if (size=="S"){
            System.out.println("Because your Size is "+size+" you got "+arr[a]+"% discouunt");
            int discountValue=price-(price*arr[a]/100);
            System.out.println("Price after getting Discount is : "+discountValue);
        }else if (size=="M"){
            System.out.println("Because your Size is  "+size+" you got "+arr[a]+"% discouunt");
            int discountValue=price-(price*arr[a]/100);
            System.out.println("Price after getting Discount is : "+discountValue);
        }else if (size=="L"){
            System.out.println("Because your Size is  "+size+" you got "+arr[a]+"% discouunt");
            int discountValue=price-(price*arr[a]/100);
            System.out.println("Price after getting Discount is : "+discountValue);
        }else if (size=="Xl"){
            System.out.println("Because your Size is  "+size+" you got "+arr[a]+"% discouunt");
            int discountValue=price-(price*arr[a]/100);
            System.out.println("Price after getting Discount is : "+discountValue);
        }else if (size=="XXL"){
            System.out.println("Because your Size is  "+size+" you got "+arr[a]+"% discouunt");
            int discountValue=price-(price*arr[a]/100);
            System.out.println("Price after getting Discount is : "+discountValue);
        }
    }

    @Override
    public void print() {
        System.out.println("Shirt Size is: "+size);
        System.out.println("Shirt Color is: "+color);
        System.out.println("Shirt Price is: "+price);
    }

    public static void main(String[] args) {
        Shirt s = new Shirt();
        s.setSize("S");
        s.setColor("Blue");
        s.setPrice(200);
        s.print();
        s.discount(s.size);
    }
}

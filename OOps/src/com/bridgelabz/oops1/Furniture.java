package com.bridgelabz.oops1;


import java.util.Random;

//   Write a Java program to create a class called "Furniture" with instance variables "type," "material," and "price."
//        Include a method to calculate the discount on the furniture based on its material and a method
//        to print the furniture's type, material, and discounted price.
public class Furniture {
    private String type;
    private String material;
    private int price;

    public Furniture(String type, String material, int price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void dicount(){
        Random r = new Random();
        int n = r.nextInt(0,8);
        int [] arr ={5,10,15,20,25,30,35,40};
        if (material=="Wood"){
            System.out.println("Because your material is "+material+" you got "+arr[n]+"% discouunt");
            int discountValue=price-(price*arr[n]/100);
            System.out.println("Price after discount is: "+discountValue);
        }else if (material=="Glass"){
            System.out.println("Because your material is "+material+" you got "+arr[n]+"% discouunt");
            int discountValue=price-(price*arr[n]/100);
            System.out.println("Price after discount is: "+discountValue);
        }else if (material=="Stainless Steel"){
            System.out.println("Because your material is "+material+" you got "+arr[n]+"% discouunt");
            int discountValue=price-(price*arr[n]/100);
            System.out.println("Price after discount is: "+discountValue);
        } else if (material=="Cane") {
            System.out.println("Because your material is "+material+" you got "+arr[n]+"% discouunt");
            int discountValue=price-(price*arr[n]/100);
            System.out.println("Price after discount is: "+discountValue);
        }
    }

    public void print(){
        System.out.println("Type of Furniture is : "+type);
        System.out.println("Material of Furniture is : "+material);
        System.out.println("Price of Furniture is : "+price);
    }

    public static void main(String[] args) {
        Furniture f1 = new Furniture("Chair","Cane",2000);
        f1.print();
        f1.dicount();
    }
}

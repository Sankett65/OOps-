package com.bridgelabz.oops1;



// Write a Java program to create a class called "TV" with instance variables "brand," "size," and "price."
//        Include a method to calculate the discount on the TV based on its size
//        and a method to print the TV's brand, size, and discounted price.
public class Tv {
    private String brand;
    private double size;
    private double price;

    public Tv(String brand, double size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void discount(int size){
        if (size>34 && size<=40){
            System.out.println("Discount you get is 10% for size between 34-40");
            double discountvalue=price-(price*10/100);
            System.out.println("Price after geting discout is : "+discountvalue);
           // double finalvalue=price-discountvalue;
        } else if (size>40 && size<=50) {
            System.out.println("Discount you get is 20% for size between 40-50");
            double discountvalue=price-(price*20/100);
            System.out.println("Price after geting discout is : "+discountvalue);

        }else if (size>50 && size<=60) {
            System.out.println("Discount you get is 30% for size between 50-60");
            double discountvalue=price-(price*30/100);
            System.out.println("Price after geting discout is : "+discountvalue);

        }else if (size>60 && size<=70) {
            System.out.println("Discount you get is 34% for size between 60-70");
            double discountvalue=price-(price*35/100);
            System.out.println("Price after geting discout is : "+discountvalue);

        }
    }

    public void print(){
        System.out.println("Brand is : "+brand);
        System.out.println("Size is : "+size);
        System.out.println("Price is : "+price);
    }

    public static void main(String[] args) {
        Tv t = new Tv("Samsung",37,20000);
        Tv t1 = new Tv("Mi Tv",45,23000);
        Tv t2 = new Tv("Vise",59,37000);
        Tv t3 = new Tv("Lg",79,60000);
        t.print();
        t.discount((int) t.size);
        System.out.println();
        t1.print();
        t1.discount((int) t.size);
        System.out.println();
        t2.print();
        t2.discount((int) t.size);
        System.out.println();
        t3.print();
        t3.discount((int) t.size);
    }
}

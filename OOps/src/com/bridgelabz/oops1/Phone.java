package com.bridgelabz.oops1;



//      Write a Java program to create a class called "Phone" with instance variables "make," "model," and "storage."
//        Include a method to calculate the price of the phone based on the make, model,
//        and storage capacity and a method to print the phone's make, model, and storage capacity.
public class Phone {


    private String make;
    private String model;
    private int storage;
    private int price;


    public Phone(String make, String model, int storage) {
        this.make = make;
        this.model = model;
        this.storage = storage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }


    public void priceOfPhone() {
        if (getStorage() == 64) {
            setPrice(10000);
            System.out.println("Price Of phone: "+price);
        } else if (getStorage() == 128) {
            setPrice(30000);
            System.out.println("Price Of phone: "+price);

        } else if (getStorage() == 256) {
            setPrice(50000);
            System.out.println("Price Of phone: "+price);
        }
    }


    public void print() {
        System.out.println("Making Of phone: "+make);
        System.out.println("Model Of phone: "+model);
        System.out.println("Storage Of a phone: "+storage);
     //   System.out.println("Price Of phone: "+getPrice());
    }

    public static void main(String[] args) {
        Phone obj = new Phone("India","Apple",64);
        Phone obj1 = new Phone("India","Apple",128);
        Phone obj2 = new Phone("India","Apple",256);
        obj.print();
        obj.priceOfPhone();
        System.out.println();
        obj1.print();
        obj1.priceOfPhone();
        System.out.println();
        obj2.print();
        obj2.priceOfPhone();
    }
}

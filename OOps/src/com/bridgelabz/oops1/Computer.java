package com.bridgelabz.oops1;


// Write a Java program to create a class called "Computer" with instance variables "processor," "RAM," and "storage."
//        Include a method to calculate the price of the computer based on the
//        processor, RAM, and storage capacity and a method to print the computer's processor, RAM, and storage capacity.
public class Computer {
    private String processor;
    private int ram;
    private int storage;

    public Computer(String processor, int ram, int storage) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void price(String processor,int ram,int storage) {
    if (getProcessor()=="i5" && getRam()<7 && getStorage()<=64){
        int price = 8000 * ram+storage;
        System.out.println("Price is: "+price);
    } else if (processor=="i5" && ram<13 && storage<=128){
        int price = 9000 * ram+storage;
        System.out.println("Price is: "+price);
    }else if (processor=="i6" && ram<7 && storage<=64){
        int price = 8250 * ram+storage;
        System.out.println("Price is: "+price);
    }else if (processor=="i6" && ram<13 && storage<=128){
        int price = 8500 * ram+storage;
        System.out.println("Price is: "+price);
    }else if (processor=="i6" &&  ram<16 && storage<=256){
        int price = 8800 * ram+storage;
        System.out.println("Price is: "+price);
    }

    }

    public void print(){
        System.out.println("Processer is : "+processor);
        System.out.println("Ram is : "+ram);
        System.out.println("Storage is : "+storage);
    }

    public static void main(String[] args) {
        Computer c = new Computer("i5",4,64);
        Computer c1 = new Computer("i6",4,64);
        Computer c2 = new Computer("i5",8,128);
        Computer c3 = new Computer("i6",8,128);
   c.print();
   c.price(c.processor,c.ram,c.storage);
        System.out.println();

   c1.print();
   c1.price(c1.processor,c1.ram,c1.storage);
        System.out.println();

        c2.print();
        c2.price(c2.processor,c2.ram,c2.storage);
        System.out.println();

        c3.print();
        c3.price(c3.processor,c3.ram,c3.storage);
        System.out.println();

    }
}

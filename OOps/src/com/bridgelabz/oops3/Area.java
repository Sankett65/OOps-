package com.bridgelabz.oops3;

import com.bridgelabz.oops2.Utiity;

public class Area {
    public void areaRectangle(double len,double bre){
        double area = len*bre;
        System.out.println("Area of Reactangle is : "+area);
    }

    public static void main(String[] args) {
        Area a = new Area();
        System.out.print("Enter the length: ");
        double x = Utiity.scannerDouble();
        System.out.print("Enter the Breadth: ");
        double y = Utiity.scannerDouble();
        a.areaRectangle(x,y);
    }
}

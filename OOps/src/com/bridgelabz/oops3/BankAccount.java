package com.bridgelabz.oops3;


//        Java Program to Create a class Bank Account and the Inner Class Interest in it
//        Explanation
//        We declare the Outer class as BankAcct and the inner class as Interest.
//        Now we use the variables declared in the outer class to get the output in the inner class.
public class BankAccount {
    private double principal;
    private double rateOfInterest;
    private int year;

    public BankAccount(double principal, double rateOfInterest, int year) {
        this.principal = principal;
        this.rateOfInterest = rateOfInterest/100;
        this.year = year;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest() {
        this.rateOfInterest = rateOfInterest;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    static class Interest{
        public  void interest(BankAccount bankAccount){
            double interest= (bankAccount.getPrincipal()*bankAccount.getRateOfInterest()*bankAccount.getYear())/100;
            System.out.println("Interest is : "+interest);
        }
    }
}

class MainTesting{
    public static void main(String[] args) {
        BankAccount b = new BankAccount(20000,5.5,2);
        BankAccount.Interest obj = new BankAccount.Interest();
        obj.interest(b);

    }

}

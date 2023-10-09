package com.bridgelabz.oops1;


//    Write a Java program to create a class called "BankAccount" with instance variables "balance" and "accountNumber."
//        Include a method to deposit money into the account and a method to withdraw money from the account.

interface Bank{
    abstract void withdaaw(int withdraw);
    abstract void deposit(int deposit);

}
public class BankAccount implements Bank {
    int balance;
    int accounNumber;

    public BankAccount(int balance, int accounNumber) {
        this.balance = balance;
        this.accounNumber = accounNumber;
    }

    @Override
    public void withdaaw(int withdraw) {
        if (balance < withdraw) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - withdraw;
            System.out.println("Balance After Withdrawing the amount "+withdraw+" is: "+balance);
        }
    }

    @Override
    public void deposit(int deposit) {
    balance = balance+deposit;
        System.out.println("Balance After deposition amount "+deposit+" is: "+balance);
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000,12345);
        bankAccount.deposit(1000);
        bankAccount.withdaaw(1000);
    }
}

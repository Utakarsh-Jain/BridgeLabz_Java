

/*
Bank Account Management
Create a BankAccount class with:
accountNumber (public).
accountHolder (protected).
balance (private).
Write methods to:
Access and modify balance using public methods.
Create a subclass SavingsAccount to demonstrate access to accountNumber and accountHolder.
Name : Utakarsh Jain
Date : 30/09/2026

*/


package main.java.JavaConstructor.AccessModifiers;

import java.util.Scanner;

class Bank {
    public long accountNumber;
    protected String accountHolder;
    private double balance;

    Bank(long accountNumber, String accountHolder, double balance) { // Parameterized Constructor
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public double getBalance() { // Public method to get the balance
        return balance;
    }
    public void setBalance(double balance) { // Public method to set the balance
        this.balance = balance;
    }
}
class SavingsAccount extends Bank { // Subclass of Bank
    SavingsAccount(long accountNumber, String accountHolder, double balance) { // Parameterized Constructor
        super(accountNumber, accountHolder, balance); // Calls the constructor of the superclass
    }
}

public class BankAccountManagement
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account number:");
        long accountNumber = sc.nextLong();
        System.out.println("Enter the account holder name:");
        String accountHolder = sc.next();
        System.out.println("Enter the balance:");
        double balance = sc.nextDouble();
        Bank bank = new Bank(accountNumber, accountHolder, balance);
        System.out.println("Account Number: " + bank.accountNumber);
        System.out.println("Account Holder: " + bank.accountHolder);
        System.out.println("Balance: " + bank.getBalance());
        bank.setBalance(2000);
        System.out.println("Balance: " + bank.getBalance());

        System.out.println("Enter the account number:");
        long accountNumber1 = sc.nextLong();
        System.out.println("Enter the account holder name:");
        String accountHolder1 = sc.next();
        System.out.println("Enter the balance:");
        double balance1 = sc.nextDouble();
        SavingsAccount savingsAccount = new SavingsAccount(accountNumber1, accountHolder1, balance1);
        System.out.println("Account Number: " + savingsAccount.accountNumber);
        System.out.println("Account Holder: " + savingsAccount.accountHolder);
        System.out.println("Balance: " + savingsAccount.getBalance());
        savingsAccount.setBalance(2000);
        System.out.println("Balance: " + savingsAccount.getBalance());
        sc.close();
    }
}

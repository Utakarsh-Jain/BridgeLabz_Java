/*
Problem No : 1
Create a BankAccount class with the following features:
Static:
A static variable bankName shared across all accounts.
A static method getTotalAccounts() to display the total number of accounts.
This:
Use this to resolve ambiguity in the constructor when initializing accountHolderName and accountNumber.
Final:
Use a final variable accountNumber to ensure it cannot be changed once assigned.
Instanceof:
Check if an account object is an instance of the BankAccount class before displaying its details.
Name : Utakarsh Jain
Date : 30/09/2026
*/

import java.util.Scanner;

class BankAccount {
    static String bankName = "State Bank of India"; //Static variable
    static int totalAccounts = 0; //Static variable
    String accountHolderName; //Instance variable
    final long accountNumber; //Final variable
    double balance; //Instance variable
    BankAccount(String accountHolderName, long accountNumber, double balance) { //Parameterized Constructor
        this.accountHolderName = accountHolderName; //Using 'this' keyword to resolve ambiguity
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++; //Incrementing the total number of accounts
    }
    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts); //Displaying the total number of accounts
    }
    void displayDetails() {
        System.out.println("Bank Name: " + bankName); //Displaying the bank name
        System.out.println("Account Holder: " + accountHolderName); //Displaying the account holder name
        System.out.println("Account Number: " + accountNumber); //Displaying the account number
        System.out.println("Balance: " + balance);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Details: ");
        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = sc.nextLine();
        System.out.print("Enter Account Number: ");
        long accountNumber = sc.nextLong();
        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();
        BankAccount account1 = new BankAccount(accountHolderName, accountNumber, balance);
        
        if (account1 instanceof BankAccount) { //Checking if the object is an instance of BankAccount class
            account1.displayDetails();
        }
        System.out.println(); //Printing a blank line
        BankAccount.getTotalAccounts();
        sc.close();
    }
}
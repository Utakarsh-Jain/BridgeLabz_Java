/*
Problem 2 : Java Class And Object Level 2
Program to Simulate an ATM
Problem Statement: Create a BankAccount class with attributes accountHolder, accountNumber, and balance. Add methods for:
Depositing money.
Withdrawing money (only if sufficient balance exists).
Displaying the current balance.
Name: Utakarsh Jain
Date : 29/09/2026
*/
import java.util.Scanner;
class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;
    void deposit(double amount) { //Method to deposit money into the account
        balance += amount; 
        System.out.println("Amount deposited successfully. Current balance: " + balance);
    }
    void withdraw(double amount) { //Method to withdraw money from the account
        if (amount > balance) { //Checking if the amount to be withdrawn is less than the balance
            System.out.println("Insufficient balance. Current balance: " + balance);
        } else { //If the amount to be withdrawn is greater than the balance
            balance -= amount; //Subtracting the amount to be withdrawn from the balance
            System.out.println("Amount withdrawn successfully. Current balance: " + balance);
        }
    }
    void displayBalance() { //Method to display the balance
        System.out.println("Current balance: " + balance); //Printing the balance
    }
}
public class ATM {
    public static void main(String args[]) { //Main method to test the class
        BankAccount b = new BankAccount();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the account holder name: ");
        b.accountHolder = sc.nextLine();
        System.out.print("Enter the account number: ");
        b.accountNumber = sc.nextInt();
        System.out.print("Enter the balance: ");
        b.balance = sc.nextDouble(); 
        b.deposit(10000);
        b.withdraw(5000);
        b.displayBalance();
        sc.close();
    }
}

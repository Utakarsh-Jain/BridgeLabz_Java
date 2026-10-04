/*

Sample Problem 1: Bank Account Types
Description: Model a banking system with different account types using hierarchical inheritance. BankAccount is the superclass, with SavingsAccount, CheckingAccount, and FixedDepositAccount as subclasses.
Tasks:
Define a base class BankAccount with attributes like accountNumber and balance.
Define subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount, each with unique attributes like interestRate for SavingsAccount and withdrawalLimit for CheckingAccount.
Implement a method displayAccountType() in each subclass to specify the account type.
Goal: Explore hierarchical inheritance, demonstrating how each subclass can have unique attributes while inheriting from a shared superclass.
Name : Utakarsh Jain
Date : 3/10/2026
*/


package main.java.Inheritance.HierarchicalInheritance;
class BankAccount{ //Base class
    int accountNumber;
    double balance;
    BankAccount(int accountNumber , double balance){ //Parameterized constructor for BankAccount
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void displayDetails(){ //Method to display BankAccount details
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
class SavingsAccount extends BankAccount{ //Child class
    double interestRate;
    SavingsAccount(int accountNumber , double balance , double interestRate){ //Parameterized constructor for SavingsAccount
        super(accountNumber, balance); //call to the parent class
        this.interestRate = interestRate;
    }
    void displayDetails(){ //Method to display SavingsAccount details
        super.displayDetails(); //call to the parent class method
        System.out.println("Interest Rate: " + interestRate);
    }
}
class CheckingAccount extends BankAccount{ //Child class
    double withdrawalLimit;
    CheckingAccount(int accountNumber , double balance , double withdrawalLimit){ //Parameterized constructor for CheckingAccount
        super(accountNumber, balance); //call to the parent class
        this.withdrawalLimit = withdrawalLimit;
    }
    void displayDetails(){ //Method to display CheckingAccount details
        super.displayDetails(); //call to the parent class method
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}
class FixedDepositAccount extends BankAccount{ //Child class
    double fixedDepositAmount;
    int tenure;
    FixedDepositAccount(int accountNumber , double balance , double fixedDepositAmount , int tenure){ //Parameterized constructor for FixedDepositAccount
        super(accountNumber, balance); //call to the parent class
        this.fixedDepositAmount = fixedDepositAmount;
        this.tenure = tenure;
    }
    void displayDetails(){ //Method to display FixedDepositAccount details
        super.displayDetails(); //call to the parent class method
        System.out.println("Fixed Deposit Amount: " + fixedDepositAmount);
        System.out.println("Tenure: " + tenure);
    }
}
public class BankAccountType { //Main class for execution
    public static void main(String[] args) { //Main method
        SavingsAccount savingsAccount = new SavingsAccount(1, 1000, 5); //Creating an object of SavingsAccount class
        CheckingAccount checkingAccount = new CheckingAccount(2, 1000, 500); //Creating an object of CheckingAccount class
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount(3, 1000, 10000, 1); //Creating an object of FixedDepositAccount class
        savingsAccount.displayDetails(); //Displaying the account details
        checkingAccount.displayDetails(); //Displaying the account details
        fixedDepositAccount.displayDetails(); //Displaying the account details
    }
}

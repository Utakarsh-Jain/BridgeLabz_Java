
/*

Banking System
Description: Create a banking system with different account types:
Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
Add methods like deposit(double amount) and withdraw(double amount) (concrete) and calculateInterest() (abstract).
Implement subclasses SavingsAccount and CurrentAccount with unique interest calculations.
Create an interface Loanable with methods applyForLoan() and calculateLoanEligibility().
Use encapsulation to secure account details and restrict unauthorized access.
Demonstrate polymorphism by processing different account types and calculating interest dynamically.
Name: Utakarsh Jain
Date: 3/10/2026
*/


package main.java.EncapsulationPolymorphismAbstractionInterfaces;
import java.util.ArrayList;
// Interface defines loan-related behavior
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility(double amount);
}
// Abstract class provides common account functionality
abstract class BankAccount {
    // Private fields protect account information
    private String accountNumber;
    private String holderName;
    private double balance;
    public BankAccount(String accountNumber, String holderName, double balance) { //Parameterized constructor for BankAccount
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public String getAccountNumber() { //Method to get account number
        return accountNumber;
    }
    public String getHolderName() { //Method to get holder name
        return holderName;
    }
    public double getBalance() { //Method to get balance
        return balance;
    }

    // Concrete method shared by all account types
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: " + amount);
        }
    }

    public void withdraw(double amount) { //Method to withdraw amount
        if (amount > 0 && amount <= balance) { //Check if amount is valid
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal.");
        }
    }

    // Interest calculation differs for each account type
    public abstract double calculateInterest();

    public void displayDetails() { //Method to display account details
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount implements Loanable { //SavingsAccount class extending BankAccount and implementing Loanable
    public SavingsAccount(String accountNumber, String holderName, double balance) { //Parameterized constructor for SavingsAccount
        super(accountNumber, holderName, balance); //call to the parent class
    }

    @Override
    public double calculateInterest() { //Method to calculate interest
        return getBalance() * 0.05;
    }

    @Override
    public void applyForLoan(double amount) { //Method to apply for loan
        if (calculateLoanEligibility(amount)) {
            System.out.println("Savings account loan approved.");
        } else {
            System.out.println("Loan not approved.");
        }
    }

    @Override
    public boolean calculateLoanEligibility(double amount) { //Method to check loan eligibility
        return amount <= getBalance() * 5;
    }
}

class CurrentAccount extends BankAccount implements Loanable { //CurrentAccount class extending BankAccount and implementing Loanable
    public CurrentAccount(String accountNumber, String holderName, double balance) { //Parameterized constructor for CurrentAccount
        super(accountNumber, holderName, balance); //call to the parent class
    }

    @Override
    public double calculateInterest() { //Method to calculate interest
        return getBalance() * 0.02;
    }

    @Override
    public void applyForLoan(double amount) { //Method to apply for loan
        if (calculateLoanEligibility(amount)) {
            System.out.println("Current account loan approved.");
        } else {
            System.out.println("Loan not approved.");
        }
    }

    @Override
    public boolean calculateLoanEligibility(double amount) { //Method to check loan eligibility
        return amount <= getBalance() * 10;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        // Parent reference stores different account types
        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("S101", "Rahul", 50000));
        accounts.add(new CurrentAccount("C101", "Aman", 100000));

        for (BankAccount account : accounts) {
            account.displayDetails();

            // Runtime polymorphism calls correct interest method
            System.out.println("Interest: " + account.calculateInterest());

            account.deposit(5000);
            account.withdraw(2000);

            System.out.println("Updated Balance: " + account.getBalance());

            if (account instanceof Loanable) {
                Loanable loanableAccount = (Loanable) account;
                loanableAccount.applyForLoan(100000);
            }
            System.out.println();
        }
    }
}
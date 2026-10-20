/*
Bank Transaction System (Checked + Custom Exception)
Problem Statement:
Develop a Bank Account System where:
withdraw(double amount) method:
Throws InsufficientBalanceException if withdrawal amount exceeds balance.
Throws IllegalArgumentException if the amount is negative.
Handle exceptions in main().
Expected Behavior:
If valid, print "Withdrawal successful, new balance: X".
If balance is insufficient, throw and handle "Insufficient balance!".
If the amount is negative, throw and handle "Invalid amount!".
Name: Utakarsh Jain
Date: 19/10/2026
*/
package main.java.ExceptionHandling;

// Custom Exception Class
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Bank Account Class
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Method to withdraw money with exception handling
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount: Amount cannot be negative");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance: Cannot withdraw more than balance");
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

// Main Class
public class BankTransaction {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(10000);

        // Test case 1: Valid withdrawal
        try {
            account.withdraw(2000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        // Test case 2: Insufficient balance
        try {
            account.withdraw(10000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        // Test case 3: Negative amount
        try {
            account.withdraw(-500);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}

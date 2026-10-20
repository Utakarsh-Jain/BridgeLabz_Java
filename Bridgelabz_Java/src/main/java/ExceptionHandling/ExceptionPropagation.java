
/*
throw vs. throws (Exception Propagation)
Problem Statement:
Create a method calculateInterest(double amount, double rate, int years) that:
Throws IllegalArgumentException if amount or rate is negative.
Propagates the exception using throws and handles it in main().
Expected Behavior:
If valid, return and print the calculated interest.
If invalid, catch and display "Invalid input: Amount and rate must be positive".
Name: Utakarsh Jain
Date: 19/10/2026
*/

package main.java.ExceptionHandling;
public class ExceptionPropagation {
    public static void main(String[] args) {
        try {
            double interest = calculateInterest(1000, 0.05, 2); //calculating the interest
            System.out.println("Calculated Interest: " + interest);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive"); //printing the error message
        }
    }
    public static double calculateInterest(double amount, double rate, int years)
        throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be positive"); //throwing the exception
        }
        return amount * rate * years; //returning the interest
    }
}

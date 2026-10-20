/*
Nested try-catch Block
Problem Statement:
Write a Java program that:
Takes an array and a divisor as input.
Tries to access an element at an index.
Tries to divide that element by the divisor.
Uses nested try-catch to handle:
ArrayIndexOutOfBoundsException if the index is invalid.
ArithmeticException if the divisor is zero.
Expected Behavior:
If valid, print the division result.
If the index is invalid, catch and display "Invalid array index!".
If division by zero, catch and display "Cannot divide by zero!".
Name: Utakarsh Jain
Date: 19/10/2026
*/
package main.java.ExceptionHandling;

public class NestedTryCatch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        try {
            // Outer try-catch
            int index = 3; // Change to 0, 1, or 2 to test
            System.out.println("Accessing index: " + index);

            try {
                // Inner try-catch for division
                int divisor = 0; // Change to 2 or 5 to test
                int result = arr[index] / divisor;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero"); //printing the error message
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!"); //printing the error message
        }
    }
}

/*
Problem Statement 2: Rethrowing Exceptions
Problem:
Create a method that processes a division operation. Implement the following:
1. Define a method performDivision(int numerator, int denominator) that
performs division and throws an ArithmeticException if the denominator is zero.
2. Define another method calculate(int numerator, int denominator) that
calls performDivision and rethrows the ArithmeticException with additional
context.
3. In the main method, handle the rethrown exception and provide a meaningful error
message to the user.
Name: Utakarsh Jain
Date: 19/10/2026
*/
package main.java.ExceptionHandling;

public class RethrowingException {
    // Method 1
public static int performDivision(int numerator, int denominator)
        throws ArithmeticException {

    if (denominator == 0) {
        throw new ArithmeticException("Denominator cannot be zero"); //throwing the exception
    }

    return numerator / denominator; //returning the result
}

// Method 2 – rethrows exception
public static int calculate(int numerator, int denominator)
        throws ArithmeticException {

    try {
        return performDivision(numerator, denominator); //performing the division

    } catch (ArithmeticException e) {

        System.out.println("Error in calculate() method"); //printing the error message
        throw e; // rethrow with additional context
    }
}

public static void main(String[] args) {

    try {
        int result = calculate(10, 0);
        System.out.println("Result = " + result);

    } catch (ArithmeticException e) {

        System.out.println("Caught in main: " + e.getMessage());
    }
}
}

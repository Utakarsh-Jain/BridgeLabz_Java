/*
finally Block Execution
Problem Statement:
Write a program that performs integer division and demonstrates the finally block execution.
The program should:
Take two integers from the user.
Perform division.
Handle ArithmeticException (if dividing by zero).
Ensure "Operation completed" is always printed using finally.
Expected Behavior:
If valid, print the result.
If an exception occurs, handle it and still print "Operation completed".
Name: Utakarsh Jain
Date: 19/10/2026
*/

package main.java.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int num = sc.nextInt(); //takes the numerator

            System.out.print("Enter denominator: ");
            int den = sc.nextInt(); //takes the denominator

            int result = num / den; //performing the division
            System.out.println("Result: " + result); //printing the result

        } catch (InputMismatchException e) {
            System.out.println("Please enter valid integers"); //printing the error message
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero"); //printing the error message
        } finally {
            sc.close(); //closing the scanner
            System.out.println("Operation completed"); //printing the completion message
        }
    }
}

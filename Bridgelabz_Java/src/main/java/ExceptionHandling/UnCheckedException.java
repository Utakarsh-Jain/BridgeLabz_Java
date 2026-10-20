/*
Unchecked Exception (Runtime Exception)
Problem Statement:
Write a Java program that asks the user to enter two numbers and divides them. Handle possible exceptions such as:
ArithmeticException if division by zero occurs.
InputMismatchException if the user enters a non-numeric value.
Expected Behavior:
If the user enters valid numbers, print the result of the division.
If the user enters 0 as the denominator, catch and handle ArithmeticException.
If the user enters a non-numeric value, catch and handle InputMismatchException.

Name: Utakarsh Jain
Date: 19/10/2026
*/

package main.java.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UnCheckedException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //creating a scanner to take input from the user

        try {
            System.out.print("Enter the first number: "); //asking the user to enter the first number
            int num1 = scanner.nextInt(); //taking the first number

            System.out.print("Enter the second number: "); //asking the user to enter the second number
            int num2 = scanner.nextInt(); //taking the second number

            int result = num1 / num2; //dividing the first number by the second number
            System.out.println("The result of division is: " + result); //printing the result
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero. Please enter a non-zero denominator."); //handling the arithmetic exception
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid integers."); //handling the input mismatch exception
        } finally {
            scanner.close(); //closing the scanner
        }
    }
}

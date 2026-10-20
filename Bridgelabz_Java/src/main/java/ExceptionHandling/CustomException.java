/*
Custom Exception (User-defined Exception)
Problem Statement:
Create a custom exception called InvalidAgeException.
Write a method validateAge(int age) that throws InvalidAgeException if the age is below 18.
In main(), take user input and call validateAge().
If an exception occurs, display "Age must be 18 or above".
Expected Behavior:
If the age is >=18, print "Access granted!".
If age <18, throw InvalidAgeException and display the message.
Name: Utakarsh Jain
Date: 19/10/2026
*/
package main.java.ExceptionHandling;

public class CustomException {
    public static void main(String[] args) {
        try {
            validateAge(20); //validating the age
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage()); //printing the error message
        }
    }
    
    // Custom exception class
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message); //passing the message to the exception
        }
    }
    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above"); //throwing the exception
        } else {
            System.out.println("Access granted!"); //printing the access granted message
        }
    }
}

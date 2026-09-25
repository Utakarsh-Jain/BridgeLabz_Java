/*
Problem 8 - Java Strings Level 1
Write a program to demonstrate ArrayIndexOutOfBoundsException
Hint => 
Define a variable of array of names and take input from the user
Write a Method to generate the Exception. Here access index larger then the length of the array. This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate ArrayIndexOutOfBoundsException. Here access index larger then the length of the array. This will generate a runtime exception. Use the try-catch block to handle the ArrayIndexOutOfBoundsException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException

Name : Utakarsh Jain
Date : 25-09-2026

*/
import java.util.Scanner;
class ArrayIndexExceptionDemo {
    public static void generateException(String names[]) {
        int index = names.length;
        System.out.println(names[index]); // Accessing index larger than the length of the array
    }
    public static void handleException(String names[]) {
        int index = names.length;
        try {
            System.out.println(names[index]); // Accessing index larger than the length of the array
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("ArrayIndexOutOfBoundsException handled: " + exception.getMessage()); // Catching the ArrayIndexOutOfBoundsException
        } catch (RuntimeException exception) {
            System.out.println("RuntimeException handled: " + exception.getMessage()); // Catching the RuntimeException
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String names[] = new String[3]; // Creating an array of strings
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Exception generated: " + exception.getMessage());
        }
        handleException(names);
        sc.close();
    }
}
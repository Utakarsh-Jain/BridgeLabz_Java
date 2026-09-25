/*
Problem 6 - Java String Level 1
Write a program to demonstrate IllegalArgumentException
Hint => 
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate IllegalArgumentException. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception. Use the try-catch block to handle the IllegalArgumentException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
Name : Utakarsh Jain
Date : 25-09-2026

*/

import java.util.Scanner;
class IllegalArgumentExceptionDemo {
    public static void generateException(String text) {
        int startIndex = text.length(); //taking the length of the string as start index 
        int endIndex = 0; //setting end index to 0
        System.out.println(text.substring(startIndex, endIndex)); //printing the substring from the given text
    }
    public static void handleException(String text) {
        int startIndex = text.length(); //taking the length of the string as start index 
        int endIndex = 0; //setting end index to 0
        try {
            System.out.println(text.substring(startIndex, endIndex)); //printing the substring from the given text
        } catch (IllegalArgumentException exception) {
            System.out.println("IllegalArgumentException handled: " + exception.getMessage()); //Catching the IllegalArgumentException
        } catch (RuntimeException exception) {
            System.out.println("RuntimeException handled: " + exception.getMessage()); //Catching the RuntimeException
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        try {
            generateException(text);
        } catch (IllegalArgumentException exception) {
            System.out.println("Exception generated: " + exception.getMessage());
        }
        handleException(text);
        sc.close();
    }
}
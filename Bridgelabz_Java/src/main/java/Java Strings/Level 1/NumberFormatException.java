/*
Problem 7 - Java String Level 1
Write a program to demonstrate NumberFormatException
Hint => 
Define a variable to take user input as a String 
Use Integer.parseInt() to generate this exception. Integer.parseInt() is a built-in function in java.lang.Integer class to extract the number from text. In case the text does not contain numbers the method will throw NumberFormatException which is a runtime exception
Write a Method to generate the Exception. Use Integer.parseInt(text) to extract number from the text. This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate NumberFormatException. Use Integer.parseInt(text) to extract number from the text. This will generate a runtime exception. Use the try-catch block to handle the NumberFormatException as well as the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
Name : Utakarsh Jain
Date : 25-09-2026
*/

import java.util.Scanner;
class NumberFormatExceptionDemo {
    public static void generateException(String text) { //method to generate NumberFormatException
        int number = Integer.parseInt(text); //Converting string to integer
        System.out.println("Number: " + number); //Printing the number
    }
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text); //Converting string to integer
            System.out.println("Number: " + number); //Printing the number
        } catch (NumberFormatException exception) {
            System.out.println("NumberFormatException handled: " + exception.getMessage()); //Catching the NumberFormatException
        } catch (RuntimeException exception) {
            System.out.println("RuntimeException handled: " + exception.getMessage()); //Catching the RuntimeException
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number as text:");
        String text = sc.next();
        try {
            generateException(text);
        } catch (NumberFormatException exception) {
            System.out.println("Exception generated: " + exception.getMessage());
        }
        handleException(text);
        sc.close();
    }
}
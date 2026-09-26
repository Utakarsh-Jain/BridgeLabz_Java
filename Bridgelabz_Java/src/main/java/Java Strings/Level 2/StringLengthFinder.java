/*
Problem 1 - Java String Level 2
Write a program to find and return the length of a string without using the length() method 
Hint => 
Take user input using the Scanner next() method 
Create a method to find and return a string's length without using the built-in length() method. The logic for this is to use the infinite loop to count each character till the charAt() method throws a runtime exception, handles the exception, and then return the count
The main function calls the user-defined method as well as the built-in length() method and displays the result
Name : Utakarsh Jain
Date : 25-09-2026

*/

import java.util.Scanner;
class StringLengthFinder {
    public static int findStringLength(String text) { //Method to find the length of the string
        int count = 0; 
        while (true) { //Infinite loop to count each character
            try { //Try block to handle the exception
                text.charAt(count); //Accessing each character of the string
                count++; 
            } catch (StringIndexOutOfBoundsException exception) { //Catching the exception
                break;
            }
        }

        return count;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        int userDefinedLength = findStringLength(text);
        int builtInLength = text.length();
        System.out.println("Length using user-defined method: " + userDefinedLength);
        System.out.println("Length using length(): " + builtInLength);
        sc.close();
    }
}
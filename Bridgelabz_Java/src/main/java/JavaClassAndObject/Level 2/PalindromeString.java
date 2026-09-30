/*

Problem 3 : Java Class And Object Level 2
Program to Check Palindrome String
Problem Statement: Create a PalindromeChecker class with an attribute text. Add methods to:
Check if the text is a palindrome.
Display the result.
Explanation: The PalindromeChecker class holds the text attribute. The methods operate on this attribute to verify its palindrome status and display the result.
Name: Utakarsh Jain
Date : 29/09/2026
*/

import java.util.Scanner;

class PalindromeChecker {
    String text;
    boolean checkPalindrome() { //Function to check if the string is a palindrome or not
        String reversed = ""; 
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i); 
        }
        return text.equals(reversed);
    }
    void displayResult() {
        if (checkPalindrome()) { //If the value returned is true then this function will be invoked
            System.out.println(text + " is a palindrome");
        } else { //If the value returned is false then this function will be invoked
            System.out.println(text + " is not a palindrome");
        }
    }
}
public class PalindromeString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        PalindromeChecker p = new PalindromeChecker(); //Creating an object of the class
        System.out.print("Enter a String: ");
        p.text = sc.nextLine(); //Using object of the class to call the instance variables
        p.displayResult(); //Calling the display method
        sc.close();
    }
}
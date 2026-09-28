/*
Extra Problems - Problem 3
Palindrome String Check
Problem:
Write a Java program to check if a given string is a palindrome (a string that reads the
same forward and backward).
Name: Utakarsh Jain
Date: 28/09/2026

*/
import java.util.*;
public class PalindromeCheck{
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string"); //taking input from the user
        String str = sc.nextLine();
        PalindromeCheck obj = new PalindromeCheck();
        obj.isPalindrome(str);
        sc.close();
    }
    public void isPalindrome(String str) {
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) { //looping through the string from the last index to the first index
            reversedStr += str.charAt(i); //adding the character at the current index to the reversed string
        }
        if (str.equals(reversedStr)) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }
}
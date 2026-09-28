/*
Extra Problems - Problem 2
Reverse a String
Problem:
Write a Java program to reverse a given string without using any built-in reverse
functions.
Name: Utakarsh Jain
Date: 28/09/2026
*/
import java.util.*;
public class ReverseString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        ReverseString obj = new ReverseString();
        obj.reverseString(str);
        sc.close();
    }
    public void reverseString(String str) {
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) { //looping through the string from backwards
            reversedStr += str.charAt(i); //adding all the elements to the new string
        }
        System.out.println("Reversed string: " + reversedStr);
    }
}

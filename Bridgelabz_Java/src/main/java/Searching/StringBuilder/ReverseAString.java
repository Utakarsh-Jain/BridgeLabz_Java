/*

Reverse a String Using StringBuilder
Problem:
Write a program that uses StringBuilder to reverse a given string. For example, if the input is "hello", the output should be "olleh".
Approach:
Create a new StringBuilder object.
Append the string to the StringBuilder.
Use the reverse() method of StringBuilder to reverse the string.
Convert the StringBuilder back to a string and return it.

Name : Utakarsh Jain
Date : 09/10/2026

*/

package main.java.Searching.StringBuilder;

public class ReverseAString {
    // Function to reverse a string using StringBuilder
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str); // create a new StringBuilder object
        sb.reverse(); // reverse the string
        return sb.toString(); // convert the StringBuilder back to a string
    }
    public static void main(String[] args) {
        String str = "hello";
        String reversedStr = reverseString(str);
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversedStr);
    }
}

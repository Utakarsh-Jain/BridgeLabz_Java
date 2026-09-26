/*

Problem 7 - Java Strings Level 3
Write a program to to check if a text is palindrome and display the result
Hint => 
A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward
Logic 1: Write a method to compare the characters from the start and end of the string to determine whether the text is palindrome. The logic used here is as follows:
Set the start and end indexes of the text
Loop through the text and compare the characters from the start and the end of the string. If the characters are not equal, return false
Logic 2: Write a recursive method to compare the characters from the start and end of the text passed as parameters using recursion. The logic used here is as follows:
First, check if the start index is greater than or equal to the end index, then return true.
If the characters at the start and end indexes are not equal, return false.
Otherwise, call the method recursively with the start index incremented by 1 and the end index
Logic 3: Write a Method to compare the characters from the start and end of the text using character arrays. The logic used here is as follows:
Firstly Write a Method to reverse a string using the charAt() method and return the reversal array.
Create a character array using the String method toCharArray() and also create a reverse array. Compare the characters in the original and reverse arrays to do a Palindrome check 
Finally, in the main method do palindrome check using the three logic and display result
Name : Utakarsh Jain
Date : 26-09-2026

*/

import java.util.Scanner;
public class Palindrome {
    public static boolean checkUsingReverse(String text) { // Method to reverse a string
        String reverse = ""; 
        for (int i = text.length() - 1; i >= 0; i--) { // Loop through the string from end to start
            reverse += text.charAt(i); // Add characters to reverse string
        }
        return text.equals(reverse); // Compare original string with reverse string
    }
    public static boolean checkUsingTwoPointers(String text) { // Method to check if a string is a palindrome using two pointers
        int start = 0;
        int end = text.length() - 1;
        while (start < end) { // Loop through the string from both ends
            if (text.charAt(start) != text.charAt(end)) { // Compare characters from both ends
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean checkUsingRecursion(String text, int start, int end) { // Method to check if a string is a palindrome using recursion
        if (start >= end) { // Base case: If start index is greater than or equal to end index
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return checkUsingRecursion(text, start + 1, end - 1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        System.out.println("Using reverse: " + checkUsingReverse(text));
        System.out.println("Using two pointers: " + checkUsingTwoPointers(text));
        System.out.println("Using recursion: " + checkUsingRecursion(text, 0, text.length() - 1));
        sc.close();
    }
}
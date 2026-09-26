/*
Problem 2 - Java Strings LEVEL 3
Find unique characters in a string using the charAt() method and display the result
Hint => 
Create a Method to find the length of the text without using the String method length()
Create a method to Find unique characters in a string using the charAt() method and return them as a 1D array. The logic used here is as follows:
Create an array to store the unique characters in the text. The size is the length of the text
Loops to Find the unique characters in the text. Find the unique characters in the text using a nested loop. An outer loop iterates through each character and an inner loop checks if the character is unique by comparing it with the previous characters. If the character is unique, it is stored in the result array
Create a new array to store the unique characters 
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 
Name : Utakarsh Jain
Date : 26-09-2026
*/

import java.util.Scanner;
public class UniqueCharacters {
    // Method to find length without using String.length()
    public static int findLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string reached
        }
        return length;
    }
    // Method to find unique characters
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        // Array to store unique characters
        char unique[] = new char[length];
        int uniqueCount = 0;
        // Outer loop checks each character
        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;
            // Inner loop checks previous characters
            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[uniqueCount] = current;
                uniqueCount++;
            }
        }
        // Create a new array of exact size
        char result[] = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = unique[i];
        }
        return result;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = sc.nextLine();
        char result[] = findUniqueCharacters(text);
        System.out.print("Unique characters: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
}
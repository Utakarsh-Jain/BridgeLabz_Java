/*
Problem 5 - Java String LEVEL 3
Write a program to find the frequency of characters in a string using unique characters and display the result
Hint => 
Create a method to Find unique characters in a string using the charAt() method and return them as a 1D array.  Use Nested Loops to find the unique characters in the text
Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 2D array. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Call the uniqueCharacters() method to find the unique characters in the text
Create a 2D String array to store the unique characters and their frequencies. 
Loop through the unique characters and store the characters and their frequencies
In the main function take user inputs, call user-defined methods, and displays result.  
Name : Utakarsh Jain
Date : 26-09-2026
*/

import java.util.Scanner;
public class FrequencyOfUniqueCharacters {
    // Method to find unique characters using nested loops
    public static char[] uniqueCharacters(String text) {
        int length = text.length();
        // Array to store unique characters (max size = text length)
        char unique[] = new char[length];
        int uniqueCount = 0;
        // Check each character for uniqueness
        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;
            // Compare with previous characters
            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            // If unique, add to array
            if (isUnique) {
                unique[uniqueCount] = current;
                uniqueCount++;
            }
        }
        // Trim array to exact size
        char result[] = new char[uniqueCount];
        System.arraycopy(unique, 0, result, 0, uniqueCount);
        return result;
    }
    // Method to find frequency of each character
    public static int[][] findFrequency(String text, char[] uniqueChars) {
        int uniqueCount = uniqueChars.length;
        // 2D array: [character][frequency]
        int result[][] = new int[uniqueCount][2];
        // Calculate frequency for each unique character
        for (int i = 0; i < uniqueCount; i++) {
            char currentChar = uniqueChars[i];
            int frequency = 0;
            // Count occurrences in original text
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == currentChar) {
                    frequency++;
                }
            }
            // Store character and frequency
            result[i][0] = currentChar;
            result[i][1] = frequency;
        }
        return result;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = sc.nextLine();
        // Step 1: Find unique characters
        char unique[] = uniqueCharacters(text);
        // Step 2: Calculate frequency
        int frequencyArray[][] = findFrequency(text, unique);
        System.out.println("\nCharacter Frequencies:");
        // Step 3: Display results
        for (int i = 0; i < frequencyArray.length; i++) {
            char character = (char) frequencyArray[i][0];
            int frequency = frequencyArray[i][1];
            System.out.println(character + " : " + frequency);
        }
        sc.close();
    }
}
/*
Problem 4 - Java String LEVEL 3
Write a program to find the frequency of characters in a string using the charAt() method and display the result
Hint => 
Create a method to find the frequency of characters in a string using the charAt() method and return the characters and their frequencies in a 2D array. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Create an array to store the characters and their frequencies
Loop through the characters in the text and store the characters and their frequencies
In the main function take user inputs, call user-defined methods, and displays result.  
Name : Utakarsh Jain
Date : 26-09-2026
*/


import java.util.Scanner;
public class CharacterFrequency {
    // Method to find the length without using String.length()
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
    // Method to find characters and their frequencies
    public static int[][] findFrequency(String text) {
        int length = findLength(text);
        // Array to store frequency of 256 ASCII characters
        int frequency[] = new int[256];
        // Find frequency of each character
        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            frequency[current]++;
        }
        // Count number of unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }
        // 2D array to store character and frequency
        // Row = character
        // Column 0 = character
        // Column 1 = frequency
        int result[][] = new int[uniqueCount][2];
        int index = 0;
        // Store characters and their frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = i;
                result[index][1] = frequency[i];
                index++;
            }
        }
        return result;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = sc.nextLine();
        int result[][] = findFrequency(text);
        System.out.println("\nCharacter Frequencies:"); //Display the characters and their frequencies
        for (int i = 0; i < result.length; i++) { //Loop to display the characters and their frequencies
            char character = (char) result[i][0];
            int frequency = result[i][1];
            System.out.println(character + " : " + frequency);
        }
        sc.close();
    }
}
/*
Problem 6 - Java String Level 2
Write a program to find vowels and consonants in a string and display the character type - Vowel, Consonant, or Not a Letter
Hint => 
Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
Create a Method to find vowels and consonants in a string using charAt() method and return the character and vowel or consonant in a 2D array
Create a Method to display the 2D Array of Strings in a Tabular Format
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 
Name : Utakarsh Jain
Date : 26-09-2026
*/

import java.util.Scanner;
class CharacterType {
    // Method to check if a character is a vowel or consonant
    public static String checkVowelOrConsonant(char ch) {
        // Convert to lowercase if uppercase using ASCII values
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); // Convert to lowercase
        }
        // Check if it's a letter
        if (ch >= 'a' && ch <= 'z') {
            // Check if it's a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }
    // Method to find vowels and consonants in a string using charAt()
    public static String[][] getCharacterTypeArray(String text) {
        int length = text.length();
        String charTypeArray[][] = new String[length][2];
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            charTypeArray[i][0] = String.valueOf(ch);
            charTypeArray[i][1] = checkVowelOrConsonant(ch);
        }
        return charTypeArray;
    }
    // Method to display the 2D array of strings in a tabular format
    public static void displayTable(String[][] charTypeArray) {
        System.out.println("\nCharacter Type Table:");
        System.out.println("| Character | Type           |");
        for (int i = 0; i < charTypeArray.length; i++) {
            String character = charTypeArray[i][0];
            String type = charTypeArray[i][1];
            System.out.printf("| %-9s | %-14s |\n", character, type);
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Get input from user
        System.out.println("Enter a string:");
        String text = sc.nextLine();
        // Get character types
        String charTypeArray[][] = getCharacterTypeArray(text);
        // Display the table
        displayTable(charTypeArray);
        sc.close();
    }
}
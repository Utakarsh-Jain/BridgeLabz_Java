/*
Problem 5 - Java String Level 2
Write a program to find vowels and consonants in a string and display the count of  Vowels and Consonants in the string
Hint => 
Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
Create a Method to Method to find vowels and consonants in a string using charAt() method and finally return the count of vowels and consonants in an array
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 
Name : Utakarsh Jain
Date : 26-09-2026
*/

import java.util.Scanner;
class VowelsConsonants {
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
    public static int countVowelsAndConsonants(String text)[] {
        int counts[] = new int[3]; // Index 0: vowels, 1: consonants, 2: not letters
        int vowelCount = 0;
        int consonantCount = 0;
        int notLetterCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String result = checkVowelOrConsonant(ch);
            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            } else {
                notLetterCount++;
            }
        }
        counts[0] = vowelCount;
        counts[1] = consonantCount;
        counts[2] = notLetterCount;
        return counts;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Get input from user
        System.out.println("Enter a string:");
        String text = sc.nextLine();
        // Count vowels and consonants
        int counts[] = countVowelsAndConsonants(text);
        int vowels = counts[0];
        int consonants = counts[1];
        int notLetters = counts[2];
        // Display the result
        System.out.println("\nResults:");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Not Letters: " + notLetters);
        sc.close();
    }
}

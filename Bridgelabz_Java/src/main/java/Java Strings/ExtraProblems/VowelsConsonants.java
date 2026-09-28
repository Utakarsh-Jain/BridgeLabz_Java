/*
Extra Problems - Problem 1
Count Vowels and Consonants
Problem:
Write a Java program to count the number of vowels and consonants in a given string.
Name: Utakarsh Jain
Date: 28/09/2026
*/
import java.util.*;
public class VowelsConsonants {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:"); //taking the input from user
        String str = sc.nextLine();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < str.length(); i++) { //looping through the string
            char ch = str.charAt(i); //getting the character at the current index
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels++; //incrementing the vowel count
            } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') { //checking if the character is a consonant
                consonants++; //incrementing the consonant count
            }
        }
        System.out.println("Number of vowels: " + vowels); //printing the vowel count
        System.out.println("Number of consonants: " + consonants); //printing the consonant count
        sc.close();
    }
}
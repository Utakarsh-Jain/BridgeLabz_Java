/*
Problem 8 - Java Strings Level 3
Write a program to check if two texts are anagrams and display the result
Hint => 
An anagram is a word or phrase formed by rearranging the same letters to form different words or phrases,
Write a method to check if two texts are anagrams. The logic used here is as follows:
Check if the lengths of the two texts are equal
Create an array to store the frequency of characters in the strings for the two text
Find the frequency of characters in the two texts using the loop
Compare the frequency of characters in the two texts. If the frequencies are not equal, return false
In the main function take user inputs, call user-defined methods, and displays result.  
Name: <Utakarsh Jain>
Date: 26/09/2026

*/

import java.util.Scanner;
public class Anagrams {
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) { //checking if the length of both the strings are same or not
            return false;
        }

        int count[] = new int[256]; // Assuming ASCII
        // Count chars of s1
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
        }
        // Decrement for s2
        for (int i = 0; i < s2.length(); i++) {
            count[s2.charAt(i)]--;
            if (count[s2.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        if (areAnagrams(s1, s2)) { //checking if the strings are anagrams
            System.out.println("Anagrams");
        } else { //if the strings are not anagrams
            System.out.println("Not anagrams");
        }
        sc.close();
    }
}

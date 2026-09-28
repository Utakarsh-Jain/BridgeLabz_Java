/*
Problem 9
Find the Most Frequent Character
Problem:
Write a Java program to find the most frequent character in a string.
Example Input:
String: "success"

Expected Output:
Most Frequent Character: 's'

Name : Utakarsh Jain
Date : 28/09/2026

*/

import java.util.*;
public class MostFrequentCharacter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = sc.nextLine();
        MostFrequentCharacter obj = new MostFrequentCharacter();
        obj.findMostFrequentCharacter(str);
        sc.close();
    }
    public void findMostFrequentCharacter(String str) {
        char mostFrequentChar = ' ';
        int maxCount = 0;
        for (int i = 0; i < str.length(); i++) { //looping through the string
            int count = 0; //initializing count to 0
            for (int j = 0; j < str.length(); j++) { //looping through the string again
                if (str.charAt(i) == str.charAt(j)) { //checking if the characters are equal
                    count++; //incrementing the count
                }
            }
            if (count > maxCount) { //checking if the count is greater than the max count
                maxCount = count; //updating the max count
                mostFrequentChar = str.charAt(i); //updating the most frequent character
            }
        }
        System.out.println("Most Frequent Character: " + mostFrequentChar); //printing the most frequent character
    }
}
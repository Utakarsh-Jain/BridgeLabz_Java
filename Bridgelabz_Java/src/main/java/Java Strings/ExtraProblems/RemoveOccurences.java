/*
Problem 10
Remove a Specific Character from a String
Problem:
Write a Java program to remove all occurrences of a specific character from a string.
Example Input:
String: "Hello World"
Character to Remove: 'l'

Expected Output:
Modified String: "Heo Word"

Name : Utakarsh Jain
Date : 28/09/2026

*/

import java.util.*;
public class RemoveOccurences {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter the character to remove: ");
        char charToRemove = sc.next().charAt(0);
        RemoveOccurences obj = new RemoveOccurences();
        obj.removeOccurences(str, charToRemove);
        sc.close();
    }
    public void removeOccurences(String str, char charToRemove) {
        String result = "";
        for (int i = 0; i < str.length(); i++) { //looping through the string
            if (str.charAt(i) != charToRemove) { //checking if the character is not equal to the character to remove
                result += str.charAt(i); //adding the character to the result string
            }
        }
        System.out.println("Modified String: " + result); //printing the result string
    }
}
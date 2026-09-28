/*

Find Substring Occurrences
Problem:
Write a Java program to count how many times a given substring occurs in a string.
Name : Utakarsh Jain
Date : 28/09/2026

*/

import java.util.*;
public class SubstringOccurences {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string:"); //taking input from the user
        String mainStr = sc.nextLine();
        System.out.print("Enter the substring to search:"); //taking input from the user
        String subStr = sc.nextLine();
        SubstringOccurences obj = new SubstringOccurences();
        obj.countOccurrences(mainStr, subStr); //calling the method to count the occurrences
        sc.close();
    }
    public void countOccurrences(String mainStr, String subStr) {
        int count = 0; //initializing the count to 0
        for (int i = 0; i <= mainStr.length() - subStr.length(); i++) { //looping through the main string
            if (mainStr.substring(i, i + subStr.length()).equals(subStr)) { //checking if the substring is present in the main string
                count++; //incrementing the count if the substring is found
            }
        }
        System.out.println("The substring " + subStr + " occurs " + count + " times in the main string."); //printing the result
    }
}

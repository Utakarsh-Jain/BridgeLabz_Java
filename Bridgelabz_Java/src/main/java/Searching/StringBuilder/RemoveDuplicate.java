/*

Remove Duplicates from a String Using StringBuilder
Problem:
Write a program that uses StringBuilder to remove all duplicate characters from a given string while maintaining the original order.
Approach:
Initialize an empty StringBuilder and a HashSet to keep track of characters.
Iterate over each character in the string:
If the character is not in the HashSet, append it to the StringBuilder and add it to the HashSet.
Return the StringBuilder as a string without duplicates.

Name : Utakarsh Jain
Date : 09/10/2026


*/

package main.java.Searching.StringBuilder;

import java.util.HashSet;
public class RemoveDuplicate {
    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder(); // create a new StringBuilder object
        HashSet<Character> seen = new HashSet<>(); // create a HashSet to keep track of characters
        for (char c : str.toCharArray()) { // iterate over each character in the string
            if (!seen.contains(c)) { // if the character is not in the HashSet
                sb.append(c); // append it to the StringBuilder
                seen.add(c); // add it to the HashSet
            }
        }
        return sb.toString(); // convert the StringBuilder back to a string
    }
    public static void main(String[] args) {
        String str = "hello";
        String uniqueStr = removeDuplicates(str);
        System.out.println("Original string: " + str);
        System.out.println("String without duplicates: " + uniqueStr);
    }
}

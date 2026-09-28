/*
Problem 11
Anagrams
Write a Java program that accepts two strings from the user and checks if the two
strings are anagrams of each other (i.e., whether they contain the same characters in any
order).

Name : Utakarsh Jain
Date : 28/09/2026

*/

import java.util.*;
public class Anagrams {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        Anagrams obj = new Anagrams();
        obj.checkAnagrams(str1, str2);
        sc.close();
    }
    public void checkAnagrams(String str1, String str2) {
        String sortedStr1 = sortString(str1); //sorting the first string
        String sortedStr2 = sortString(str2); //sorting the second string
        if (sortedStr1.equals(sortedStr2)) { //checking if the sorted strings are equal
            System.out.println(str1 + " and " + str2 + " are anagrams."); //printing the result
        } else { //if the sorted strings are not equal
            System.out.println(str1 + " and " + str2 + " are not anagrams."); //printing the result
        }
    }
    public String sortString(String str) { //method to sort a string
        char charArray[] = str.toCharArray(); //converting the string to a character array
        Arrays.sort(charArray); //sorting the character array
        return new String(charArray); //converting the character array to a string and returning it
    }
}
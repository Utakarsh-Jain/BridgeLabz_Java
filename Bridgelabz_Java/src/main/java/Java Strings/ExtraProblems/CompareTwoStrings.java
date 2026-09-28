/*
Problem 8
Compare Two Strings
Problem:
Write a Java program to compare two strings lexicographically (dictionary order) without
using built-in compare methods.
Example Input:
String 1: "apple"
String 2: "banana"

Expected Output:
"apple" comes before "banana" in lexicographical order

Name : Utakarsh Jain
Date : 28/09/2026

*/

import java.util.*;
public class CompareTwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        CompareTwoStrings obj = new CompareTwoStrings();
        obj.compareStrings(str1, str2);
        sc.close();
    }
    public void compareStrings(String str1, String str2) {
        int result = 0; 
        for (int i = 0; i < str1.length() && i < str2.length(); i++) { //looping through the strings
            if (str1.charAt(i) != str2.charAt(i)) { //checking if the characters are not equal
                result = str1.charAt(i) - str2.charAt(i); //subtracting the characters
                break; //breaking the loop
            }
        }
        if (result == 0) { //checking if the result is 0
            result = str1.length() - str2.length(); //subtracting the lengths of the strings
        }
        if (result < 0) { //checking if the result is less than 0
            System.out.println(str1 + " comes before " + str2 + " in lexicographical order.");
        } else if (result > 0) { //checking if the result is greater than 0
            System.out.println(str2 + " comes before " + str1 + " in lexicographical order.");
        } else { //if the result is 0
            System.out.println(str1 + " and " + str2 + " are equal.");
        }
    }
}

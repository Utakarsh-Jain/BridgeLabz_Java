/*

Concatenate Strings Efficiently Using StringBuffer
Problem:
You are given an array of strings. Write a program that uses StringBuffer to concatenate all the strings in the array efficiently.
Approach:
Create a new StringBuffer object.
Iterate through each string in the array and append it to the StringBuffer.
Return the concatenated string after the loop finishes.
Using StringBuffer ensures efficient string concatenation due to its mutable nature.

Name : Utakarsh Jain
Date : 09/10/2026


*/

package main.java.Searching.StringBuffer;
public class ConcatenateString {
    // Function to concatenate an array of strings using StringBuffer
    public static String concatenateStrings(String[] arr) {
        StringBuffer sb = new StringBuffer(); // create a new StringBuffer object
        for (String str : arr) { // iterate over each string in the array
            sb.append(str); // append each string to the StringBuffer
        }
        return sb.toString(); // convert the StringBuffer back to a string
    }
    public static void main(String[] args) {
        String[] arr = {"hello", " ", "world"};
        String concatenatedStr = concatenateStrings(arr);
        System.out.println("Original strings: " + String.join(" ", arr));
        System.out.println("Concatenated string: " + concatenatedStr);
    }
}

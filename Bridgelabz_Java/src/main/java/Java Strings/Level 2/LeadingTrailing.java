/*
Problem 7 - Java Strings level 2

Write a program to trim the leading and trailing spaces from a string using the charAt() method 
Hint => 
Create a method to trim the leading and trailing spaces from a string using the charAt() method. Inside the method run a couple of loops to trim leading and trailing spaces and determine the starting and ending points with no spaces. Return the start point and end point in an array
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
The main function calls the user-defined trim and substring methods to get the text after trimming the leading and trailing spaces. Post that use the String built-in method trim() to trim spaces and compare the two strings. And finally display the result
Name : Utakarsh Jain
Date : 26-09-2026

*/
import java.util.Scanner;
class LeadingTrailing {
    // Method to trim leading/trailing spaces and find start/end indices
    public static int trimSpaces(String text)[] {
        int length = text.length();
        int start = 0;
        int end = length - 1;
        // Find first non-space character (trim leading)
        while (start < length && text.charAt(start) == ' ') {
            start++;
        }
        // Find last non-space character (trim trailing)
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }
    // Method to create substring using charAt
    public static String createSubstring(String text, int start, int end) {
        if (start < 0 || end >= text.length() || start > end) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }
    // Method to compare two strings using charAt
    public static boolean compareStrings(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        int len1 = str1.length();
        int len2 = str2.length();
        if (len1 != len2) {
            return false;
        }
        for (int i = 0; i < len1; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.nextLine();
        System.out.println("\nOriginal String: " + text);
        // Use user-defined method
        int indices[] = trimSpaces(text);
        int start = indices[0];
        int end = indices[1];
        String trimmedUser = "";
        if (start <= end) {
            trimmedUser = createSubstring(text, start, end);
        }
        System.out.println("\nAfter trimming using charAt() method:");
        System.out.println("Trimmed String: " + trimmedUser);
        // Use built-in trim() method
        String trimmedBuiltin = text.trim();
        System.out.println("\nAfter trimming using built-in trim() method:");
        System.out.println("Trimmed String: " + trimmedBuiltin);
        // Compare both trimmed strings
        boolean isEqual = compareStrings(trimmedUser, trimmedBuiltin);
        System.out.println("\nComparison Result:");
        System.out.println("Are both trimmed strings equal? " + isEqual);
        sc.close();
    }
}

/*
Problem 2 - Java String Level 1
Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results
Hint => 
Take user input using the  Scanner next() method to take the String variable and also the start and the end index to get the substring from the given text
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String built-in method substring() to get the substring and compare the two strings. And finally display the result
Name: <Utakarsh Jain>
* Date : 25-09-2026

*/

import java.util.Scanner;
class SubstringComparison {
    public static String createSubstring(String text, int startIndex, int endIndex) {
        String substring = "";
        for (int i = startIndex; i < endIndex; i++) { 
            substring += text.charAt(i); // Taking the characters from the string 
        } 
        return substring;
    }
    public static boolean compareStrings(String firstText, String secondText) {
        if (firstText.length() != secondText.length()) {  //Checking if the lengths of the strings are equal 
            return false;
        }
        for (int i = 0; i < firstText.length(); i++) { //Looping through the strings to compare characters 
            if (firstText.charAt(i) != secondText.charAt(i)) { //Checking if the characters at each position are equal 
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text:");
        String text = sc.next();
        System.out.print("Enter start index:");
        int startIndex = sc.nextInt();
        System.out.print("Enter end index: ");
        int endIndex = sc.nextInt();
        String userDefinedSubstring = createSubstring(text, startIndex, endIndex);
        String builtInSubstring = text.substring(startIndex, endIndex);
        boolean result = compareStrings(userDefinedSubstring, builtInSubstring);
        System.out.println("Substring using charAt(): " + userDefinedSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Both substrings are same: " + result);
        sc.close();
    }
}
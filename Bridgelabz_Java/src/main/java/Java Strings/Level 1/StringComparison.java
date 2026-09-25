/*
* Problem 1 - Java String Level 1 
Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method
Hint => 
Take user input using the  Scanner next() method for 2 String variables
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String Built-In method to check if the results are the same and display the result

Name: <Utakarsh Jain>
* Date : 25-09-2026

*/
import java.util.*;
class StringComparison {
    public static boolean compareStrings(String str1, String str2) { //Method to compare two strings using the charAt() method
        if (str1.length() != str2.length()) { //Checking if the lengths of the strings are equal
            return false;
        }
        for (int i = 0; i < str1.length(); i++) { //Looping through the strings to compare characters
            if (str1.charAt(i) != str2.charAt(i)) { //Comparing characters at each position
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.next();
        System.out.print("Enter second string: ");
        String str2 = sc.next();
        boolean result = compareStrings(str1, str2);
        boolean builtInResult = str1.equals(str2);
        System.out.println("Result from charAt() method: " + result);
        System.out.println("Result from equals() method: " + builtInResult);
        sc.close();
    }
}
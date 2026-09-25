/*
Problem 10 - Java String Level 1
Write a program to convert the complete text to lowercase and compare the results
Hint => 
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is lowercase to the Upper Case. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toUpperCase() to get the Uppercase Text and compare the two strings using the user-defined method. And finally display the result
Name : Utakarsh Jain
Date : 25-09-2026

*/

import java.util.Scanner;
class LowerCaseConversion {
    public static String convertToLowerCase(String text) { //Method to convert text to lowercase
        String lowerCaseText = ""; 
        for (int i = 0; i < text.length(); i++) { 
            char character = text.charAt(i); //Getting each character from the text
            if (character >= 'A' && character <= 'Z') { //Checking if the character is uppercase
                character = (char) (character + 32); //Converting the character to lowercase
            }

            lowerCaseText += character; //Adding the character to the lowercase text
        }

        return lowerCaseText;
    }
    public static boolean compareStrings(String firstText, String secondText) { //Method to compare strings
        if (firstText.length() != secondText.length()) { //Checking if the lengths of the strings are equal
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
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String userDefinedLowerCase = convertToLowerCase(text);
        String builtInLowerCase = text.toLowerCase();
        boolean result = compareStrings(userDefinedLowerCase, builtInLowerCase);
        System.out.println("Lowercase using charAt(): " + userDefinedLowerCase);
        System.out.println("Lowercase using toLowerCase(): " + builtInLowerCase);
        System.out.println("Both results are same: " + result);
        sc.close();
    }
}
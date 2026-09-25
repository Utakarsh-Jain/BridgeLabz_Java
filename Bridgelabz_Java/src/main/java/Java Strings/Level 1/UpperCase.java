/*
Problem 9 - Java String Level 1
Write a program to convert the complete text to uppercase and compare the results
Hint => 
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is lowercase to the Upper Case. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toLowerCase() to get the Uppercase Text and compare the two strings using the user-defined method. And finally display the result

*/

import java.util.Scanner;
class UpperCaseComparison {
    public static String convertToUpperCase(String text) { //method to convert text to uppercase
        String upperCaseText = ""; 
        for (int i = 0; i < text.length(); i++) { 
            char character = text.charAt(i);
            if (character >= 'a' && character <= 'z') { //checking if the character is lowercase
                character = (char) (character - 32); //converting to uppercase
            }
            upperCaseText += character; //adding the character to the uppercase text
        }
        return upperCaseText;
    }
    public static boolean compareStrings(String firstText, String secondText) {
        if (firstText.length() != secondText.length()) { //checking if the length of the strings are same
            return false;
        }
        for (int i = 0; i < firstText.length(); i++) { //looping through the strings
            if (firstText.charAt(i) != secondText.charAt(i)) { //checking if the characters are same
                return false;
            }
        }
        return true; //returning true if the strings are same
    }
    public static void main(String[] args) { //main method
        Scanner sc = new Scanner(System.in); //creating a scanner object
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String userDefinedUpperCase = convertToUpperCase(text);
        String builtInUpperCase = text.toUpperCase();
        boolean result = compareStrings(userDefinedUpperCase, builtInUpperCase);
        System.out.println("Uppercase using charAt(): " + userDefinedUpperCase);
        System.out.println("Uppercase using toUpperCase(): " + builtInUpperCase);
        System.out.println("Both results are same: " + result);
        sc.close();
    }
}
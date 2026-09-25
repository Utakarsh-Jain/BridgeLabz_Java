/*
Problem 3 - Java String Level 1
Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method, and display the result
Hint => 
Take user input using the  Scanner next() method to take the text into a String variable
Write a method to return the characters in a string without using the toCharArray() 
Write a method to compare two string arrays and return a boolean result
In the main() call the user-defined method and the String built-in ​​toCharArray() method, compare the 2 arrays, and finally display the result
Name: <Utakarsh Jain>
* Date : 25-09-2026

*/

import java.util.Arrays;
import java.util.Scanner;
class CharacterArrayComparison {
    public static char[] getUserDefinedCharacterArray(String text) { //Method to convert a string to a character array
        char charArray[] = new char[text.length()]; //Creating a character array of the same size as the string
        for (int i = 0; i < text.length(); i++) { //Looping through the string
            charArray[i] = text.charAt(i); //Storing each character in the array
        }
        return charArray;
    }
    public static boolean compareCharacterArrays(char firstArray[], char secondArray[]) { //Method to compare two character arrays
        for (int i = 0; i < firstArray.length; i++) { //Looping through the first array
            if (firstArray[i] != secondArray[i]) { //Comparing elements at each position
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text:");
        String text = sc.next();
        char userDefinedArray[] = getUserDefinedCharacterArray(text);
        char builtInArray[] = text.toCharArray();
        boolean result = compareCharacterArrays(userDefinedArray, builtInArray);
        System.out.println("Character array using user-defined method: " + Arrays.toString(userDefinedArray));
        System.out.println("Character array using toCharArray() method: " + Arrays.toString(builtInArray));
        System.out.println("Both arrays are same: " + result);
        sc.close();
    }
}

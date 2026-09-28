/*
Problem 7 
Toggle Case of Characters
Problem:
Write a Java program to toggle the case of each character in a given string. Convert
uppercase letters to lowercase and vice versa.
Name: Utakarsh Jain
Date: 28/09/2026

*/

import java.util.*;
public class ToggleCase{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string"); 
        String str = sc.nextLine();
        ToggleCase obj = new ToggleCase();
        obj.toggleCase(str);
        sc.close();
    }
    public void toggleCase(String str) {
        String result = ""; 
        for (int i = 0; i < str.length(); i++) { //looping through the string
            char ch = str.charAt(i); //getting the character at the current index
            if (ch >= 'a' && ch <= 'z') { //checking if the character is lowercase
                result += Character.toUpperCase(ch); //converting the character to uppercase and adding it to the result string
            } else if (ch >= 'A' && ch <= 'Z') { //checking if the character is uppercase
                result += Character.toLowerCase(ch); //converting the character to lowercase and adding it to the result string
            } else { //if the character is not a letter
                result += ch; //adding the character to the result string
            }
        }
        System.out.println("The string with toggled case is " + result);
    }
}


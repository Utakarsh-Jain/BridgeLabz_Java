package main.java.Regex;

import java.util.regex.Pattern;
import java.util.Scanner;
/*
UC 1 - Validate First Name
User First Name Starts With Cap and 
has minimum 3 characters
Name: Utakarsh Jain
Date: 15/10/2026
*/

public class UC1FirstName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String name = sc.nextLine();

        String regex = "^[A-Z][a-zA-Z]{2,}$"; //validating the first name

        if (Pattern.matches(regex, name)) { //checking if the first name is valid
            System.out.println("Valid First Name");
        } else { //printing the result
            System.out.println("Invalid First Name");
        }

        sc.close();
    }
}

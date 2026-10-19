
package main.java.Regex;

import java.util.regex.Pattern;
import java.util.Scanner;
/*
UC 2 - Validate Last Name
User Last Name Starts With Cap and has minimum 3 characters
Name: Utakarsh Jain
Date: 15/10/2026
*/
public class UC2LastName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter last name: ");
        String name = sc.nextLine();

        String regex = "^[A-Z][a-zA-Z]{2,}$"; //validating the last name

        System.out.println(Pattern.matches(regex, name)
                ? "Valid Last Name" : "Invalid Last Name"); //validating the last name

        sc.close();
    }
}

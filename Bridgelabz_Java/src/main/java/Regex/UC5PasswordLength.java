
package main.java.Regex;
/*
UC 5 - Validate Password Length
As a User need to follow pre-defined
Password Rules - Rule1 – minimum 8 characters
Name: Utakarsh Jain
Date: 15/10/2026
*/
import java.util.regex.Pattern;
import java.util.Scanner;

public class UC5PasswordLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        String regex = "^.{8,}$"; //validating the password length

        System.out.println(Pattern.matches(regex, password)
                ? "Valid Length" : "Password must have 8 characters"); //printing the result

        sc.close();
    }
}

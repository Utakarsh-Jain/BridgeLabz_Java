
package main.java.Regex;
/*
UC 6 - Validate Password
As a User need to follow pre-defined
Password Rules - Rule1 – minimum 8
Characters
Rule2 – Should have at least 1
Uppercase letter
Name: Utakarsh Jain
Date: 15/10/2026
*/
import java.util.regex.Pattern;
import java.util.Scanner;

public class UC6Uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        String regex = ".*[A-Z].*"; //validating the uppercase letter

        System.out.println(Pattern.matches(regex, password)
                ? "Uppercase Present" : "Uppercase Missing"); //printing the result

        sc.close();
    }
}

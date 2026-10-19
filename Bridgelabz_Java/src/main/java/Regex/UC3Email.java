
package main.java.Regex;
/*
UC 3 - Validate Email ID
- Email ID: abc.xyz@bl.co.in - 
Name: Utakarsh Jain
Date: 15/10/2026
*/
import java.util.regex.Pattern;
import java.util.Scanner;

public class UC3Email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        String regex =
                "^[A-Za-z0-9]+(\\.[A-Za-z0-9]+)?@"
                + "[A-Za-z0-9]+\\.[A-Za-z]{2,}"
                + "(\\.[A-Za-z]{2,})?$"; //validating the email

        System.out.println(Pattern.matches(regex, email)
                ? "Valid Email" : "Invalid Email"); //printing the result

        sc.close();
    }
}



package main.java.Regex;

import java.util.regex.Pattern;
import java.util.Scanner;
/*
UC 4 - Validate Mobile Number
As a User need to follow pre-defined
Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10
digit number
Name: Utakarsh Jain
Date: 15/10/2026
*/
public class UC4MobileNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mobile number: ");
        String mobile = sc.nextLine();

        String regex = "^[0-9]{2} [0-9]{10}$"; //validating the mobile number

        System.out.println(Pattern.matches(regex, mobile)
                ? "Valid Mobile Number" : "Invalid Mobile Number"); //printing the result

        sc.close();
    }
}

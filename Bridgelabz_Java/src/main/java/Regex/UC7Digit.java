
package main.java.Regex;

import java.util.regex.Pattern;
import java.util.Scanner;
/*
Rule3
– Should have at least 1
Number - NOTE – All rules must be passed
Name: Utakarsh Jain
Date: 15/10/2026
*/
public class UC7Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        String regex = ".*[0-9].*";

        System.out.println(Pattern.matches(regex, password)
                ? "Digit Present" : "Digit Missing");

        sc.close();
    }
}

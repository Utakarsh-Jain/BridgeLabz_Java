package main.java.Lambda;

/*
As a User need to follow pre-defined
Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10
digit number

Name: Utakarsh Jain
Date: 15/10/2026

*/
@FunctionalInterface
interface PasswordLengthValidator {
    boolean validate(String password);
}

public class UC5PasswordRule1 {
    public static void main(String[] args) {
        PasswordLengthValidator password =
                pass -> pass != null && pass.length() >= 8;

        System.out.println(password.validate("abcd1234"));
        System.out.println(password.validate("abc123"));
    }
}
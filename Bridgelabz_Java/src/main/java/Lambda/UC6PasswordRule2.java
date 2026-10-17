package main.java.Lambda;
/*
As a User need to follow pre defined Password rules.
Rule1 – minimum 8 Characters
Name: Utakarsh Jain
Date: 15/10/2026
*/
@FunctionalInterface
interface UppercaseValidator {
    boolean validate(String password);
}

public class UC6PasswordRule2 {
    public static void main(String[] args) {
        UppercaseValidator password =
                pass -> pass != null &&
                        pass.matches(".*[A-Z].*");

        System.out.println(password.validate("Abcd1234"));
        System.out.println(password.validate("abcd1234"));
    }
}
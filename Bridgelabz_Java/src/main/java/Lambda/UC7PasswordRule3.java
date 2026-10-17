package main.java.Lambda;
/*
Rule3
– Should have at least 1
Number - NOTE – All rules must be passed
Name: Utakarsh Jain
Date: 15/10/2026
*/
@FunctionalInterface
interface NumberValidator {
    boolean validate(String password);
}

public class UC7PasswordRule3 {
    public static void main(String[] args) {
        NumberValidator password =
                pass -> pass != null &&
                        pass.matches(".*[0-9].*");

        System.out.println(password.validate("abcd1234"));
        System.out.println(password.validate("abcdefgh"));
    }
}
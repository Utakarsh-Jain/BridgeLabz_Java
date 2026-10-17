package main.java.Lambda;
/*
Rule4
- Should have exactly one
Special Character - NOTE – All rules must be passed
Name: Utakarsh Jain
Date: 15/10/2026
*/
@FunctionalInterface
interface SpecialCharacterValidator {
    boolean validate(String password);
}

public class UC8PasswordRule4 {
    public static void main(String[] args) {
        SpecialCharacterValidator password =
                pass -> pass != null &&
                        pass.matches("^(?=.*[A-Z])(?=.*[0-9])[^\\s]+$") &&
                        pass.replaceAll("[a-zA-Z0-9]", "").length() == 1;

        System.out.println(password.validate("Abcd123@"));
        System.out.println(password.validate("Abcd12@@"));
    }
}
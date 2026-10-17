package main.java.Lambda;
/*
User Registration System - UC13
Use Functional Interface and Lambda Expression
Name: Utakarsh Jain
Date: 15/10/2026
*/
@FunctionalInterface
interface UserValidator {
    boolean validate(String input);
}

public class UC13UserRegistration {
    public static void main(String[] args) {

        UserValidator firstName =
                name -> name != null &&
                        name.matches("^[A-Z][a-zA-Z]{2,}$");

        UserValidator lastName =
                name -> name != null &&
                        name.matches("^[A-Z][a-zA-Z]{2,}$");

        UserValidator email =
                mail -> mail != null &&
                        mail.matches("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,}){1,2}$");

        UserValidator mobile =
                number -> number != null &&
                        number.matches("^[0-9]{2} [0-9]{10}$");

        UserValidator password =
                pass -> pass != null &&
                        pass.matches("^(?=.*[A-Z])(?=.*[0-9])[^\\s]{8,}$") &&
                        pass.replaceAll("[a-zA-Z0-9]", "").length() == 1;

        System.out.println("First Name: " +
                firstName.validate("Utakarsh"));

        System.out.println("Last Name: " +
                lastName.validate("Jain"));

        System.out.println("Email: " +
                email.validate("abc.xyz@bl.co.in"));

        System.out.println("Mobile: " +
                mobile.validate("91 9919819801"));

        System.out.println("Password: " +
                password.validate("Abcd123@"));
    }
}
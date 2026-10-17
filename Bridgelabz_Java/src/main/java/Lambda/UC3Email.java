package main.java.Lambda;
/*
As a User need to
enter a valid email - E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl
& co) and 2 optional (xyz & in) with
precise @ and . positions
Name: Utakarsh Jain
Date: 15/10/2026
*/
@FunctionalInterface
interface EmailValidator {
    boolean validate(String email);
}

public class UC3Email {
    public static void main(String[] args) {
        EmailValidator email =
                mail -> mail != null &&
                        mail.matches("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,}){1,2}$");

        System.out.println(email.validate("abc.xyz@bl.co.in"));
        System.out.println(email.validate("abc@"));
    }
}
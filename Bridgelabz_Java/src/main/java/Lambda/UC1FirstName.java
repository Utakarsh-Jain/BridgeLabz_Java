package main.java.Lambda;

/*
First name starts with Cap and has
minimum 3 characters
Name: Utakarsh Jain
Date: 15/10/2026
*/

@FunctionalInterface
interface FirstNameValidator {
    boolean validate(String name);
}

public class UC1FirstName {
    public static void main(String[] args) {
        FirstNameValidator firstName = name -> name != null && name.matches("^[A-Z][a-zA-Z]{2,}$"); // Regex
        System.out.println(firstName.validate("Utakarsh"));
        System.out.println(firstName.validate("ut"));
    }
}
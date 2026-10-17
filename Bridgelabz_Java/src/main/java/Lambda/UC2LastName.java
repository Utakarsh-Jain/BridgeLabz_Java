package main.java.Lambda;

/*
Last name starts with Cap and has
minimum 3 characters
Name: Utakarsh Jain
Date: 15/10/2026
*/
@FunctionalInterface
interface LastNameValidator {
    boolean validate(String name);
}

public class UC2LastName {
    public static void main(String[] args) {
        LastNameValidator lastName =
                name -> name != null &&
                        name.matches("^[A-Z][a-zA-Z]{2,}$"); //

        System.out.println(lastName.validate("Jain"));
        System.out.println(lastName.validate("ja"));
    }
}

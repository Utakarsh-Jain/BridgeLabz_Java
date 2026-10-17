package main.java.Lambda;

@FunctionalInterface
interface MobileValidator {
    boolean validate(String mobile);
}

public class UC4Mobile {
    public static void main(String[] args) {
        MobileValidator mobile =
                number -> number != null &&
                        number.matches("^[0-9]{2} [0-9]{10}$");

        System.out.println(mobile.validate("91 9919819801"));
        System.out.println(mobile.validate("9919819801"));
    }
}
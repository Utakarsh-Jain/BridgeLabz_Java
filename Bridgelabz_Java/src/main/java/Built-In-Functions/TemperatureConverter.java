/*

. Temperature Converter: 
○ Write a program that converts temperatures between Fahrenheit and Celsius. ○ The program should have separate functions for converting from Fahrenheit to Celsius and from Celsius to Fahrenheit. 

Name : Utakarsh Jain
Date : 28/09/2026

*/
import java.util.Scanner;
public class TemperatureConverter {

    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32; //Calculating the temperature in Fahrenheit
    }
    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9; //Calculating the temperature in Celsius
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();

        if (choice == 1) {
            System.out.println("Temperature = "
                    + celsiusToFahrenheit(temperature) + " °F"); //Printing the temperature in Fahrenheit
        } else if (choice == 2) {
            System.out.println("Temperature = "
                    + fahrenheitToCelsius(temperature) + " °C"); //Printing the temperature in Celsius
        } else {
            System.out.println("Invalid choice."); //Printing that the choice is invalid
        }

        scanner.close();
    }
}
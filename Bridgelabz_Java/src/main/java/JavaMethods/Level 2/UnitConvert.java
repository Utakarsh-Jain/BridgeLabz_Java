/*
Problem 6 - GCR Array Method Level 2
Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g. 
public static double convertFarhenheitToCelsius(double farhenheit) => 
Method to convert Fahrenheit to Celsius and return the value. Use the following code  double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
Method to convert Celsius to Fahrenheit and return the value. Use the following code  double celsius2farhenheit = (celsius * 9 / 5) + 32;
Method to convert pounds to kilograms and return the value. Use the following code  double pounds2kilograms = 0.453592;
Method to convert kilograms to pounds and return the value. Use the following code  double kilograms2pounds = 2.20462; 
Method to convert gallons to liters and return the value. Use following code to convert   double gallons2liters = 3.78541; 
Method to convert liters to gallons and return the value. Use following code to convert  double liters2gallons = 0.264172; 

Author : <Utakarsh Jain>
* Date : 23-09-2026
*/

import java.util.Scanner;
class UnitConvert {
    public static double convertFarhenheitToCelsius(double farhenheit) { //method to convert farhenheit to celsius
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }
    public static double convertCelsiusToFarhenheit(double celsius) { //method to convert celsius to farhenheit
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }
    public static double convertPoundsToKilograms(double pounds) { //method to convert pounds to kilograms
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }
    public static double convertKilogramsToPounds(double kilograms) { //method to convert kilograms to pounds
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }
    public static double convertGallonsToLiters(double gallons) { //method to convert gallons to liters
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }
    public static double convertLitersToGallons(double liters) { //method to convert liters to gallons
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
    public static void main(String args[]) { //main method
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter value in farhenheit: ");
        double farhenheit = sc.nextDouble();
        System.out.print("Enter value in celsius: ");
        double celsius = sc.nextDouble();
        System.out.print("Enter value in pounds: ");
        double pounds = sc.nextDouble();
        System.out.print("Enter value in kilograms: ");
        double kilograms = sc.nextDouble();
        System.out.print("Enter value in gallons: ");
        double gallons = sc.nextDouble();
        System.out.print("Enter value in liters: ");
        double liters = sc.nextDouble();
        System.out.println("Farhenheit to Celsius: " + convertFarhenheitToCelsius(farhenheit));
        System.out.println("Celsius to Farhenheit: " + convertCelsiusToFarhenheit(celsius));
        System.out.println("Pounds to Kilograms: " + convertPoundsToKilograms(pounds));
        System.out.println("Kilograms to Pounds: " + convertKilogramsToPounds(kilograms));
        System.out.println("Gallons to Liters: " + convertGallonsToLiters(gallons));
        System.out.println("Liters to Gallons: " + convertLitersToGallons(liters));
        sc.close();
    }
}
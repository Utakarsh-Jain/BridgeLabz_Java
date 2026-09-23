/*
Problem 4 - GCR Array Method Level 2
Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g. 
Method To convert kilometers to miles and return the value. Use the following code  double km2miles = 0.621371;
Method to convert miles to kilometers and return the value. Use the following code  double miles2km = 1.60934;
Method to convert meters to feet and return the value. Use the following code to convert  double meters2feet = 3.28084;
Method to convert feet to meters and return the value. Use the following code to convert  double feet2meters = 0.3048;

Author : <Utakarsh Jain>
* Date : 23-09-2026
*/

import java.util.Scanner;
class UnitConverter {
    public static double convertKmToMiles(double km) { //method to convert kilometers to miles
        double km2miles = 0.621371;
        return km * km2miles;
    }
    public static double convertMilesToKm(double miles) { //method to convert miles to kilometers
        double miles2km = 1.60934;
        return miles * miles2km;
    }
    public static double convertMetersToFeet(double meters) { //method to convert meters to feet
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }
    public static double convertFeetToMeters(double feet) { //method to convert feet to meters
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
    public static void main(String args[]) { //main method
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter value in kilometers: ");
        double km = sc.nextDouble();
        System.out.print("Enter value in miles: ");
        double miles = sc.nextDouble();
        System.out.print("Enter value in meters: ");
        double meters = sc.nextDouble();
        System.out.print("Enter value in feet: ");
        double feet = sc.nextDouble();
        System.out.println("Kilometers to Miles: " + convertKmToMiles(km));
        System.out.println("Miles to Kilometers: " + convertMilesToKm(miles));
        System.out.println("Meters to Feet: " + convertMetersToFeet(meters));
        System.out.println("Feet to Meters: " + convertFeetToMeters(feet));
        sc.close();
    }
}
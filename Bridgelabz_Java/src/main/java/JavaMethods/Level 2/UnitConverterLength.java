/*
Problem 5 - GCR Array Method Level 2
Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g. 
public static double convertYardsToFeet(double yards) => 
Method to convert yards to feet and return the value. Use following code to convert  double yards2feet = 3;
Method to convert feet to yards and return the value. Use following code to convert  double feet2yards = 0.333333;
Method to convert meters to inches and return the value. Use following code to convert  double meters2inches = 39.3701;
Method to convert inches to meters and return the value. Use following code to convert  double inches2meters = 0.0254;
Method to convert inches to centimeters and return the value. Use the following code  double inches2cm = 2.54;
Author : <Utakarsh Jain>
* Date : 23-09-2026
*/

import java.util.Scanner;
class UnitConverterLength {
    public static double convertYardsToFeet(double yards) { //method to convert yards to feet
        double yards2feet = 3;
        return yards * yards2feet;
    }
    public static double convertFeetToYards(double feet) { //method to convert feet to yards
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }
    public static double convertMetersToInches(double meters) { //method to convert meters to inches
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }
    public static double convertInchesToMeters(double inches) { //method to convert inches to meters
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }
    public static double convertInchesToCentimeters(double inches) { //method to convert inches to centimeters
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter value in yards: ");
        double yards = sc.nextDouble();
        System.out.print("Enter value in feet: ");
        double feet = sc.nextDouble();
        System.out.print("Enter value in meters: ");
        double meters = sc.nextDouble();
        System.out.print("Enter value in inches: ");
        double inches = sc.nextDouble();
        System.out.println("Yards to Feet: " + convertYardsToFeet(yards));
        System.out.println("Feet to Yards: " + convertFeetToYards(feet));
        System.out.println("Meters to Inches: " + convertMetersToInches(meters));
        System.out.println("Inches to Meters: " + convertInchesToMeters(inches));
        System.out.println("Inches to Centimeters: " + convertInchesToCentimeters(inches));
        sc.close();
    }
}

/*
Problem 1 - Java Strings Level 3
An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in a team of 10 members. For this create a program to find the BMI and display the height, weight, BMI, and status of each individual
Hint => 
Take user input for the person's weight (kg) and height (cm) and store it in the corresponding 2D array of 10 rows. The First Column stores the weight and the second column stores the height in cm
Create a Method to find the BMI and status of every person given the person's height and weight and return the 2D String array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Create a Method that takes the 2D array of height and weight as parameters. Calls the user-defined method to compute the BMI and the BMI Status and stores in a 2D String array of height, weight, BMI, and status.
Create a method to display the 2D string array in a tabular format of Person's Height, Weight, BMI, and the Status
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
Name : Utakarsh Jain
Date : 26-09-2026

*/

import java.util.Scanner;
class BMI {
    public static String[][] calculateBMI(double weight[], double height[]) {
        String bmi[][] = new String[10][4]; //Create a Method to find the BMI and status of every person given the person's height and weight and return the 2D String array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
        for (int i = 0; i < 10; i++) {
            double bmiValue = weight[i] / (height[i] * height[i]); //Create a Method to find the BMI and status of every person given the person's height and weight and return the 2D String array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
            String status;
            if (bmiValue < 18.5) { //Calculate the BMI and the BMI Status
                status = "Underweight";
            } else if (bmiValue < 25) { //Calculate the BMI and the BMI Status
                status = "Normal weight";
            } else if (bmiValue < 30) { //Calculate the BMI and the BMI Status
                status = "Overweight";
            } else { //Calculate the BMI and the BMI Status
                status = "Obesity";
            }
            bmi[i][0] = String.valueOf(weight[i]);
            bmi[i][1] = String.valueOf(height[i]);
            bmi[i][2] = String.valueOf(bmiValue);
            bmi[i][3] = status;
        }
        return bmi;
    }
    public static void displayBMI(String bmi[][]) { //Create a method to display the 2D string array in a tabular format of Person's Height, Weight, BMI, and the Status
        System.out.println("Weight\tHeight\tBMI\tStatus");
        for (int i = 0; i < 10; i++) { //Create a method to display the 2D string array in a tabular format of Person's Height, Weight, BMI, and the Status
            System.out.println(bmi[i][0] + "\t" + bmi[i][1] + "\t" + bmi[i][2] + "\t" + bmi[i][3]);
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); //main function takes user inputs, calls the user-defined methods, and displays the result.
        double weight[] = new double[10];
        double height[] = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight of person " + (i + 1) + " (kg): ");
            weight[i] = sc.nextDouble();
            System.out.print("Enter height of person " + (i + 1) + " (cm): ");
            height[i] = sc.nextDouble();
        }
        String bmi[][] = calculateBMI(weight, height);
        displayBMI(bmi);
        sc.close();
    }
}
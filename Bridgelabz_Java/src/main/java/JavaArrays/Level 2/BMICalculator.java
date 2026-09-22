/*Problem 6 - GCR Java Arrays Level 2
An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
Hint => 
Take input for a number of persons
Create arrays to store the weight, height, BMI, and weight status of the persons
Take input for the weight and height of the persons
Calculate the BMI of all the persons and store them in an array and also find the weight status of the persons
Display the height, weight, BMI, and weight status of each person
Use the table to determine the weight status of the person
Author : <Utakarsh Jain>
* Date : 22-09-2026
*/

import java.util.Scanner;
public class BMICalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Invalid number of persons.");
            return;
        }
        double weight[] = new double[number];
        double height[] = new double[number];
        double bmi[] = new double[number];
        String weightStatus[] = new String[number];
        // Take input for weight and height
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.print("Enter weight in kg: ");
            weight[i] = sc.nextDouble();
            System.out.print("Enter height in meters: ");
            height[i] = sc.nextDouble();
            if (weight[i] <= 0 || height[i] <= 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--;
            }
        }
        // Calculate BMI and weight status
        for (int i = 0; i < number; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] < 25) {
                weightStatus[i] = "Normal";
            } else if (bmi[i] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        // Display results
        System.out.println("\nHeight\tWeight\tBMI\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.println(height[i] + "\t" + weight[i] + "\t" + bmi[i] + "\t" + weightStatus[i]
            );
        }
        sc.close();
    }
}
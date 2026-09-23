/*
Problem 10 - GCR Array Method Level 2
An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in the team of 10 members. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
Hint => 
Take user input in double for the weight (in kg) of the person and height (in cm) for the person and and store it in the corresponding 2D array of 10 rows and 3 columns. The First Column storing the weight, the second column storing the height in cm and the third column is the BMI
Create a Method to find the BMI of every person and populate the array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Create a Method to determine the BMI status using the logic shown in the figure below. and return the array of all the persons BMI Status. 
Author : <Utakarsh Jain>
* Date : 23-09-2026
*/

import java.util.Scanner;
public class BMI {
    public double calculateBMI(double weight, double height) { //method to calculate BMI
        double bmi = weight / (height * height); //calculating BMI using the formula
        return bmi;
    }
    public String getBMICategory(double bmi) { //method to determine BMI category
        if (bmi < 18.5) { //if BMI is less than 18.5 it is underweight
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) { //if BMI is between 18.5 and 25 it is normal weight
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 30) { //if BMI is between 25 and 30 it is overweight
            return "Overweight";
        } else { //if BMI is greater than 30 it is obesity
            return "Obesity";
        }
    }
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        double[][] persons = new double[10][3]; 
        BMI obj = new BMI(); 
        for (int i = 0; i < persons.length; i++) { 
            System.out.print("Enter weight of person " + (i + 1) + " (in kg): ");
            persons[i][0] = sc.nextDouble(); //storing weight
            System.out.print("Enter height of person " + (i + 1) + " (in cm): ");
            persons[i][1] = sc.nextDouble(); //storing height
        }
        for (int i = 0; i < persons.length; i++) { //loop to calculate BMI and store it in the array
            persons[i][2] = obj.calculateBMI(persons[i][0], persons[i][1]); //calculating and storing BMI
        }
        System.out.println("Weight\t\tHeight\t\tBMI\t\tStatus"); 
        for (int i = 0; i < persons.length; i++) { 
            System.out.println(persons[i][0] + "\t\t" + persons[i][1] + "\t\t" + persons[i][2] + "\t\t" + obj.getBMICategory(persons[i][2])); 
        }
        sc.close(); 
    }
}

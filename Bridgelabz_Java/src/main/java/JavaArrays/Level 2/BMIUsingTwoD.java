/*
Problem 7 - GCR Java Arrays Level 2
Rewrite the above program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons
Hint => 
Take input for a number of persons
Create a multi-dimensional array to store weight, height and BMI. Also create an to store the weight status of the persons
       double[][] personData = new double[number][3];
       String[] weightStatus = new String[number];
Take input for weight and height of the persons and for negative values, ask the user to enter positive values
Calculate BMI of all the persons and store them in the personData array and also find the weight status and put them in the weightStatus array
Display the height, weight, BMI and status of each person

Author : <Utakarsh Jain>
* Date : 22-09-2026
*/

import java.util.Scanner;
public class BMIUsingTwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid number of persons.");
            return;
        }
        double personData[][] = new double[number][3];
        String weightStatus[] = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.print("Enter weight in kg: ");
            personData[i][0] = sc.nextDouble();
            System.out.print("Enter height in meters: ");
            personData[i][1] = sc.nextDouble();
            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--;
            }
        }
        // Calculate BMI and status
        for (int i = 0; i < number; i++) {
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\nWeight\tHeight\tBMI\tStatus");

        for (int i = 0; i < number; i++) {
            System.out.println(
                    personData[i][0] + "\t" +
                    personData[i][1] + "\t" +
                    personData[i][2] + "\t" +
                    weightStatus[i]
            );
        }

        sc.close();
    }
}
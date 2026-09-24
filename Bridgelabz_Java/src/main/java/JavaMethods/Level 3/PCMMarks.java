/*
* Problem 12 - Student Scores Method Level 3
Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the total, average, and the percentage score 

Hint => 
Take input for the number of students
Write a method to generate random 2-digit scores for Physics, Chemistry, and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using the Math.round() method. 
Finally, write a Method to display the scorecard of all students with their scores, total, average, and percentage in a tabular format using "\t". 

Name: <Utakarsh Jain>
* Date : 24-09-2026

*/

import java.util.Scanner;
class PCMMarks {

    public static int[][] generateScores(int numberOfStudents) {
        int scores[][] = new int[numberOfStudents][3];
        for (int i = 0; i < numberOfStudents; i++) { //Generating random 2-digit scores for Physics, Chemistry, and Math (PCM) for the students and return the scores.
            scores[i][0] = (int) (Math.random() * 90) + 10;
            scores[i][1] = (int) (Math.random() * 90) + 10;
            scores[i][2] = (int) (Math.random() * 90) + 10;
        }
        return scores;
    }
    public static double[][] calculateResults(int[][] scores) { //Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values.
        double results[][] = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2]; //Calculating total
            double average = (double) total / 3; //Calculating average
            double percentage = (double) total / 300 * 100; //Calculating percentage
            average = Math.round(average * 100.0) / 100.0; //Rounding off the average to 2 digits
            percentage = Math.round(percentage * 100.0) / 100.0; //Rounding off the percentage to 2 digits
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }
    public static void displayScorecard(int scores[][], double results[][]) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t" + results[i][0] + "\t" + results[i][1] + "\t" + results[i][2]);
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();
        int scores[][] = generateScores(numberOfStudents);
        double results[][] = calculateResults(scores);
        displayScorecard(scores, results);
        sc.close();
    }
}
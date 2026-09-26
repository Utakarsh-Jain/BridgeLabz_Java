/*
Problem 10 - Java Strings Level 2
Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade as shown in figure below

Hint => 
Write a method to generate random 2-digit scores for Physics, Chemistry and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using Math.round() method
Write a Method to calculate the grade based on the percentage as shown in the ref table and return a 2D array of students' grade
Finally write a Method to display the scorecard of all students with their scores, total, average, percentage, and grade in a tabular format. 
Name : Utakarsh Jain
Date : 26-09-2026
*/

class StudentScorecard {
    public static int[][] generateScores(int numberOfStudents) {
        int scores[][] = new int[numberOfStudents][3];
        for (int i = 0; i < numberOfStudents; i++) { //Generate random 2-digit scores for Physics, Chemistry and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
            scores[i][0] = (int) (Math.random() * 90) + 10;
            scores[i][1] = (int) (Math.random() * 90) + 10;
            scores[i][2] = (int) (Math.random() * 90) + 10;        }
        return scores;
        }
    public static double[][] calculateResults(int[][] scores) {
        double results[][] = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) { //Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using Math.round() method
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = (double) total / 3;
            double percentage = ((double) total / 300) * 100;
            average = Math.round(average * 100.0) / 100.0; //Round off the values to 2 Digits
            percentage = Math.round(percentage * 100.0) / 100.0; //Round off the values to 2 Digits
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }
    public static String calculateGrade(double percentage) { //Write a Method to calculate the grade based on the percentage as shown in the ref table and return a 2D array of students' grade
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B+";
        } else if (percentage >= 60) {
            return "B";
        } else if (percentage >= 50) {
            return "C";
        } else if (percentage >= 40) {
            return "D";
        } else {
            return "F";
        }
    }
    public static String[][] createGradeTable(double[][] results) {
        String grades[][] = new String[results.length][1];
        for (int i = 0; i < results.length; i++) {
            grades[i][0] = calculateGrade(results[i][2]);
        }
        return grades;
    }
    public static void displayScorecard(int scores[][],double results[][],String grades[][]) {
        //finally write a Method to display the scorecard of all students with their scores, total, average, percentage, and grade in a tabular format.
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t" + (int) results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "%\t\t" + grades[i][0]);
        }
    }
    public static void main(String args[]) {
        int numberOfStudents = 5;
        int scores[][] = generateScores(numberOfStudents);
        double results[][] = calculateResults(scores);
        String grades[][] = createGradeTable(results);
        displayScorecard(scores, results, grades);
    }
}
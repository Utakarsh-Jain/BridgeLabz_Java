/*
Problem 8 - Java Strings Level 2
Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint => 
Create a method to define the random 2-digit age of several students provided as method parameters and return a 1D array of ages of n students
Create a method that takes an array of age as a parameter and returns a 2D String array of age and a boolean true or false to indicate can and cannot vote. Inside the method firstly validate the age for a negative number, if a negative cannot vote. For valid age check for age is 18 or above to set true to indicate can vote.
Create a method to display the 2D array in a tabular format.
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
Name: <Utakarsh Jain>
Date: 26/09/2026

*/

class StudentVotingEligible {
    public static int[] generateAges(int numberOfStudents) {
        int ages[] = new int[numberOfStudents]; // Create a 1D array of size numberOfStudents
        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = (int) (Math.random() * 90) + 10; // Generate random 2-digit age between 10 and 99
        }
        return ages;
    }
    public static String[][] checkVotingEligibility(int ages[]) {
        String result[][] = new String[ages.length][2]; // Create a 2D String array of size ages.length rows and 2 columns
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i]; // Get the age from the array
            boolean canVote = age >= 18; // Check if the age is greater than or equal to 18
            if (age < 0) {
                canVote = false; // If the age is negative, set canVote to false
            }
            result[i][0] = String.valueOf(age); // Convert the age to String and store it in the first column of the result array
            result[i][1] = String.valueOf(canVote); // Convert the boolean canVote to String and store it in the second column of the result array
        }
        return result;
    }
    public static void displayTable(String result[][]) {
        System.out.println("Student\tAge\tCan Vote"); // Print the header for the table
        for (int i = 0; i < result.length; i++) {
            System.out.println((i + 1) + "\t" + result[i][0] + "\t" + result[i][1]); // Print the result in tabular format
        }
    }
    public static void main(String args[]) {
        int numberOfStudents = 10;
        int ages[] = generateAges(numberOfStudents);
        String result[][] = checkVotingEligibility(ages);
        displayTable(result);
    }
}

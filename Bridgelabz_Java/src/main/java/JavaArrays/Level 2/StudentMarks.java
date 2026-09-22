/*Problem 8 - GCR Java Arrays Level 2
Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade  as per the following guidelines 

Hint => 
Take input for the number of students
Create arrays to store marks, percentages, and grades of the students
Take input for marks of students in physics, chemistry, and maths. If the marks are negative, ask the user to enter positive values and decrement the index
Calculate the percentage and grade of the students based on the percentage
Display the marks, percentages, and grades of each student

Author : <Utakarsh Jain>
* Date : 22-09-2026
*/

import java.util.Scanner;
public class StudentMarks {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Invalid number of students.");
            return;
        }
        double physics[] = new double[number];
        double chemistry[] = new double[number];
        double maths[] = new double[number];
        double percentage[] = new double[number];
        String grade[] = new String[number];
        // Take marks input
        for (int i = 0; i < number; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Enter Physics marks: ");
            physics[i] = sc.nextDouble();
            System.out.print("Enter Chemistry marks: ");
            chemistry[i] = sc.nextDouble();
            System.out.print("Enter Maths marks: ");
            maths[i] = sc.nextDouble();
            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks. Please enter positive values.");
                i--;
            }
        }
        // Calculate percentage and grade
        for (int i = 0; i < number; i++) {
            percentage[i] =
                    (physics[i] + chemistry[i] + maths[i]) / 3;

            if (percentage[i] >= 90) {
                grade[i] = "A";
            } else if (percentage[i] >= 80) {
                grade[i] = "B";
            } else if (percentage[i] >= 70) {
                grade[i] = "C";
            } else if (percentage[i] >= 60) {
                grade[i] = "D";
            } else if (percentage[i] >= 50) {
                grade[i] = "E";
            } else {
                grade[i] = "F";
            }
        }
        // Display results
        System.out.println("\nPhysics\tChemistry\tMaths\tPercentage\tGrade");

        for (int i = 0; i < number; i++) {
            System.out.println(
                    physics[i] + "\t" +
                    chemistry[i] + "\t\t" +
                    maths[i] + "\t" +
                    percentage[i] + "\t\t" +
                    grade[i]
            );
        }

        sc.close();
    }
}
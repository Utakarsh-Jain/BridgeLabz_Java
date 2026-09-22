/*Problem 9 - GCR Java Arrays Level 2

Rewrite the  program 8 to store the marks of the students in physics, chemistry, and maths in a 2D array and then compute the percentage and grade
Hint => 
All the steps are the same as the problem 8 except the marks are stored in a 2D array
Use the 2D array to calculate the percentages, and grades of the students


Author : <Utakarsh Jain>
* Date : 22-09-2026
*/

import java.util.Scanner;
public class StudentMarks2D {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Invalid number of students.");
            return;
        }
        double marks[][] = new double[number][3];
        double percentage[] = new double[number];
        String grade[] = new String[number];
        // Take marks input
        for (int i = 0; i < number; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Enter Physics marks: ");
            marks[i][0] = sc.nextDouble();
            System.out.print("Enter Chemistry marks: ");
            marks[i][1] = sc.nextDouble();
            System.out.print("Enter Maths marks: ");
            marks[i][2] = sc.nextDouble();
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks. Please enter positive values.");
                i--;
            }
        }
        // Calculate percentage and grade
        for (int i = 0; i < number; i++) {
            percentage[i] =
                    (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

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
                    marks[i][0] + "\t" +
                    marks[i][1] + "\t\t" +
                    marks[i][2] + "\t" +
                    percentage[i] + "\t\t" +
                    grade[i]
            );
        }
        sc.close();
    }
}
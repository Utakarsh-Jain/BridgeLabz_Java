import java.util.Scanner;
/*
Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines 

* Author : <Utakarsh Jain>
* Date : 21-09-2026
*/
class StudentGrade {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics marks:");
        double physicsMarks = sc.nextDouble();
        System.out.print("Enter Chemistry marks:");
        double chemistryMarks = sc.nextDouble();
        System.out.print("Enter Maths marks:");
        double mathsMarks = sc.nextDouble();
        double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        double averageMarks = totalMarks / 3;
        String grade;
        String remarks;
        if (averageMarks >= 90) {
            grade = "A";
            remarks = "Excellent";
        } else if (averageMarks >= 80) {
            grade = "B";
            remarks = "Very Good";
        } else if (averageMarks >= 70) {
            grade = "C";
            remarks = "Good";
        } else if (averageMarks >= 60) {
            grade = "D";
            remarks = "Average";
        } else {
            grade = "F";
            remarks = "Needs Improvement";
        }
        System.out.println("Average Mark: " + averageMarks);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        sc.close();
    }
}

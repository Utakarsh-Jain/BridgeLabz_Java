/*
Problem 1 : Java Class And Object Level 2
Program to Simulate Student Report
Problem Statement: Create a Student class with attributes name, rollNumber, and marks. Add two methods:
To calculate the grade based on the marks.
To display the student's details and grade.
Explanation: The Student class organizes all relevant details about a student as attributes. Methods are used to calculate the grade and provide a way to display all information.
Name: Utakarsh Jain
Date : 29/09/2026

*/

import java.util.Scanner;
class Student {
    String name;
    int rollNumber;
    double marks;
    String calculateGrade() { //Method to calculate the grade of the student & return the grade.
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else if (marks >= 50) {
            return "E";
        } else {
            return "F";
        }
    }
    void displayDetails() { // Method to display the details of the student
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}
public class StudentDetails {
    public static void main(String args[]) {
        Student student = new Student(); //Creating the object of the class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the student: ");
        student.name = sc.nextLine();
        System.out.print("Enter the roll number of the student: ");
        student.rollNumber = sc.nextInt();
        System.out.print("Enter the marks of the student: ");
        student.marks = sc.nextDouble(); 
        student.displayDetails(); //Invoking the method by calling it with the help of the object.
        sc.close();
    }
}
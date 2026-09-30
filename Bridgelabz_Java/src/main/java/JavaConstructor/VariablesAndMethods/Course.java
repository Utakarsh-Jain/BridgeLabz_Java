/*
Problem 2 : Variables and methods 
Online Course Management
Design a Course class with:
Instance Variables: courseName, duration, fee.
Class Variable: instituteName (common for all courses).
Methods:
An instance method displayCourseDetails() to display the course details.
A class method updateInstituteName() to modify the institute name for all courses.
Name : Utakarsh Jain
Date : 30/09/2026

*/


package main.java.JavaConstructor.VariablesAndMethods;

import java.util.*;

public class Course {
    String courseName;
    String duration;
    double fee;
    static String instituteName;
    Course(String courseName, String duration, double fee) { // Parameterized Constructor
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
        instituteName = "Utakarsh"; // Default value for instituteName
    }
    void displayCourseDetails() { // Instance method to display the details of a course
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + instituteName);
    }
    static void updateInstituteName(String instituteName) { // Class method to update the institute name
        Course.instituteName = instituteName;
    }
    public static void main(String args[]) { // Main method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of courses");
        int n = sc.nextInt();
        Course courses[] = new Course[n];
        for (int i = 0; i < n; i++) { // Loop to create courses
            System.out.println("Enter the course name");
            String courseName = sc.next();
            System.out.println("Enter the duration");
            String duration = sc.next();
            System.out.println("Enter the fee");
            double fee = sc.nextDouble();
            courses[i] = new Course(courseName, duration, fee);
        }
        for (int i = 0; i < n; i++) { // Loop to display courses
            courses[i].displayCourseDetails();
        }
        System.out.println("Enter the new institute name");
        String instituteName = sc.next();
        Course.updateInstituteName(instituteName);
        for (int i = 0; i < n; i++) { // Loop to display courses
            courses[i].displayCourseDetails();
        }
        sc.close();
    }
}

/*

5: University Student Management
Create a Student class to manage student data with the following features:
Static:
A static variable universityName shared across all students.
A static method displayTotalStudents() to show the number of students enrolled.
This:
Use this in the constructor to initialize name, rollNumber, and grade.
Final:
Use a final variable rollNumber for each student that cannot be changed.
Instanceof:
Check if a given object is an instance of the Student class before performing operations like displaying or updating grades.
Name : Utakarsh Jain
Date : 30/09/2026
*/

import java.util.*;

class Student { 
    static String universityName; //Static variable
    static int totalStudents = 0; //Static variable
    String name; //Instance variable
    final int rollNumber; //Final variable
    double grade; //Instance variable

    Student(String name, int rollNumber, double grade) { //Parameterized Constructor
        this.name = name; //Using 'this' keyword to resolve ambiguity
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++; //Incrementing the total number of students
    }

    static void displayTotalStudents() { //Displaying the total number of students
        System.out.println("Total Students: " + totalStudents);
    }

    void displayDetails() { //Displaying the student details
        System.out.println("University: " + universityName);
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }

    void updateGrade(double grade) { //Updating the grade
        this.grade = grade;
    }
}

public class UniversityStudentManagement { //Main class
    public static void main(String args[]) { //Main method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter University Name:");
        Student.universityName = sc.nextLine(); //Setting the university name
        System.out.println("Enter Student Details:");
        System.out.print("Enter Student Name:");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number:");
        int rollNumber = sc.nextInt();
        System.out.print("Enter Grade:");
        double grade = sc.nextDouble();
        Student s1 = new Student(name, rollNumber, grade); //Creating an object of Student class
        if(s1 instanceof Student) { // Checking if the object is an instance of Student class
            System.out.println("\nStudent Details:");
            s1.displayDetails();
            System.out.println("\nUpdating Grade...");
            System.out.print("Enter New Grade:");
            double newGrade = sc.nextDouble();
            s1.updateGrade(newGrade); //Updating the grade
            s1.displayDetails(); //Displaying the updated details
        }
        System.out.println();
        Student.displayTotalStudents(); //Displaying the total number of students
        sc.close();
    }
}

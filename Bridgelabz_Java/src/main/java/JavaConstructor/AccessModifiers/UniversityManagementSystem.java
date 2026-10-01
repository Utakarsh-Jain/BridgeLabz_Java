/*

Problem 1: University Management System
Create a Student class with:
rollNumber (public).
name (protected).
CGPA (private).
Write methods to:
Access and modify CGPA using public methods.
Create a subclass PostgraduateStudent to demonstrate the use of protected members.
Name : Utakarsh Jain
Date : 30/09/2026
*/

package main.java.JavaConstructor.AccessModifiers;

import java.util.Scanner;

class Student {
    public int rollNumber; //initialized as public 
    protected String name; //initialized as protected 
    private double cgpa; //initialized as private
    Student(int rollNumber, String name, double cgpa) { // Parameterized Constructor
         //this is used to refer to the current object
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }
    public double getCgpa() { // Public method to get the CGPA
        return cgpa;
    }
    public void setCgpa(double cgpa) { // Public method to set the CGPA
        this.cgpa = cgpa;
    }
}
class PostgraduateStudent extends Student { // Subclass of Student
    PostgraduateStudent(int rollNumber, String name, double cgpa) { // Parameterized Constructor
        super(rollNumber, name, cgpa); // Calls the constructor of the superclass
    }
}

public class UniversityManagementSystem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll number:");
        int rollNumber = sc.nextInt();
        System.out.println("Enter the name:");
        String name = sc.next();
        System.out.println("Enter the CGPA:");
        double cgpa = sc.nextDouble();
        Student student = new Student(rollNumber, name, cgpa); // Creating an object of Student class
        System.out.println("Roll Number: " + student.rollNumber); 
        System.out.println("Name: " + student.name); // Accessing protected member
        System.out.println("CGPA: " + student.getCgpa()); // Accessing private member through public method
        student.setCgpa(10); 
        System.out.println("CGPA: " + student.getCgpa()); // Accessing private member through public method
        PostgraduateStudent postgraduateStudent = new PostgraduateStudent(2, "Utakarsh", 9.9); 
        System.out.println("Roll Number: " + postgraduateStudent.rollNumber);
        System.out.println("Name: " + postgraduateStudent.name);
        System.out.println("CGPA: " + postgraduateStudent.getCgpa());
        postgraduateStudent.setCgpa(10);
        System.out.println("CGPA: " + postgraduateStudent.getCgpa());
        sc.close();
    }
}

/*
Problem 1 : Java Class And Object Level 1
Program to Display Employee Details
Problem Statement: Write a program to create an Employee class with attributes name, id, and salary. Add a method to display the details.
Name: Utakarsh Jain
Date : 29/09/2026

*/

import java.util.Scanner;

class Employee {
    String name; //attribute
    int id; //attribute
    double salary; //attribute

    void displayDetails() { //Method to print out the attributes of the class Employee
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}
public class EmployeeDetails {
    public static void main(String args[]) {
        Employee employee = new Employee(); //Create an object of class employee
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the employee: ");
        employee.name = sc.nextLine();
        System.out.print("Enter the ID of the employee: ");
        employee.id = sc.nextInt();
        System.out.print("Enter the salary of the employee: ");
        employee.salary = sc.nextDouble(); 
        employee.displayDetails(); //Calling the display method
        sc.close();
    }
}







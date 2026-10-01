/*

3: Employee Management System
Design an Employee class with the following features:
Static:
A static variable companyName shared by all employees.
A static method displayTotalEmployees() to show the total number of employees.
This:
Use this to initialize name, id, and designation in the constructor.
Final:
Use a final variable id for the employee ID, which cannot be modified after assignment.
Instanceof:
Check if a given object is an instance of the Employee class before printing the employee details.
Name : Utakarsh Jain
Date : 30/09/2026

*/

import java.util.Scanner;
class Employee {
    static String companyName = "ABC Corp"; //Static variable
    static int totalEmployees = 0; //Static variable
    String name; //Instance variable
    final int id; //Final variable
    String designation; //Instance variable
    double salary; //Instance variable
    Employee(String name, int id, String designation, double salary) { //Parameterized Constructor
        this.name = name; //Using 'this' keyword to resolve ambiguity
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        totalEmployees++;
    }
    static void displayTotalEmployees() { //Displaying the total employees
        System.out.println("Total Employees: " + totalEmployees);
    }
    void displayDetails() { //Displaying the employee details
        System.out.println("Company: " + companyName);
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
    public static void main(String args[]) { //Main method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Details:");
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Designation: ");
        String designation = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        Employee e1 = new Employee(name, id, designation, salary); //Creating an object of Employee class
        if(e1 instanceof Employee) { //Checking if the object is an instance of Employee class
            System.out.println("\nEmployee Details:");
            e1.displayDetails();
        }
        System.out.println();
        Employee.displayTotalEmployees();
        sc.close();
    }
}

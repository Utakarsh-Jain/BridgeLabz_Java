/* 

Employee Records
Develop an Employee class with:
employeeID (public).
department (protected).
salary (private).
Write methods to:
Modify salary using a public method.
Create a subclass Manager to access employeeID and department.
Name : Utakarsh Jain
Date : 30/09/2026
*/


package main.java.JavaConstructor.AccessModifiers;

import java.util.Scanner;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;
    Employee(int employeeID, String department, double salary) { // Parameterized Constructor
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    public double getSalary() { // Public method to get the salary
        return salary;
    }
    public void setSalary(double salary) { // Public method to set the salary
        this.salary = salary;
    }
}
class Manager extends Employee {
    Manager(int employeeID, String department, double salary) { // Parameterized Constructor
        super(employeeID, department, salary); // Calls the constructor of the superclass
    }
}
public class EmployeeRecords {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee ID:");
        int employeeID = sc.nextInt();
        System.out.println("Enter the department:");
        String department = sc.next();
        System.out.println("Enter the salary:");
        double salary = sc.nextDouble();
        Employee employee = new Employee(employeeID, department, salary); // Creating an object of Employee class
        System.out.println("Employee ID: " + employee.employeeID);
        System.out.println("Department: " + employee.department); // Accessing protected member
        System.out.println("Salary: " + employee.getSalary()); // Accessing private member through public method
        System.out.println("Enter the new salary:");
        double newSalary = sc.nextDouble();
        employee.setSalary(newSalary);
        System.out.println("Salary: " + employee.getSalary());
        sc.close();
    }
}

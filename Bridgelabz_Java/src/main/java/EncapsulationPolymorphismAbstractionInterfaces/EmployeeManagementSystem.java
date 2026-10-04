/*

Employee Management System
Description: Build an employee management system with the following requirements:
Use an abstract class Employee with fields like employeeId, name, and baseSalary.
Provide an abstract method calculateSalary() and a concrete method displayDetails().
Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or fixed salary.
Use encapsulation to restrict direct access to fields and provide getter and setter methods.
Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
Ensure polymorphism by processing a list of employees and displaying their details using the Employee reference.
Name: Utakarsh Jain
Date: 3/10/2026

*/

package main.java.EncapsulationPolymorphismAbstractionInterfaces;
import java.util.ArrayList;
interface Department { 
    void assignDepartment(String department); //Method to assign department
    String getDepartmentDetails(); //Method to get department details
}
abstract class Employee { //Abstract class
    private int employeeId; //Instance variable for employee ID
    private String name; //Instance variable for employee name
    private double baseSalary; //Instance variable for base salary
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        setBaseSalary(baseSalary);
    }
    public int getEmployeeId() { //Getter method for employee ID
        return employeeId;
    }
    public void setEmployeeId(int employeeId) { //Setter method for employee ID
        if (employeeId > 0) {
            this.employeeId = employeeId;
        }
    }
    public String getName() { //Getter method for employee name
        return name;
    }
    public void setName(String name) { //Setter method for employee name
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
    public double getBaseSalary() { //Getter method for base salary
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) { //Setter method for base salary
        if (baseSalary >= 0) {
            this.baseSalary = baseSalary;
        }
    }
    public abstract double calculateSalary(); //Abstract method to calculate salary
    public void displayDetails() { //Method to display employee details
        System.out.println("Employee ID: " + employeeId); //Display employee ID
        System.out.println("Name: " + name); //Display employee name
        System.out.println("Base Salary: " + baseSalary); //Display base salary
        System.out.println("Final Salary: " + calculateSalary()); //Display final salary
    }
}
class FullTimeEmployee extends Employee implements Department { //Full-time employee class
    private String department; //Instance variable for department
    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }
    @Override
    public double calculateSalary() { //Method to calculate salary
        return getBaseSalary();
    }
    @Override
    public void assignDepartment(String department) { //Method to assign department
        this.department = department;
    }
    @Override
    public String getDepartmentDetails() { //Method to get department details
        return department;
    }
    @Override
    public void displayDetails() { //Method to display employee details
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}
class PartTimeEmployee extends Employee implements Department { //Part-time employee class
    private int workHours; 
    private double hourlyRate; 
    private String department; 
    public PartTimeEmployee(int employeeId, String name, int workHours, double hourlyRate) { //Parameterized constructor for part-time employee
        super(employeeId, name, 0);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }
    public int getWorkHours() { //Getter method for work hours
        return workHours; 
    }
    public void setWorkHours(int workHours) { //Setter method for work hours
        if (workHours >= 0) {
            this.workHours = workHours;
        }
    }
    public double getHourlyRate() { //Getter method for hourly rate
        return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate) { //Setter method for hourly rate
        if (hourlyRate >= 0) {
            this.hourlyRate = hourlyRate;
        }
    }
    @Override
    public double calculateSalary() { //Method to calculate salary
        return workHours * hourlyRate;
    }
    @Override
    public void assignDepartment(String department) { //Method to assign department
        this.department = department;
    }
    @Override
    public String getDepartmentDetails() { //Method to get department details
        return department;
    }
    @Override
    public void displayDetails() { //Method to display employee details
        super.displayDetails();
        System.out.println("Work Hours: " + workHours);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Department: " + department);
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) { //Main method
        FullTimeEmployee employee1 = new FullTimeEmployee(101, "Rahul", 60000);
        PartTimeEmployee employee2 = new PartTimeEmployee(102, "Priya", 100, 500);
        employee1.assignDepartment("Development");
        employee2.assignDepartment("Testing");
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println();
        }
    }
}

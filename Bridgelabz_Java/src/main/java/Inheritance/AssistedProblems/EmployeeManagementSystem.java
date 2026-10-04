/*

Employee Management System
Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
Tasks:
Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
Define subclasses Manager, Developer, and Intern with unique attributes for each, like teamSize for Manager and programmingLanguage for Developer.
Goal: Practice inheritance by creating subclasses with specific attributes and overriding superclass methods.
Name: Utakarsh Jain
Date: 2/10/26
*/

package main.java.Inheritance.AssistedProblems;
class Employee{ //Base class Employee
    String name;
    int id;
    double salary;
    Employee(String name , int id , double salary){ //Parameterized constructor for Employee
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails(){ //Method to display Employee details
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
class Manager extends Employee { //Child class Manager
    int teamSize;
    Manager(String name , int id , double salary , int teamSize){
        super(name, id, salary); //call to the parent class
        this.teamSize = teamSize;
    }
    @Override //Method overriding
    void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}
class Developer extends Employee { //Child class Developer
    String programmingLanguage;
    Developer(String name , int id , double salary , String programmingLanguage){ //Parameterized constructor for Developer
        super(name, id, salary); //call to the parent class
        this.programmingLanguage = programmingLanguage;
    }
    @Override //Method overriding
    void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
class Intern extends Employee {
    String internshipDuration;
    Intern(String name , int id , double salary , String internshipDuration){ //Parameterized constructor for Intern
        super(name, id, salary); //call to the parent class
        this.internshipDuration = internshipDuration;
    }
    @Override //Method overriding
    void displayDetails(){
        super.displayDetails();
        System.out.println("Internship Duration: " + internshipDuration);
    }
}

public class EmployeeManagementSystem { //Main class
    public static void main(String[] args) { //Main method
        Manager manager = new Manager("John", 101, 100000, 10);
        Developer developer = new Developer("Doe", 102, 50000, "Java");
        Intern intern = new Intern("Smith", 103, 25000, "6 months");
        manager.displayDetails();
        System.out.println();
        developer.displayDetails();
        System.out.println();
        intern.displayDetails();
    }
}

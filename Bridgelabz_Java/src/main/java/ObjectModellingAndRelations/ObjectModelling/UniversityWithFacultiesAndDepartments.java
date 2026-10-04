/* 

University with Faculties and Departments (Composition and Aggregation)
Description: Create a University with multiple Faculty members and Department objects. Model it so that the University and its Departments are in a composition relationship (deleting a university deletes all departments), and the Faculty members are in an aggregation relationship (faculty can exist outside of any specific department).
Tasks:
Define a University class with Department and Faculty classes.
Demonstrate how deleting a University also deletes its Departments.
Show that Faculty members can exist independently of a Department.
Goal: Understand the differences between composition and aggregation in modeling complex hierarchical relationships.
Name : Utakarsh Jain
Date : 1/10/2026
*/

import java.util.ArrayList;
class Faculty { //Class Faculty
    private String name;
    public Faculty(String name) { //Parameterized Constructor
        this.name = name;
    }
    public void displayFaculty() { //Method to display the details of the faculty
        System.out.println("Faculty: " + name);
    }
}
class Department { //Class Department
    private String name;
    public Department(String name) { //Parameterized Constructor
        this.name = name;
    }
    public void displayDepartment() { //Method to display the details of the department
        System.out.println("Department: " + name);
    }
}
class University { //Class University
    private String name;
    private ArrayList<Department> departments;
    private ArrayList<Faculty> faculties;
    public University(String name) { //Parameterized Constructor
        this.name = name;
        departments = new ArrayList<>();
        faculties = new ArrayList<>();
    }
    public void addDepartment(String departmentName) { //Method to add the department name
        Department department = new Department(departmentName);
        departments.add(department);
    }
    public void addFaculty(Faculty faculty) { //Method to add the faculty name
        faculties.add(faculty);
    }
    public void displayUniversity() { //Method to display the details of the university
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (Department department : departments) { //Method to display the details of the department
            department.displayDepartment();
        }
        System.out.println("Faculties:");
        for (Faculty faculty : faculties) { //Method to display the details of the faculty
            faculty.displayFaculty();
        }
    }
}
public class UniversityWithFacultiesAndDepartments {
    public static void main(String[] args) {
        Faculty faculty1 = new Faculty("Dr. Sharma");
        Faculty faculty2 = new Faculty("Dr. Mehta");
        University university = new University("ABC University");
        university.addDepartment("Computer Science");
        university.addDepartment("Information Technology");
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);
        university.displayUniversity();
        university = null;
        System.out.println();
        System.out.println("University object is no longer referenced.");
        System.out.println("Faculty objects can still exist independently.");
        faculty1.displayFaculty();
        faculty2.displayFaculty();
    }
}
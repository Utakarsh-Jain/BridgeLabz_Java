/*

School System with Different Roles
Description: Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and Staff are subclasses.
Tasks:
Define a superclass Person with common attributes like name and age.
Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).
Each subclass should have a method like displayRole() that describes the role.
Goal: Demonstrate hierarchical inheritance by modeling different roles in a school, each with shared and unique characteristics.
Name: Utakarsh Jain
Date : 3/10/2026

*/

package main.java.Inheritance.HierarchicalInheritance;
class Person{ //Base class
    String name;
    int age;
    Person(String name , int age){ //Parameterized constructor for Person
        this.name = name;
        this.age = age;
    }
    void displayDetails(){ //Method to display Person details
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Teacher extends Person{ //Child class
    String subject;
    Teacher(String name , int age , String subject){ //Parameterized constructor for Teacher
        super(name, age); //call to the parent class
        this.subject = subject;
    }
    void displayDetails(){ //Method to display Teacher details
        super.displayDetails(); //call to the parent class method
        System.out.println("Subject: " + subject);
    }
}
class Student extends Person{ //Child class
    int grade;
    Student(String name , int age , int grade){ //Parameterized constructor for Student
        super(name, age); //call to the parent class
        this.grade = grade;
    }
    void displayDetails(){ //Method to display Student details
        super.displayDetails(); //call to the parent class method
        System.out.println("Grade: " + grade);
    }
}
class Staff extends Person{ //Child class
    String position;
    Staff(String name , int age , String position){ //Parameterized constructor for Staff
        super(name, age); //call to the parent class
        this.position = position;
    }
    void displayDetails(){ //Method to display Staff details
        super.displayDetails(); //call to the parent class method
        System.out.println("Position: " + position);
    }
}
public class SchoolSystem { //Main class for execution
    public static void main(String[] args) { //Main method
        Teacher teacher = new Teacher("John", 30, "Math"); //Creating an object of Teacher class
        Student student = new Student("Jane", 20, 12); //Creating an object of Student class
        Staff staff = new Staff("Bob", 40, "Librarian"); //Creating an object of Staff class
        teacher.displayDetails(); 
        student.displayDetails();   
        staff.displayDetails(); 
    }
}

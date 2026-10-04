/*

Sample Problem 2: Educational Course Hierarchy
Description: Model a course system where Course is the base class, OnlineCourse is a subclass, and PaidOnlineCourse extends OnlineCourse.
Tasks:
Define a superclass Course with attributes like courseName and duration.
Define OnlineCourse to add attributes such as platform and isRecorded.
Define PaidOnlineCourse to add fee and discount.
Goal: Demonstrate how each level of inheritance builds on the previous, adding complexity to the system.
Name: Utakarsh Jain
Date : 3/10/2026

*/
package main.java.Inheritance.MultilevelInheritance;
class Course{//Base class
    String courseName;
    String duration;
    Course(String courseName , String duration){ //Parameterized constructor for Course
        this.courseName = courseName;
        this.duration = duration;
    }
    void displayDetails(){ //Method to display Course details
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
    }
}
class OnlineCourse extends Course{ //Child class
    String platform;
    boolean isRecorded;
    OnlineCourse(String courseName , String duration , String platform , boolean isRecorded){ //Parameterized constructor for OnlineCourse
        super(courseName, duration); //call to the parent class
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    void displayDetails(){ //Method to display OnlineCourse details
        super.displayDetails(); //call to the parent class method
        System.out.println("Platform: " + platform);
        System.out.println("Is Recorded: " + isRecorded);
    }
}
class PaidOnlineCourse extends OnlineCourse{ //Grandchild class
    double fee;
    double discount;
    PaidOnlineCourse(String courseName , String duration , String platform , boolean isRecorded , double fee , double discount){ //Parameterized constructor for PaidOnlineCourse
        super(courseName, duration, platform, isRecorded); //call to the parent class
        this.fee = fee;
        this.discount = discount;
    }
    void displayDetails(){ //Method to display PaidOnlineCourse details
        super.displayDetails(); //call to the parent class method
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount);
    }
}

public class EducationCourseHiearchy { //Main class for execution
    public static void main(String[] args) { //Main method
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Java", "6 months", "Coursera", true, 1000, 100); //Creating an object of PaidOnlineCourse class
        paidOnlineCourse.displayDetails(); //Displaying the course details
    }
}

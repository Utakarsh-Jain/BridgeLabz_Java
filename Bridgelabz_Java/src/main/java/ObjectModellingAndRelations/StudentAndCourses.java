/*

: School and Students with Courses (Association and Aggregation)
Description: Model a School with multiple Student objects, where each student can enroll in multiple courses, and each course can have multiple students.
Tasks:
Define School, Student, and Course classes.
Model an association between Student and Course to show that students can enroll in multiple courses.
Model an aggregation relationship between School and Student.
Demonstrate how a student can view the courses they are enrolled in and how a course can show its enrolled students.
Goal: Practice association by modeling many-to-many relationships between students and courses.

Name : Utakarsh Jain
Date : 1/10/2026
*/

import java.util.ArrayList;
class Course { //Class Course
    private String courseName;
    private ArrayList<Student> students;
    public Course(String courseName) { //Parameterized Constructor
        this.courseName = courseName;
        students = new ArrayList<>();
    }
    public void addStudent(Student student) { //Method to add the student
        students.add(student);
    }
    public void displayStudents() { //Method to display the students
        System.out.println("Course: " + courseName);
        for (Student student : students) {
            System.out.println("Student: " + student.getName());
        }
    }
    public String getCourseName() { //Method to get the course name
        return courseName;
    }
}
class Student { //Class Student
    private String name;
    private ArrayList<Course> courses;
    public Student(String name) { //Parameterized Constructor
        this.name = name;
        courses = new ArrayList<>();
    }
    public String getName() { //Method to get the name
        return name;
    }
    public void enrollCourse(Course course) { //Method to enroll in a course
        courses.add(course);
        course.addStudent(this);
    }
    public void displayCourses() { //Method to display the courses
        System.out.println("Student: " + name);
        for (Course course : courses) {
            System.out.println("Course: " + course.getCourseName());
        }
    }
}
class School { //Class School
    private String name;
    private ArrayList<Student> students;
    public School(String name) { //Parameterized Constructor
        this.name = name;
        students = new ArrayList<>();
    }
    public void addStudent(Student student) { //Method to add the student
        students.add(student);
    }
    public void displayStudents() { //Method to display the students
        System.out.println("School: " + name);
        for (Student student : students) {
            System.out.println("Student: " + student.getName());
        }
    }
}
public class StudentAndCourses { //Main class
    public static void main(String[] args) { //Main method
        School school = new School("ABC School"); //Creating a school object
        Student student1 = new Student("Rahul"); //Creating a student object
        Student student2 = new Student("Priya");
        Course course1 = new Course("Java");
        Course course2 = new Course("Database");
        school.addStudent(student1);
        school.addStudent(student2);
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);
        school.displayStudents();
        System.out.println();
        student1.displayCourses();
        System.out.println();
        student2.displayCourses();
        System.out.println();
        course1.displayStudents();
        System.out.println();
        course2.displayStudents();
    }
}
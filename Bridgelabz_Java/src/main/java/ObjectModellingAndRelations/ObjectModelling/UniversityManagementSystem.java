/*

Problem 5: University Management System
Description: Model a university system with Student, Professor, and Course classes. Students enroll in courses, and professors teach courses. Ensure students and professors can communicate through methods like enrollCourse() and assignProfessor().
Goal: Use association and aggregation to create a university system that emphasizes relationships and interactions among students, professors, and courses.
Name : Utakarsh Jain
Date : 2/10/26
*/

import java.util.ArrayList;
class Student {
    private String name;
    private int studentId;
    private ArrayList<Course> courses;
    public Student(String name, int studentId) //Parameterized Constructor
    {
        this.name = name;
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }
    public void enrollCourse(Course course) //Method to enroll in a course
    {
        courses.add(course);
    }
    public void displayCourses() //Method to display the courses
    {
        System.out.println("Student: " + name);
        for (Course course : courses)
        {
            System.out.println("Course: " + course.getCourseName());
        }
    }
    public String getName() //Method to get the name
    {
        return name;
    }
}

class Professor {
    private String name;
    private int professorId;
    private ArrayList<Course> courses;
    public Professor(String name, int professorId) //Parameterized Constructor
    {
        this.name = name;
        this.professorId = professorId;
        this.courses = new ArrayList<>();
    }
    public void assignCourse(Course course) //Method to assign a course
    {
        courses.add(course);
    }
    public void displayCourses() //Method to display the courses
    {
        System.out.println("Professor: " + name);
        for (Course course : courses)
        {
            System.out.println("Course: " + course.getCourseName());
        }
    }
    public String getName() //Method to get the name
    {
        return name;
    }
}

class Course {
    private String courseName;
    private int courseId;
    private Professor professor;
    private ArrayList<Student> students;
    public Course(String courseName, int courseId) //Parameterized Constructor
    {
        this.courseName = courseName;
        this.courseId = courseId;
        this.students = new ArrayList<>();
    }
    public void setProfessor(Professor professor) //Method to set the professor
    {
        this.professor = professor;
    }
    public void addStudent(Student student) //Method to add the student
    {
        students.add(student);
    }
    public void displayStudents() //Method to display the students
    {
        System.out.println("Course: " + courseName);
        for (Student student : students)
        {
            System.out.println("Student: " + student.getName());
        }
    }
    public String getCourseName() //Method to get the course name
    {
        return courseName;
    }
}

class University {
    private String name;
    private ArrayList<Student> students;
    private ArrayList<Professor> professors;
    private ArrayList<Course> courses;
    public University(String name) //Parameterized Constructor
    {
        this.name = name;
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
        this.courses = new ArrayList<>();
    }
    public void addStudent(Student student) //Method to add the student
    {
        students.add(student);
    }
    public void addProfessor(Professor professor) //Method to add the professor
    {
        professors.add(professor);
    }
    public void addCourse(Course course) //Method to add the course
    {
        courses.add(course);
    }
    public void displayStudents() //Method to display the students
    {
        System.out.println("University: " + name);
        for (Student student : students)
        {
            System.out.println("Student: " + student.getName());
        }
    }
    public void displayProfessors() //Method to display the professors
    {
        System.out.println("University: " + name);
        for (Professor professor : professors)
        {
            System.out.println("Professor: " + professor.getName());
        }
    }
    public void displayCourses() //Method to display the courses
    {
        System.out.println("University: " + name);
        for (Course course : courses)
        {
            System.out.println("Course: " + course.getCourseName());
        }
    }
    public static void main(String args[]) //Main method
    {
        University university = new University("Tech University");
        Student student1 = new Student("Rahul", 1);
        Student student2 = new Student("Priya", 2);
        Professor professor1 = new Professor("Dr. Sharma", 1);
        Professor professor2 = new Professor("Dr. Gupta", 2);
        Course course1 = new Course("Java", 1);
        Course course2 = new Course("Database", 2);
        university.addStudent(student1);
        university.addStudent(student2);
        university.addProfessor(professor1);
        university.addProfessor(professor2);
        university.addCourse(course1);
        university.addCourse(course2);
        student1.enrollCourse(course1);
        student2.enrollCourse(course2);
        professor1.assignCourse(course1);
        professor2.assignCourse(course2);
        university.displayStudents();
        System.out.println();
        university.displayProfessors();
        System.out.println();
        university.displayCourses();
        System.out.println();
        student1.displayCourses();
        System.out.println();
        student2.displayCourses();
        System.out.println();
        professor1.displayCourses();
        System.out.println();
        professor2.displayCourses();
    }
}
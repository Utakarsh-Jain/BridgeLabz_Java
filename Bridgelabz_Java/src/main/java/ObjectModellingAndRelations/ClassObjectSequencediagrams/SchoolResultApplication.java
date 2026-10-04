/*
1: School Results Application
Class Diagram
The class diagram represents the structure of a school results application where students have subjects, and their scores are calculated for grades.
Diagram Description:
Classes: Student, Subject, GradeCalculator
Relationships:
A Student has multiple Subject entries (Aggregation).
GradeCalculator computes the results for a Student.
Name: Utakarsh Jain
Date : 1/10/2026
*/
package ClassObjectSequencediagrams;
import java.util.ArrayList;
import java.util.List;
class Subject {
    private String name;
    private int marks;
    public Subject(String name, int marks) { //Parameterized Constructor
        this.name = name;
        this.marks = marks;
    }
    public String getName() { //Method to get the name
        return name;
    }
    public int getMarks() { //Method to get the marks
        return marks;
    }
}
class Student {
    private String name;
    private List<Subject> subjects;

    public Student(String name) { //Parameterized Constructor
        this.name = name;
        this.subjects = new ArrayList<>();
    }
    public void addSubject(Subject subject) { //Method to add the subject
        subjects.add(subject);
    }
    public String getName() { //Method to get the name
        return name;
    }
    public List<Subject> getSubjects() { //Method to get the subjects
        return subjects;
    }
}
class GradeCalculator {
    public double calculateAverage(Student student) { //Method to calculate the average
        int total = 0;
        for (Subject subject : student.getSubjects()) {
            total += subject.getMarks();
        }
        return (double) total / student.getSubjects().size();
    }
    public String calculateGrade(Student student) { //Method to calculate the grade
        double average = calculateAverage(student);
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}

public class SchoolResultApplication {
    public static void main(String[] args) {
        Student student = new Student("John");

        Subject maths = new Subject("Maths", 90);
        Subject science = new Subject("Science", 85);

        // Aggregation: Student has multiple Subject objects.
        student.addSubject(maths);
        student.addSubject(science);

        GradeCalculator calculator = new GradeCalculator();

        System.out.println("Student: " + student.getName());

        for (Subject subject : student.getSubjects()) {
            System.out.println(subject.getName() + ": " + subject.getMarks());
        }

        double average = calculator.calculateAverage(student);
        String grade = calculator.calculateGrade(student);

        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}

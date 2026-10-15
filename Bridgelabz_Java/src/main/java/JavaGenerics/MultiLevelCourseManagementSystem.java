/*
Multi-Level University Course Management System
Concepts: Generic Classes, Wildcards, Bounded Type Parameters
Name: Utakarsh Jain
Date: 15/10/2026
*/
package main.java.JavaGenerics;
import java.util.ArrayList;
import java.util.List;

abstract class CourseType {} // abstract class 
class ExamCourse extends CourseType {} // exam course class 
class AssignmentCourse extends CourseType {} // assignment course class 
class ResearchCourse extends CourseType {} // research course class 
class Course<T extends CourseType> { // generic class 
    private String courseName;
    private T courseType;
    public Course(String courseName, T courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }
    public String getCourseName() { // get course name 
        return courseName;
    }
    public T getCourseType() { // get course type 
        return courseType;
    }
    @Override
    public String toString() { // override to string 
        return courseName + " (" + courseType.getClass().getSimpleName() + ")"; // print the course name and course type 
    }
}
public class MultiLevelCourseManagementSystem { // main class 

    public static void displayAllCourses( // display all courses method 
            List<? extends Course<?>> list) { // list of courses

        System.out.println("All Courses:"); // print all courses 

        for (Course<?> course : list) { // iterate over the list 
            System.out.println(course);
        }
    }

    public static void main(String[] args) { // main method 
        Course<ExamCourse> examCourse = new Course<>("Mathematics", new ExamCourse()); // create exam course 
        Course<AssignmentCourse> assignmentCourse = new Course<>("Physics", new AssignmentCourse()); // create assignment course 
        Course<ResearchCourse> researchCourse = new Course<>("Chemistry", new ResearchCourse()); // create research course 

        ArrayList<Course<?>> allCourses = new ArrayList<>();

        allCourses.add(examCourse);
        allCourses.add(assignmentCourse);
        allCourses.add(researchCourse);

        displayAllCourses(allCourses);
    }
}
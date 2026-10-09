/*

Problem Statement: Create a program to manage student records using a singly linked list. Each node will store information about a student, including their Roll Number, Name, Age, and Grade. Implement the following operations:
Add a new student record at the beginning, end, or at a specific position.
Delete a student record by Roll Number.
Search for a student record by Roll Number.
Display all student records.
Update a student's grade based on their Roll Number.
Hint:
Use a singly linked list where each node contains student information and a pointer to the next node.
The head of the list will represent the first student, and the last node’s next pointer will be null.
Update the next pointers when inserting or deleting nodes.
Name : Utakarsh Jain
Date : 6/10/2026
*/
package main.java.LinkedList;
class Student {
    int rollNumber;
    String name;
    int age;
    char grade;
    Student next;
    public Student(int rollNumber, String name, int age, char grade) { // Constructor to initialize a student record
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
public class StudentRecordManagement { // Class to manage student records
    private Student head; // Head of the linked list
    public void addStudentAtBeginning(int rollNumber, String name, int age, char grade) { // Method to add a student at the beginning of the list
        Student newStudent = new Student(rollNumber, name, age, grade);
        newStudent.next = head; // The new student's next pointer points to the current head
        head = newStudent; // The new student becomes the new head
        System.out.println("Student added at the beginning.");
    }
    public void addStudentAtEnd(int rollNumber, String name, int age, char grade) { // Method to add a student at the end of the list
        Student newStudent = new Student(rollNumber, name, age, grade);
        if (head == null) { // If the list is empty
            head = newStudent; // The new student becomes the head
            System.out.println("Student added at the end.");
            return;
        }
        Student temp = head; // Start from the head
        while (temp.next != null) { // Traverse to the last node
            temp = temp.next;
        }
        temp.next = newStudent; // The new student's next pointer points to the last node
        while (temp.next != null) { // Traverse to the last node
            temp = temp.next;
        }
        temp.next = newStudent;
        System.out.println("Student added at the end.");
    }
    public void addStudentAtSpecificPosition(int position, int rollNumber, String name, int age, char grade) {
        if (position == 1) { // If the position is 1, add the student at the beginning
            addStudentAtBeginning(rollNumber, name, age, grade);    
            return;
        }
        Student newStudent = new Student(rollNumber, name, age, grade); // Creates new student record
        Student temp = head; // Start from the head
        for (int i = 1; i < position - 1 && temp != null; i++) { // Traverse to the node before the specified position
            temp = temp.next;
        }
        if (temp == null) { // If the position is out of bounds
            System.out.println("Position is out of bounds.");
            return;
        }
        newStudent.next = temp.next; // The new student's next pointer points to the node after the specified position
        temp.next = newStudent; // The new student becomes the node at the specified position
        System.out.println("Student added at the specific position.");
    }
    public void deleteStudentByRollNumber(int rollNumber) { // Method to delete a student by roll number
        if (head == null) { // If the list is empty
            System.out.println("List is empty.");
            return;
        }
        if (head.rollNumber == rollNumber) { // If the head's roll number matches the roll number to be deleted
            head = head.next;
            System.out.println("Student with roll number " + rollNumber + " deleted.");
            return;
        }
        Student temp = head;
        Student prev = null; // To keep track of the previous node
        while (temp != null && temp.rollNumber != rollNumber) { // Traverse to the node before the specified position
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) { // If the specified position is not found
            System.out.println("Student with roll number " + rollNumber + " not found.");
            return;
        }
        prev.next = temp.next; // The previous node's next pointer points to the node after the specified position
        System.out.println("Student with roll number " + rollNumber + " deleted.");
    }
    public Student searchStudentByRollNumber(int rollNumber) { // Method to search for a student by roll number
        Student temp = head; // Start from the head
        while (temp != null) { // Traverse to the end of the list
            if (temp.rollNumber == rollNumber) { // If the roll number matches
                return temp; // Return the student
            }
            temp = temp.next; // Move to the next node
        }
        return null; // If the roll number is not found
    }
    public void displayAllStudents() { // Method to display all students
        if (head == null) { // If the list is empty
            System.out.println("List is empty.");
            return;
        }
        Student temp = head; // Start from the head
        System.out.println("Student records:");
        while (temp != null) { // Traverse to the end of the list
            System.out.println("Roll Number: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next; // Move to the next node
        }
    }
    public void updateGrade(int rollNumber, char grade) { // Method to update the grade of a student
        Student student = searchStudentByRollNumber(rollNumber); // Search for the student
        if (student == null) { // If the student is not found
            System.out.println("Student with roll number " + rollNumber + " not found.");
            return;
        }
        student.grade = grade; // Update the grade
        System.out.println("Grade updated for student with roll number " + rollNumber);
    }
    public static void main(String[] args) {
        StudentRecordManagement studentRecordManagement = new StudentRecordManagement();
        // Adding students
        studentRecordManagement.addStudentAtBeginning(1, "John", 20, 'A');
        studentRecordManagement.addStudentAtEnd(2, "Jane", 22, 'B');
        studentRecordManagement.addStudentAtSpecificPosition(2, 3, "Bob", 21, 'C');
        // Displaying all students
        studentRecordManagement.displayAllStudents();
        // Searching for a student
        Student student = studentRecordManagement.searchStudentByRollNumber(2);
        if (student != null) {
            System.out.println("Found student: " + student.name);
        } else {
            System.out.println("Student not found.");
        }
        // Updating a student's grade
        studentRecordManagement.updateGrade(2, 'A');
        // Displaying all students after update
        studentRecordManagement.displayAllStudents();
        // Deleting a student
        studentRecordManagement.deleteStudentByRollNumber(2);
        // Displaying all students after deletion
        studentRecordManagement.displayAllStudents();
    }
}

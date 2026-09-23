/*
Problem 7 - GCR Array Method Level 2
Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint => 
Create a class public class StudentVoteChecker and define a method public boolean canStudentVote(int age) which takes in age as a parameter and returns true or false
Inside the method firstly validate the age for a negative number, if a negative return is false cannot vote. For valid age check for age is 18 or above return true; else return false;
In the main function define an array of 10 integer elements, loop through the array by take user input for the student's age, call canStudentVote() and display the result
Author : <Utakarsh Jain>
* Date : 23-09-2026
*/

import java.util.Scanner;
public class StudentVoteChecker {
    public boolean canStudentVote(int age) {
        if (age < 0) { //if age is less than 0 then automatically return false
            return false;
        }
        return age >= 18; //If age is >= 18 only it will return true
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int studentAges[] = new int[10];
        StudentVoteChecker obj = new StudentVoteChecker();
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = sc.nextInt();
            boolean canVote = obj.canStudentVote(studentAges[i]);
            if (canVote) { //checking if the student can vote
                System.out.println("Student " + (i + 1) + " can vote.");
            } else { //else printing that the student cannot vote
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
        sc.close();
    }
}
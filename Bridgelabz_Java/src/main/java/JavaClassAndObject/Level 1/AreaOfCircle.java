/*
Problem 2 : Java Class And Object Level 1
Program to Compute Area of a Circle
Problem Statement: Write a program to create a Circle class with an attribute radius. Add methods to calculate and display the area and circumference of the circle.
Name: Utakarsh Jain
Date: 29/09/2026

*/

import java.util.Scanner;

class Circle {
    double radius; 
    double area() { 
        return 3.14 * radius * radius; 
    }
    double circumference() { //Method to calculate the circumference of the circle
        return 2 * 3.14 * radius; 
    }
    void display() { //Method to display the area and circumference of the circle
        System.out.println("Area: " + area());
        System.out.println("Circumference: " + circumference()); 
    }
}
public class AreaOfCircle {
    public static void main(String args[]) { //Main method to test the class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        Circle c = new Circle(); 
        c.radius = sc.nextDouble(); 
        c.display(); 
        sc.close();
    }
}

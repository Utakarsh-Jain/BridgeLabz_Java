/*

Write a Circle class with a radius attribute. Use constructor chaining to initialize radius with default and user-provided values.
Name: Utakarsh Jain
Date: 30/09/2026
*/

class Circle {
    double radius;
    Circle() { // Default Constructor
        this(1.0); // Calls the parameterized constructor with radius 1.0
    }
    Circle(double radius) { // Parameterized Constructor
        this.radius = radius;
    }
    double getArea() { // Method to calculate the area of the circle
        return Math.PI * radius * radius;
    }
    public static void main(String args[]) { // Main method
        Circle circle1 = new Circle(); // Creates a circle with default radius 1.0
        Circle circle2 = new Circle(5.0); // Creates a circle with radius 5.0
        System.out.println("Area of circle1: " + circle1.getArea());
        System.out.println("Area of circle2: " + circle2.getArea());
    }
}
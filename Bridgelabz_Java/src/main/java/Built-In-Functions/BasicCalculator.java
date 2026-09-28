/*

 Basic Calculator: 
○ Write a program that performs basic mathematical operations (addition, subtraction, multiplication, division) based on user input. 
○ Each operation should be performed in its own function, and the program should prompt the user to choose which operation to perform.

Name : Utakarsh Jain
Date : 28/09/2026

*/

import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        BasicCalculator obj = new BasicCalculator();
        int result = obj.calculate(num1, num2, operator);
        System.out.println("Result: " + result);
        sc.close();
    }
    public int calculate(int a, int b, char operator) { //Function to calculate the result of the operation
        if (operator == '+') { //Checking if the operator is addition
            return a + b; //Returning the sum of the two numbers
        } else if (operator == '-') { //Checking if the operator is subtraction
            return a - b; //Returning the difference of the two numbers
        } else if (operator == '*') { //Checking if the operator is multiplication
            return a * b; //Returning the product of the two numbers
        } else if (operator == '/') { //Checking if the operator is division
            return a / b; //Returning the division of the two numbers
        } else { //If the operator is not addition, subtraction, multiplication, or division
            return 0; 
        }
    }
}

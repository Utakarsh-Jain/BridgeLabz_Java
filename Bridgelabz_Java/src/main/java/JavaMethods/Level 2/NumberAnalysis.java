/*
Problem 9 - GCR Array Method Level 2
Write a program to take user input for 5 numbers and check whether a number is positive or negative. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they are equal, greater, or less
Hint => 
Write a Method to Check whether the number is positive or negative
Write a Method to check whether the number is even or odd
Write a Method to compare two numbers and return 1 if number1 > number2 or 0 if both are equal or -1 if number1 < number2 
In the main program, Loop through the array using the length call the method isPositive() and if positive call method isEven() and print accordingly 
If the number is negative, print negative. 
Finally compare the first and last element of the array by calling the method compare() and display if they are equal, greater, or less
Author : <Utakarsh Jain>
* Date : 23-09-2026
*/

import java.util.Scanner;
public class NumberAnalysis {
    public String isPositive(int num) { //method to check if the number is positive or negative
        if (num > 0) {
            return "Positive"; //if number is greater than 0 then it is positive
        } else {
            return "Negative"; //if number is less than 0 then it is negative
        }
    }
    public String isEven(int num) { //method to check if the number is even or odd
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
    public int compare(int num1, int num2) { //method to compare two numbers
        if (num1 > num2) { //if num1 is greater than num2 return 1
            return 1;
        } else if (num1 == num2) { //if num1 is equal to num2 return 0
            return 0;
        } else { //if num1 is less than num2 return -1
            return -1;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[5];
        NumberAnalysis obj = new NumberAnalysis();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " is " + obj.isPositive(numbers[i]));
            if (numbers[i] > 0) {
                System.out.println(numbers[i] + " is " + obj.isEven(numbers[i]));
            }
        }
        int result = obj.compare(numbers[0], numbers[numbers.length - 1]);
        if (result == 1) {
            System.out.println("First number is greater than the last number");
        } else if (result == 0) {
            System.out.println("First number is equal to the last number");
        } else {
            System.out.println("First number is less than the last number");
        }
        sc.close();
    }
}

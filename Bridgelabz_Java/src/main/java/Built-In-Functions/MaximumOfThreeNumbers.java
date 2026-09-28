/*

Maximum of Three Numbers: 
○ Write a program that takes three integer inputs from the user and finds the maximum of the three numbers. 
○ Ensure your program follows best practices for organizing code into modular functions, such as separate functions for taking input and calculating the maximum value. 

Name : Utakarsh Jain
Date : 28/09/2026

*/

import java.util.Scanner;

public class MaximumOfThreeNumbers {

    static int getNumber(Scanner sc) {
        System.out.print("Enter a number: "); //Taking the first number from the user
        return sc.nextInt(); //Storing the first number in the variable num1
    }
    static int findMax(int a, int b, int c) {
        int max = a; //Storing the first number in the variable max
        if (b > max) { //Checking if the second number is greater than the first number
            max = b; //Storing the second number in the variable max
        }
        if (c > max) { //Checking if the third number is greater than the first number
            max = c;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = getNumber(sc);
        int num2 = getNumber(sc);
        int num3 = getNumber(sc);
        int max = findMax(num1, num2, num3);
        System.out.println("Maximum number is: " + max);
        sc.close();
    }
}
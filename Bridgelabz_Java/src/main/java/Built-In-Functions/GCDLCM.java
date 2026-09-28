/*

GCD and LCM Calculator: 
○ Create a program that calculates the Greatest Common Divisor (GCD) and Least Common Multiple (LCM) of two numbers using functions. 
○ Use separate functions for GCD and LCM calculations, showcasing how modular 

Name : Utakarsh Jain
Date : 28/09/2026

*/

import java.util.Scanner;
public class GCDLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        GCDLCM obj = new GCDLCM();
        int gcd = obj.findGCD(num1, num2);
        int lcm = obj.findLCM(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        sc.close();
    }
    public int findGCD(int a, int b) { //Function to find the GCD of two numbers
        while (b != 0) { //Looping until the second number is not equal to 0
            int temp = b; //Storing the second number in the variable temp
            b = a % b; //Calculating the remainder of the division of the first number by the second number
            a = temp; //Storing the second number in the variable a
        }
        return a; //Returning the GCD of the two numbers
    }
    public int findLCM(int a, int b) { //Function to find the LCM of two numbers
        return (a * b) / findGCD(a, b); //Calculating the LCM of the two numbers
    }
}

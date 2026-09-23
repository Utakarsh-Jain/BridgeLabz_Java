/*
Problem 1 - GCR Array Method Level 1
Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint => 
Simple Interest = Principal * Rate * Time / 100
Take user input for principal, rate, time
Write a method to calculate the simple interest given principle, rate and time as parameters
Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”

Author : <Utakarsh Jain>
* Date : 23-09-2026
*/
import java.util.Scanner;
class SimpleInterest {
    public double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100; //calculating the simple interest & returning the value
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble(); //asking the user to enter the principle amount
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble(); //asking the user to enter the rate of interest
        System.out.print("Enter Time: ");
        double time = sc.nextDouble(); //asking the user to enter the time period
        SimpleInterest obj = new SimpleInterest();
        double interest = obj.calculateSimpleInterest(principal, rate, time); //calling the method to calculate the simple interest
        System.out.println("The Simple Interest is " + interest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time); //printing the result
        sc.close();
    }
}
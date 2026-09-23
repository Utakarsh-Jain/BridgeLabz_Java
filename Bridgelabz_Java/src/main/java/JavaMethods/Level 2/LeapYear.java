/*
Problem 3 - GCR Array Method Level 2
Write a program that takes a year as input and outputs the Year is a Leap Year or not 
Hint => 
The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. 
Also Leap year is divisible by 4 and not divisible by 100 or divisible by 400
Write a method to check for Leap Year using the conditions a and b
Author : <Utakarsh Jain>
* Date : 23-09-202
*/

import java.util.Scanner;
class LeapYear {
    public static boolean isLeapYear(int year) { //method to check for leap year
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0); //checking for leap year using the conditions
    }
    public static void main(String args[]) { //main method
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if (year < 1582) { //checking if the year is a leap year
            System.out.println("Please enter a year greater than or equal to 1582.");
            sc.close();
            return;
        }
        if (isLeapYear(year)) { //calling the method to check for leap year
            System.out.println(year + " is a Leap Year.");
        } else { //printing the result
            System.out.println(year + " is not a Leap Year.");
        }
        sc.close();
    }
}
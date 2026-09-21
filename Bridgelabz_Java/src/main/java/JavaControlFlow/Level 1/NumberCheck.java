import java.util.Scanner;
/*
Problem 6 - GCR Control Flow Level 1
Write a program to check whether a number is positive, negative, or zero.
Hint => 
Get integer input from the user and store it in the number variable.
If the number is positive, print positive.
If the number is negative, print negative.
If the number is zero, print zero. 

* Author : <Utakarsh Jain>
* Date : 21-09-2026
*/
public class NumberCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else if (number < 0) {
            System.out.println("The number " + number + " is negative.");
        } else {
            System.out.println("The number " + number + " is zero.");
        }
        sc.close();
    }
}

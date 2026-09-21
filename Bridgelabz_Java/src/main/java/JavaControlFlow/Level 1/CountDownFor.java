import java.util.Scanner;
/**
 Problem 9 - GCR Control Flow Level 1
Write a program to count down the number from the user input value to 1 using a for loop for a rocket launch
Hint => 
Create a variable counter to take user inputted value for the countdown.
Use the for loop to check if the counter is 1
Inside a for loop, print the value of the counter and decrement the counter.

* Author : <Utakarsh Jain>
* Date : 21-09-2026
*/
class CountDownFor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown number:");
        int counter = sc.nextInt();
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        sc.close();
    }
}
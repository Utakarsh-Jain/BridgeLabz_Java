import java.util.Scanner;
/**
 Problem 8 - GCR Control Flow Level 1
Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch
Hint => 
Create a variable counter to take user inputted value for the countdown.
Use the while loop to check if the counter is 1
Inside a while loop, print the value of the counter and decrement the counter.

* Author : <Utakarsh Jain>
* Date : 21-09-2026
*/
class CountDownWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown number: ");
        int counter = sc.nextInt();
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        sc.close();
    }
}
import java.util.Scanner;
/**
 Problem 14 - GCR Control Flow Level 1
Write a Program to find the factorial of an integer entered by the user.
Hint => 
For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
Using a while loop, compute the factorial.
Print the factorial at the end.

* Author : <Utakarsh Jain>
* Date : 21-09-2026
*/
class FactorialUsingWhile {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        if (number > 0) {
            long factorial = 1;
            int counter = 1;
            while (counter <= number) {
                factorial = factorial * counter;
                counter++;
            }
            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
            System.out.println("The number " + number + " is not a positive integer");
        }
        sc.close();
    }
}

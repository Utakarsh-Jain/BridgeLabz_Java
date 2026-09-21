import java.util.Scanner;
/*
Problem 10 - GCR Control Flow Level 2
Create a program to find the power of a number.
Hint => 
Get integer input for two variables named number and power.
Create a result variable with an initial value of 1.
Run a for loop from i = 1 to i <= power.
In each iteration of the loop, multiply the result with the number and assign the value to the result.
Finally, print the result

* Author : <Utakarsh Jain>
* Date : 21-09-2026
*/
class PowerOfNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();
        long result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }
        System.out.println(number + " raised to the power " + power + " is " + result);
        sc.close();
    }
}
import java.util.Scanner;
/*
Problem 11 - GCR Co ntrol Flow Level 2
Create a program to find the factors of a number taken as user input.
Hint => 
Get the input value for a variable named number.
Run a for loop from i = 1 to i < number.
In each iteration of the loop, check if number is perfectly divisible by i.
If true, print the value of i.


* Author : <Utakarsh Jain>
* Date : 21-09-2026
*/
class FactorsOfNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
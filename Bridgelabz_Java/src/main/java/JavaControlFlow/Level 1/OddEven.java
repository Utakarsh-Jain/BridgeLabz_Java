import java.util.Scanner;
/*
Problem 16 - GCR Control Flow Level 1
Create a program to print odd and even numbers between 1 to the number entered by the user.
Hint => 
Get an integer input from the user, assign to a variable number and check for Natural Number
Using a for loop, iterate from 1 to the number
In each iteration of the loop, print the number is odd or even number

* Author : <Utakarsh Jain>
* Date : 21-09-2026
*/
class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        if (number > 0) {
            for (int counter = 1; counter <= number; counter++) {
                if (counter % 2 == 0) {
                    System.out.println(counter + " is an even number");
                } else {
                    System.out.println(counter + " is an odd number");
                }
            }
        } else {
            System.out.println("The number " + number
                    + " is not a natural number");
        }
        sc.close();
    }
}

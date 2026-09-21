import java.util.Scanner;
/*
Problem 12 - GCR Control Flow Level 2
Create a program to find all the multiple of a number taken as user input below 100.
Hint => 
Get input value for a variable named number.
Run a for loop backward: from i = 100 to i = 1.
Inside the loop, check if i perfectly divide the number.
If true, print the number and continue the loop.


* Author : <Utakarsh Jain>
* Date : 21-09-2026
*/
class MultiplesBelowHundred {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
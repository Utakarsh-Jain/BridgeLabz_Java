import java.util.Scanner;
/*
Problem 6 - GCR Control Flow Level 2
Write a program FizzBuzz, take a number as user input, and if it is a positive integer loop from 0 to the number and print the number, but for multiples of 3 print "Fizz" instead of the number, for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz".
Hint => 
Write the program and use while loop

* Author : <Utakarsh Jain>
* Date : 21-09-2026
*/
class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer:");
        int number = sc.nextInt();
        if (number > 0) {
            int i = 0;
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                else {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
        sc.close();
    }
}
/*
Problem 10 - GCR Java Arrays Level 1
Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". Finally, print the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...
Hint => 
Create a String Array to save the results and 
Finally, loop again to show the results of the array based on the index position
Author : <Utakarsh Jain>
Date : 22-09-2026

*/
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt(); // Taking User Input for the number
        if (number <= 0) { // Checking if the number is positive
            System.out.println("Error: Please enter a positive integer."); 
            return;
        }
        String results[] = new String[number + 1]; //Initializing the array
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz"; // Saving "FizzBuzz" if the number is divisible by both 3 and 5
            } else if (i % 3 == 0) {
                results[i] = "Fizz"; // Saving "Fizz" if the number is divisible by 3
            } else if (i % 5 == 0) {
                results[i] = "Buzz"; // Saving "Buzz" if the number is divisible by 5
            } else {
                results[i] = String.valueOf(i); // Saving the number if it is not divisible by 3 or 5
            }
        }
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + (i + 1) + " = " + results[i]);
        }
        sc.close();
    }
}
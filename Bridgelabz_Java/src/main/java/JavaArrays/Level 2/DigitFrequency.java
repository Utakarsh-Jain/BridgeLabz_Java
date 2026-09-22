/*Problem 10 - GCR Java Arrays Level 2
Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
Hint => 
Take the input for a number
Find the count of digits in the number
Find the digits in the number and save them in an array
Find the frequency of each digit in the number. For this define a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit
Display the frequency of each digit in the number

Author : <Utakarsh Jain>
* Date : 22-09-2026
*/

import java.util.Scanner;
public class DigitFrequency {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Invalid number.");
            return;
        }
        // Find count of digits
        int count = 0;
        int temp = number;
        if (number == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                count++;
                temp /= 10;
            }
        }
        // Store digits in array
        int digits[] = new int[count];
        temp = number;

        for (int i = 0; i < digits.length; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        // Create frequency array
        int frequency[] = new int[10];

        // Find frequency of each digit
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }
        // Display frequency
        System.out.println("\nDigit Frequency:");

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " = " + frequency[i]);
            }
        }

        sc.close();
    }
}
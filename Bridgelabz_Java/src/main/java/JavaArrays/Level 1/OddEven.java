/*
* Problem 7 - GCR Java Arrays Level 1
Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. Finally, print the odd and even numbers array
Hint => 
Get an integer input from the user, assign it to a variable number, and check for Natural Number. If not a natural number then print an error and exit the program
Create an integer array for even and odd numbers with size = number / 2 + 1
Create index variables for odd and even numbers and initialize them to zero
Using a for loop, iterate from 1 to the number, and in each iteration of the loop, save the odd or even number into the corresponding array
Finally, print the odd and even numbers array using the odd and even index
Author : <Utakarsh Jain>
* Date : 22-09-2026
9
*/
import java.util.Scanner;
public class OddEven{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Declaring a scanner to take user input
        System.out.print("Enter a natural number: "); 
        int number = sc.nextInt();
        if (number <= 0) { // Checking if the number is less than or equal to 0
            System.out.println("Error: Please enter a natural number."); 
            return; // Exiting the program
        }
        int size = number / 2 + 1; 
        int[] even = new int[size]; // Creating an array to store even numbers
        int[] odd = new int[size]; // Creating an array to store odd numbers
        int evenIndex = 0; 
        int oddIndex = 0; 
        for (int i = 1; i <= number; i++) { // Loop to iterate from 1 to the number entered by the user
            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }

        System.out.println("Odd numbers:");

        for (int i = 0; i < oddIndex; i++) { // Loop to print the odd numbers
            System.out.print(odd[i] + " "); 
        }

        System.out.println();

        System.out.println("Even numbers:");
        for (int i = 0; i < evenIndex; i++) { // Loop to print the even numbers
            System.out.print(even[i] + " ");
        }
        sc.close();
    }
}
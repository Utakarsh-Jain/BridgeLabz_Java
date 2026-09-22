import java.util.Scanner;
/*Problem 5 - GCR Java Arrays Level 1
Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
Hint => 
Take integer input and store it in the variable number as well as define an integer array to store the multiplication result in the variable multiplicationResult
Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
Finally, display the result from the array in the format number * i = ___

* Author : <Utakarsh Jain>
* Date : 22-09-2026
*/
public class MultiplicationSixToNine {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt(); // Taking the user input
        int multiplicationResult[]= new int[4]; // Declaring an array to store the multiplication result
        for (int i = 6; i <= 9; i++) { // Loop to calculate the multiplication table of numbers from 6 to 9
            multiplicationResult[i - 6] = number * i; // Storing the multiplication result in the array
        }

        for (int i = 6; i <= 9; i++) { // Loop to display the multiplication result 
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]); 
        }
        sc.close();
    }
}

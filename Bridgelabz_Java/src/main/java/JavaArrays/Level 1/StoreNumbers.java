import java.util.Scanner;
/*Problem 4 - GCR Java Arrays Level 1
Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. Show all the numbers as well as the sum of all numbers 
Hint => 
Create a variable to store an array of 10 elements of type double as well as a variable to store the total of type double initializes to 0.0. Also, the index variable is initialized to 0 for the array
Use infinite while loop as in while (true)
Take the user entry and check if the user entered 0 or a negative number to break the loop 
Also, break from the loop if the index has a value of 10 as the array size is limited to 10.
If the user entered a number other than 0 or a negative number inside the while loop then assign the number to the array element and increment the index value
Take another for loop to get the values of each element and add it to the total 
Finally display the total value

* Author : <Utakarsh Jain>
* Date : 22-09-2026
*/
public class StoreNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double numbers[]= new double[10]; // Declaring an array of size 10 to store the numbers
        double total = 0.0; // Declaring a variable to store the sum of the numbers
        int index = 0; // Declaring a variable to store the index of the array
        while (true) { // Infinite while loop
            System.out.print("Enter a number: ");
            double number = sc.nextDouble(); // Taking the user input
            if (number <= 0) { // Checking if the number is 0 or negative
                break;
            } 

            if (index == 10) { // Checking if the index is 10
                break;
            }

            numbers[index] = number; // Storing the number in the array
            index++; // Incrementing the index
        }

        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) { // Loop to print the numbers 
            System.out.println(numbers[i]); // Printing the numbers
            total += numbers[i]; // Adding the numbers 
        }
        System.out.println("Sum:" + total); // Printing the sum of the numbers
        sc.close(); // Closing the scanner
    }
}

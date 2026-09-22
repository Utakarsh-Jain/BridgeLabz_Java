/*Problem 9 - GCR Java Arrays Level 1
Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 2D Array into a single dimension array
Hint => 
Take user input for rows and columns, create a 2D array (Matrix), and take the user input 
Copy the elements of the matrix to a 1D array. For this create a 1D array of size rows*columns as in int[] array = new int[rows * columns];
Define the index variable and Loop through the 2D array. Copy every element of the 2D array into the 1D array and increment the index
Note: For looping through the 2D array, you will need Nested for loop, Outer for loop for rows, and the inner for loops to access each element

* Author : <Utakarsh Jain>
* Date : 22-09-2026
*/

import java.util.Scanner;
public class TwoDToOneD {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: "); 
        int rows = sc.nextInt(); // Taking User Input for rows
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt(); // Taking User Input for columns
        int matrix[][] = new int[rows][columns]; //Initializing the matrix with number of rows and columns
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt(); // Taking User Input for matrix elements
            }
        }
        int array[] = new int[rows * columns]; //Initializing the 1D array with size equal to the product of rows and columns
        int index = 0; 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j]; // Assigning the elements of the 2D array to the 1D array
                index++; // Incrementing the index
            }
        }
        System.out.println("1D Array:"); // Printing the 1D array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}
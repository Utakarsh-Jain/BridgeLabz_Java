/*
Multiple Catch Blocks
Problem Statement:
Create a Java program that performs array operations.
Accept an integer array and an index number.
Retrieve and print the value at that index.
Handle the following exceptions:
ArrayIndexOutOfBoundsException if the index is out of range.
NullPointerException if the array is null.
Expected Behavior:
If valid, print "Value at index X: Y".
If the index is out of bounds, display "Invalid index!".
If the array is null, display "Array is not initialized!".
Name: Utakarsh Jain
Date: 19/10/2026
*/

package main.java.ExceptionHandling;

public class MultipleCatch {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; //creating an array

        try {
            int index = 3;
            int value = numbers[index]; //getting the value at the index
            System.out.println("Value at index " + index + ": " + value); //printing the value at the index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!"); //printing the invalid index message
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!"); //printing the array is not initialized message
        } finally {
            System.out.println("Program finished"); //printing the program finished message
        }
    }
}

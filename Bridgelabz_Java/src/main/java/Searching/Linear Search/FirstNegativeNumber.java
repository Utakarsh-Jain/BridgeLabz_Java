/*

Problem:
You are given an integer array. Write a program that performs Linear Search to find the first negative number in the array. If a negative number is found, return its index. If no negative number is found, return -1.
Approach:
Iterate through the array from the start.
Check if the current element is negative.
If a negative number is found, return its index.
If the loop completes without finding a negative number, return -1.
Name : Utakarsh Jain
Date : 9/10/2026
*/

import java.util.Scanner;

public class FirstNegativeNumber {
    // Function to find the first negative number
    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) { // Checking if the element is negative
                return i; // Returning the index of the first negative number
            }
        }
        return -1; // Returning -1 if no negative number is found
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        int index = findFirstNegative(arr);
        if (index != -1) { // Checking if the index is not -1
            System.out.println("First negative number found at index: " + index); // Printing the index of the first negative number
        } else {
            System.out.println("No negative number found."); // Printing that no negative number is found
        }
        sc.close();
    }
}

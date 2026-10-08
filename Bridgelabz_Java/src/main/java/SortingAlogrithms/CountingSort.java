/*

Counting Sort - Sort Student Ages
Problem Statement:
A school collects students’ ages (ranging from 10 to 18) and wants them sorted. Implement Counting Sort for this task.
Hint:
Create a count array to store the frequency of each age.
Compute cumulative frequencies to determine positions.
Place elements in their correct positions in the output array.
Name : Utakarsh Jain
Date: 08/10/2026

*/

package main.java.SortingAlogrithms;

public class CountingSort {

    public static void countingSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        // Find the maximum element to determine the range
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Create a count array to store the frequency of each element
        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Compute cumulative frequencies
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Create an output array
        int[] output = new int[arr.length];

        // Place elements in their correct positions
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy the sorted elements back to the original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }
    
    public static void main(String[] args) {
        int[] ages = {12, 11, 13, 12, 10, 11, 18, 15, 13};
        System.out.println("Ages before sorting:");
        printArray(ages);
        countingSort(ages);
        System.out.println("Ages after sorting:");
        printArray(ages);
    }
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}

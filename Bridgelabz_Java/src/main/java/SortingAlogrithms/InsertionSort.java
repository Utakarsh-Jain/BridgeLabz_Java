/*

Insertion Sort - Sort Employee IDs
Problem Statement:
A company stores employee IDs in an unsorted array. Implement Insertion Sort to sort the employee IDs in ascending order.
Hint:
Divide the array into sorted and unsorted parts.
Pick an element from the unsorted part and insert it into its correct position in the sorted part.
Repeat for all elements.
Name : Utakarsh Jain
Date : 8/10/2026


*/

package main.java.SortingAlogrithms;

public class InsertionSort {

    // Sort employee IDs using Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Current element to be inserted
            int j = i - 1; // Index of the last element in the sorted part

            // Move elements of the sorted part that are greater than the key
            // to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key; // Insert the key into its correct position
        }
    }
    public static void main(String[] args) {
        int[] employeeIds = {123, 456, 789, 101, 202}; // Employee IDs (unsorted)
        System.out.println("Employee IDs before sorting: ");
        printArray(employeeIds);
        insertionSort(employeeIds); // Sort the employee IDs
        System.out.println("Employee IDs after sorting: ");
        printArray(employeeIds);
    }
    // Helper method to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

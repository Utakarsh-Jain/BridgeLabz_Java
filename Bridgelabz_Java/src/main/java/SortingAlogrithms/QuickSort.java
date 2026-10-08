/*

Quick Sort - Sort Product Prices
Problem Statement:
An e-commerce company wants to display product prices in ascending order. Implement Quick Sort to sort the product prices.
Hint:
Pick a pivot element (first, last, or random).
Partition the array such that elements smaller than the pivot are on the left and larger ones are on the right.
Recursively apply Quick Sort on left and right partitions.
Name : Utakarsh Jain
Date: 08/10/2026

*/

package main.java.SortingAlogrithms;

public class QuickSort {

    // Sort the array using Quick Sort
    public static void quickSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Array is already sorted
        }
        quickSort(arr, 0, arr.length - 1);
    }
    
    // Recursive helper method for Quick Sort
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);
            
            // Recursively sort the left and right subarrays
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    
    // Partition the array around the pivot element
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as pivot
        int i = low - 1; // Index of smaller element
        
        // Traverse through all elements and compare with pivot
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // Swap the pivot element with the element at i + 1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1; // Return the pivot index
    }
    
    public static void main(String[] args) {
        int[] prices = {64, 34, 25, 12, 22, 11, 90}; // Product prices (unsorted)
        System.out.println("Prices before sorting: ");
        printArray(prices);
        quickSort(prices); // Sort the prices
        System.out.println("Prices after sorting: ");
        printArray(prices);
    }
    
    // Helper method to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}

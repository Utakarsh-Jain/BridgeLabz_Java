/*

Merge Sort - Sort an Array of Book Prices
Problem Statement:
A bookstore maintains a list of book prices in an array. Implement Merge Sort to sort the prices in ascending order.
Hint:
Divide the array into two halves recursively.
Sort both halves individually.
Merge the sorted halves by comparing elements.
Name: Utakarsh Jain
Date: 08/10/2026

*/

package main.java.SortingAlogrithms;

public class MergeSort {

    // Merge two sorted subarrays into a single sorted array
    private static void merge(int[] arr, int[] left, int[] right) {
        int n1 = left.length;
        int n2 = right.length;
        int i = 0, j = 0, k = 0;

        // Merge elements from left and right subarrays into arr
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements of left subarray
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy any remaining elements of right subarray
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    // Sort the array using Merge Sort
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Array is already sorted
        }

        int n = arr.length;
        int mid = n / 2;

        // Create left and right subarrays
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        // Copy data to left and right subarrays
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = arr[i];
        }

        // Recursively sort the subarrays
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted subarrays
        merge(arr, left, right);
    }
    
    public static void main(String[] args) {
        int[] prices = {10, 7, 8, 9, 1, 5}; // Book prices (unsorted)
        System.out.println("Prices before sorting: ");
        printArray(prices);
        mergeSort(prices); // Sort the prices
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

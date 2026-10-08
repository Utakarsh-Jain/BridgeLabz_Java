/*

Heap Sort - Sort Job Applicants by Salary
Problem Statement:
A company receives job applications with different expected salary demands. Implement Heap Sort to sort these salary demands in ascending order.
Hint:
Build a Max Heap from the array.
Extract the largest element (root) and place it at the end.
Reheapify the remaining elements and repeat until sorted.
Name: Utakarsh Jain
Date: 08/10/2026

*/

package main.java.SortingAlogrithms;

public class HeapSort {

    public static void main(String[] args) {
        int[] salaries = {50000, 80000, 30000, 60000, 70000}; // Job applicant salaries
        System.out.println("Salaries before sorting:");
        printArray(salaries);
        heapSort(salaries); // Sort the salaries
        System.out.println("Salaries after sorting:");
        printArray(salaries);
    }

    // Sort the array using Heap Sort
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build a max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a max heap
    private static void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // Left child
        int right = 2 * i + 2; // Right child

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            // Swap
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    // Helper method to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

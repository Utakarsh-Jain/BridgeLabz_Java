/*
Sorting Large Data Efficiently
Objective:
Compare sorting algorithms Bubble Sort (O(N²)), Merge Sort (O(N log N)), and Quick Sort (O(N log N)).

Approach:
Bubble Sort: Repeated swapping (inefficient for large data).
Merge Sort: Divide & Conquer approach (stable).
Quick Sort: Partition-based approach (fast but unstable).

Name: Utakarsh Jain
Date: 13/10/2026
*/

package main.java.RuntimeAnalysisAndBigONotation;
import java.util.Arrays;
public class SortingLargeData {

    // Bubble Sort - O(N^2)
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Merge Sort - O(N log N)
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    // Merge two sorted subarrays
    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Quick Sort - Average: O(N log N), Worst: O(N^2)
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Partition the array using the last element as pivot
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        // Bubble Sort is limited to smaller datasets
        int[] sizes = {1000, 5000, 10000};

        for (int size : sizes) {
            int[] dataset = new int[size];

            // Fill the dataset with random data
            for (int i = 0; i < size; i++) {
                dataset[i] = (int) (Math.random() * 100000);
            }

            System.out.println("\nDataset Size: " + size);

            // Test Bubble Sort
            int[] bubbleData = Arrays.copyOf(dataset, size);

            long startTime = System.nanoTime();
            bubbleSort(bubbleData);
            long endTime = System.nanoTime();

            double bubbleTime = (endTime - startTime) / 1_000_000.0;
            System.out.println("Bubble Sort: " + bubbleTime + " ms");

            // Test Merge Sort
            int[] mergeData = Arrays.copyOf(dataset, size);

            startTime = System.nanoTime();
            mergeSort(mergeData, 0, size - 1);
            endTime = System.nanoTime();

            double mergeTime = (endTime - startTime) / 1_000_000.0;
            System.out.println("Merge Sort: " + mergeTime + " ms");

            // Test Quick Sort
            int[] quickData = Arrays.copyOf(dataset, size);

            startTime = System.nanoTime();
            quickSort(quickData, 0, size - 1);
            endTime = System.nanoTime();

            double quickTime = (endTime - startTime) / 1_000_000.0;
            System.out.println("Quick Sort: " + quickTime + " ms");
        }
    }
}
/*

Search a Target in a Large Dataset
Objective:
Compare the performance of Linear Search (O(N)) and Binary Search (O(log N)) on different dataset sizes.
Approach:
Linear Search: Scan each element until the target is found.
Binary Search: Sort the data first (O(N log N)), then perform O(log N) search.
Comparative Analysis:
Dataset Size (N)         Linear Search (O(N))        Binary Search (O(log N))
1,000                          1ms                          0.01ms
10,000                         10ms                         0.02ms
1,000,000                       1s                          0.1ms

Expected Result:
Binary Search performs much better for large datasets, provided data is sorted.

Name : Utakarsh Jain
Date : 13/10/2026

*/


package main.java.RuntimeAnalysisAndBigONotation;

import java.util.*;

public class SearchTargetInLargeDataset {

    // Linear Search - O(N)
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search - O(log N)
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Test with different dataset sizes
        int[] sizes = {1000, 10000, 1000000};

        for (int size : sizes) {
            // Create sorted dataset
            int[] dataset = new int[size];
            for (int i = 0; i < size; i++) {
                dataset[i] = i;
            }

            int target = size - 1; // Last element

            System.out.println("\nDataset Size: " + size);

            // Measure Linear Search
            long startTime = System.nanoTime();
            int linearResult = linearSearch(dataset, target);
            long endTime = System.nanoTime();
            long linearTime = (endTime - startTime) / 1000000; // Convert to ms

            System.out.println("Linear Search: " + linearTime + "ms (Found: " + (linearResult != -1) + ")");

            // Measure Binary Search
            startTime = System.nanoTime();
            int binaryResult = binarySearch(dataset, target);
            endTime = System.nanoTime();
            long binaryTime = (endTime - startTime) / 1000000; // Convert to ms

            System.out.println("Binary Search: " + binaryTime + "ms (Found: " + (binaryResult != -1) + ")");
        }
    }
}

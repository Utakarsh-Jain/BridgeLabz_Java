/*

Challenge Problem (for both Linear and Binary Search)
Problem:
You are given a list of integers. Write a program that uses Linear Search to find the first missing positive integer in the list and Binary Search to find the index of a given target number.
Approach:
Linear Search for the first missing positive integer:
Iterate through the list and mark each number in the list as visited (you can use negative marking or a separate array).
Traverse the array again to find the first positive integer that is not marked.
Binary Search for the target index:
After sorting the array, perform binary search to find the index of the given target number.
Return the index if found, otherwise return -1.

Name : Utakarsh Jain
Date : 9/10/2026

*/
package main.java.Searching.ChallengeProblems;

import java.util.Arrays;

public class LinearBinarySearch {
    // Function to find the first missing positive integer using Linear Search
    public static int findFirstMissingPositive(int[] arr) {
        int n = arr.length;
        boolean[] present = new boolean[n + 1];

        // Mark positive numbers present in the array
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] <= n) {
                present[arr[i]] = true;
            }
        }

        // Find the first positive integer that is not present
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }

        // If all positive integers from 1 to n are present, return n + 1
        return n + 1;
    }

    // Function to find the index of a target number using Binary Search
    public static int findTargetIndex(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) { // loop to find the target index
            int mid = left + (right - left) / 2; // mid element

            if (arr[mid] == target) { // if mid element is equal to the target
                return mid; // then target index is found
            } else if (arr[mid] < target) { // if mid element is less than the target
                left = mid + 1; // then target index is in the right half
            } else { // if mid element is greater than the target
                right = mid - 1; // then target index is in the left half
            }
        }

        return -1; // if target index is not found
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int target = 4;

        // Find the first missing positive integer
        int missingPositive = findFirstMissingPositive(arr);
        System.out.println("First missing positive integer: " + missingPositive);

        // Sort the array for binary search
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Find the index of the target number
        int targetIndex = findTargetIndex(arr, target);

        if (targetIndex != -1) {
            System.out.println("Index of target " + target + ": " + targetIndex);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }
}

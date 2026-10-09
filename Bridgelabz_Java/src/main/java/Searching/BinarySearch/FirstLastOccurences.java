/*

Find the First and Last Occurrence of an Element in a Sorted Array
Problem:
Given a sorted array and a target element, write a program that uses Binary Search to find the first and last occurrence of the target element in the array. If the element is not found, return -1.
Approach:
Use binary search to find the first occurrence:
Perform a regular binary search, but if the target is found, continue searching on the left side (right = mid - 1) to find the first occurrence.
Use binary search to find the last occurrence:
Similar to finding the first occurrence, but once the target is found, continue searching on the right side (left = mid + 1) to find the last occurrence.
Return the indices of the first and last occurrence. If not found, return -1.

Name : Utakarsh Jain
Date : 9/10/2026


*/

package main.java.Searching.BinarySearch;
public class FirstLastOccurences {
    // Function to find the first occurrence of a target element
    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int firstOccurrence = -1;
        while (left <= right) { // loop to find the first occurrence
            int mid = left + (right - left) / 2; // mid element
            if (arr[mid] == target) { // if mid element is equal to the target
                firstOccurrence = mid; // then first occurrence is found
                right = mid - 1; // then search in the left half for the first occurrence
            } else if (arr[mid] < target) { // if mid element is less than the target
                left = mid + 1; // then search in the right half for the first occurrence
            } else { // if mid element is greater than the target
                right = mid - 1; // then search in the left half for the first occurrence
            }
        }
        return firstOccurrence; // return the first occurrence
    }
    // Function to find the last occurrence of a target element
    public static int findLastOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int lastOccurrence = -1;
        while (left <= right) { // loop to find the last occurrence
            int mid = left + (right - left) / 2; // mid element
            if (arr[mid] == target) { // if mid element is equal to the target
                lastOccurrence = mid; // then last occurrence is found
                left = mid + 1; // then search in the right half for the last occurrence
            } else if (arr[mid] < target) { // if mid element is less than the target
                left = mid + 1; // then search in the right half for the last occurrence
            } else { // if mid element is greater than the target
                right = mid - 1; // then search in the left half for the last occurrence
            }
        }
        return lastOccurrence; // return the last occurrence
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 5, 5, 8, 9, 10};
        int target = 5;
        int firstOccurrence = findFirstOccurrence(arr, target);
        int lastOccurrence = findLastOccurrence(arr, target);
        System.out.println("First occurrence of " + target + " is at index: " + firstOccurrence);
        System.out.println("Last occurrence of " + target + " is at index: " + lastOccurrence);
    }
}

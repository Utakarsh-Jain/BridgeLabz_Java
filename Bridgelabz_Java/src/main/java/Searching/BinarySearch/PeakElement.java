/*

Find the Peak Element in an Array
Problem:
A peak element is an element that is greater than its neighbors. Write a program that performs Binary Search to find a peak element in an array. If there are multiple peak elements, return any one of them.
Approach:
Initialize left as 0 and right as n - 1.
Perform a binary search:
Find the middle element mid = (left + right) / 2.
If arr[mid] > arr[mid - 1] and arr[mid] > arr[mid + 1], arr[mid] is a peak element.
If arr[mid] < arr[mid - 1], then search the left half, updating right = mid - 1.
If arr[mid] < arr[mid + 1], then search the right half, updating left = mid + 1.
Continue until a peak element is found.


Name : Utakarsh Jain
Date : 9/10/2026


*/

package main.java.Searching.BinarySearch;

public class PeakElement {
    // Function to find the peak element in an array
    public static int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) { // loop to find the peak element
            int mid = left + (right - left) / 2; // mid element

            if (arr[mid] < arr[mid + 1]) { // if mid element is less than the next element
                left = mid + 1; // then peak element is in the right half
            } else { // if mid element is greater than the next element
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peakIndex = findPeakElement(arr);

        System.out.println("Peak element index: " + peakIndex);
        System.out.println("Peak element: " + arr[peakIndex]);
    }

}

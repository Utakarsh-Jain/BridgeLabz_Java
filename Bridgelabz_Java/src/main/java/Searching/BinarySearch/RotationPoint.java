/*

Problem:
You are given a rotated sorted array. Write a program that performs Binary Search to find the index of the smallest element in the array (the rotation point).
Approach:
Initialize left as 0 and right as n - 1.
Perform a binary search:
Find the middle element mid = (left + right) / 2.
If arr[mid] > arr[right], then the smallest element is in the right half, so update left = mid + 1.
If arr[mid] < arr[right], the smallest element is in the left half, so update right = mid.
Continue until left equals right, and then return arr[left] (the rotation point).

Name : Utakarsh Jain
Date : 9/10/2026


*/

package main.java.Searching.BinarySearch;
public class RotationPoint {

    // Function to find the index of the smallest element
    public static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) { // loop to find the rotation point
            int mid = left + (right - left) / 2; // mid element

            if (arr[mid] > arr[right]) { // if mid element is greater than the last element
                left = mid + 1; // then smallest element is in the right half
            } else { // if mid element is less than the last element
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int index = findRotationPoint(arr);
        System.out.println("Index of smallest element: " + index);
        System.out.println("Smallest element: " + arr[index]);
    }
}
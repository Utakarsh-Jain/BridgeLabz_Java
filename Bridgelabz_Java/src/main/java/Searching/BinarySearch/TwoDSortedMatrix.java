/*


Search for a Target Value in a 2D Sorted Matrix
Problem:
You are given a 2D matrix where each row is sorted in ascending order, and the first element of each row is greater than the last element of the previous row. Write a program that performs Binary Search to find a target value in the matrix. If the value is found, return true. Otherwise, return false.
Approach:
Treat the matrix as a 1D array (flattened version).
Initialize left as 0 and right as rows * columns - 1.
Perform binary search:
Find the middle element index mid = (left + right) / 2.
Convert mid to row and column indices using row = mid / numColumns and col = mid % numColumns.
Compare the middle element with the target:
If it matches, return true.
If the target is smaller, search the left half by updating right = mid - 1.
If the target is larger, search the right half by updating left = mid + 1.
If the element is not found, return false.
Name : Utakarsh Jain
Date : 9/10/2026

*/
package main.java.Searching.BinarySearch;

public class TwoDSortedMatrix {
    // Function to search for a target value in a 2D sorted matrix
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) { // loop to search for the target value
            int mid = left + (right - left) / 2; // mid element
            int row = mid / cols; // mid row
            int col = mid % cols; // mid column
            if (matrix[row][col] == target) { // if mid element is equal to the target
                return true; // then target value is found
            } else if (matrix[row][col] < target) { // if mid element is less than the target
                left = mid + 1; // then target value is in the right half
            } else { // if mid element is greater than the target
                right = mid - 1; // then target value is in the left half
            }
        }
        return false; // if target value is not found
    }
    public static void main(String[] args) {
        int[][] matrix = { {1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60} };
        int target = 3;
        boolean found = searchMatrix(matrix, target);
        System.out.println("Target found: " + found);
    }
}

/*

Sliding Window Maximum
Problem: Given an array and a window size k, find the maximum element in each sliding window of size k.
Hint: Use a deque (double-ended queue) to maintain indices of useful elements in each window.
Name : Utakarsh Jain
Date : 07/10/2026
*/
import java.util.*;
public class SlidingWindow {
    // Method to find maximum in each sliding window
    public static void printMaxInWindow(int[] arr, int k) {
        int n = arr.length;
        // Check for invalid input
        if (n == 0 || k <= 0 || k > n) {
            System.out.println("Invalid input");
            return;
        }
        // Use a deque to store indices of useful elements
        // The front of the deque will always have the index of the maximum element
        Deque<Integer> deque = new ArrayDeque<>();
        // Process the first window
        for (int i = 0; i < k; i++) {
            // Remove smaller elements from the rear
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.removeLast();
            }
            // Add current element's index to the rear
            deque.addLast(i);
        }
        // Process remaining windows
        for (int i = k; i < n; i++) {
            // The element at the front of the deque is the maximum for the previous window
            System.out.print(arr[deque.peekFirst()] + " ");
            
            // Remove elements from the front that are outside the current window
            if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.removeFirst();
            }
            // Remove smaller elements from the rear
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.removeLast();
            }
            // Add current element's index to the rear
            deque.addLast(i);
        }
        // Print the maximum for the last window
        System.out.println(arr[deque.peekFirst()]);
    }
    
    // Main method to test the sliding window maximum
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        
        System.out.println("Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nWindow size: " + k);
        System.out.print("Maximums in sliding windows: ");
        printMaxInWindow(arr, k);
        
        int[] arr2 = {8, 5, 10, 7, 9, 4, 15, 12, 90, 75};
        int k2 = 4;
        
        System.out.println("\nArray: ");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println("\nWindow size: " + k2);
        System.out.print("Maximums in sliding windows: ");
        printMaxInWindow(arr2, k2);
    }
}

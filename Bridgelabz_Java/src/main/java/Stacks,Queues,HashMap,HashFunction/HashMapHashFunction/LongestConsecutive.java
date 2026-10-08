/*
Longest Consecutive Sequence
Problem: Given an unsorted array, find the length of the longest consecutive elements sequence.
Hint: Use a hash map to store elements and check for consecutive elements efficiently.
Name : Utakarsh Jain
Date : 8/10/2026
*/

import java.util.HashMap;
public class LongestConsecutive {
    // Find the length of the longest consecutive elements sequence
    static int longestConsecutive(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], 1); // Add all elements to the hash map
        }
        int maxLength = 0; // Initialize the maximum length
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i] - 1)) { // Check if the current number is the start of a sequence
                int currentNum = arr[i]; // Start of a sequence
                int currentLength = 1;
                while (map.containsKey(currentNum + 1)) { // Check for next consecutive numbers
                    currentNum++;
                    currentLength++;
                }
                maxLength = Math.max(maxLength, currentLength); // Update the maximum length
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println("Length of longest consecutive sequence is: " + longestConsecutive(arr));
    }
}

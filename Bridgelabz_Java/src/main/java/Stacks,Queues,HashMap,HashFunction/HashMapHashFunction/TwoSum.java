/*

Two Sum Problem
Problem: Given an array and a target sum, find two indices such that their values add up to the target.
Hint: Use a hash map to store the index of each element as you iterate. Check if target - current_element exists in the map.
Name : Utakarsh Jain
Date : 8/10/2026
*/

import java.util.HashMap;
public class TwoSum {
    // Find two indices such that their values add up to the target
    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Find the complement
            if (map.containsKey(complement)) { // Check if the complement exists in the map
                return new int[] {map.get(complement), i}; // Return the indices
            }
            map.put(nums[i], i); // Store the index of the current element
        }
        return new int[] {-1, -1}; // Return -1, -1 if no pair is found
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}

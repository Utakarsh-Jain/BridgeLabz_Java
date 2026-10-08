/*
Check for a Pair with Given Sum in an Array
Problem: Given an array and a target sum, find if there exists a pair of elements whose sum is equal to the target.
Hint: Store visited numbers in a hash map and check if target - current_number exists in the map.
Name : Utakarsh Jain
Date : 8/10/2026
*/

import java.util.HashMap;
public class PairWithGivenSum {
    // Find if there exists a pair with given sum
    static boolean hasPairWithSum(int[] arr, int sum) {
        HashMap<Integer, Integer> map = new HashMap<>(); 
        for (int i = 0; i < arr.length; i++) {
            int complement = sum - arr[i];// to find the other number in the pair
            if (map.containsKey(complement)) {//if the other number is present in the map
                System.out.println("Pair found: " + complement + " and " + arr[i]);
                return true;
            }
            map.put(arr[i], 1); //add the current number to the map
        }
        System.out.println("No pair found with sum " + sum);
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int sum = 16;
        hasPairWithSum(arr, sum);
    }
}

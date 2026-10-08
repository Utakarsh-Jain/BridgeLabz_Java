    /*

    Find All Subarrays with Zero Sum
    Problem: Given an array, find all subarrays whose elements sum up to zero.
    Hint: Use a hash map to store the cumulative sum and its frequency. If a sum repeats, a zero-sum subarray exists.
    Name : Utakarsh Jain
    Date : 8/10/2026
    */

    import java.util.HashMap;
    public class ZeroSumSubarrays {
        // Find all subarrays whose sum is zero
        static void findSubarrays(int[] arr) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int sum = 0;
            // Sum 0 exists before the array starts
            map.put(0, 1);
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
                // If same cumulative sum appears again,
                // elements between them have sum zero
                if (map.containsKey(sum)) {
                    System.out.println("Zero Sum Subarray found ending at index " + i);
                }
                // Store frequency of cumulative sum
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        public static void main(String[] args) {
            int[] arr = {6, 3, -4, -3, 4, -7};
            findSubarrays(arr);
        }
    }
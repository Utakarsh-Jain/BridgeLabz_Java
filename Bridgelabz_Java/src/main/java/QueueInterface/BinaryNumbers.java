/*
Generate Binary Numbers Using a Queue
Generate the first N binary numbers (as strings) using a queue.
Example:
N=5 → Output: ["1", "10", "11", "100", "101"].
Name : Utakarsh Jain
Date: 14/10/2026
*/

package main.java.QueueInterface;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumbers {
    
    public static void generateBinaryNumbers(int n) {
        if (n <= 0) {
            return;
        }

        Queue<String> queue = new LinkedList<>();

        // 1. Start with "1"
        queue.add("1");

        for (int i = 0; i < n; i++) {

            // 2. Print the front
            String current = queue.poll();
            System.out.print(current + " ");

            // 3. Generate next two
            queue.add(current + "0");
            queue.add(current + "1");
        }
    }

    public static void main(String[] args) {
        int N = 10;  // generate first 10 binary numbers

        System.out.println("First " + N + " Binary Numbers:");
        generateBinaryNumbers(N);
    }
}

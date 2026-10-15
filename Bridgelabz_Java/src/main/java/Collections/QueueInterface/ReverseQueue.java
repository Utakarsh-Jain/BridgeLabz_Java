/*

Reverse a Queue
Reverse the elements of a queue using only queue operations (e.g., add, remove, isEmpty).
Example:
Input: [10, 20, 30] → Output: [30, 20, 10].
Name : Utakarsh Jain
Date: 14/10/2026

*/

package main.java.Collections.QueueInterface;
import java.util.LinkedList;
import java.util.Queue;
public class ReverseQueue {
    public static void reverseQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return;
        }
        // 1. Remove the front element
        int element = queue.poll();
        // 2. Reverse the rest of the queue
        reverseQueue(queue);
        // 3. Add the removed element to the end
        queue.add(element);
    }
    public static void main(String[] args) {
        // Test Queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println("Original Queue: " + queue);
        reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);
    }
}

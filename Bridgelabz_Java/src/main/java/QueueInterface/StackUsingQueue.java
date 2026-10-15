/*

Implement a Stack Using Queues
Implement a stack data structure using two queues and support push, pop, and top operations.
Example:
Push 1, 2, 3 → Pop → Output: 3.
Name : Utakarsh Jain
Date: 14/10/2026

*/

package main.java.QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();
    public void push(int x) { // push the element into the queue
        q1.add(x);
        System.out.println("Pushed: " + x);
    }
    public int pop() { // pop the element from the queue
        if (q1.isEmpty()) { // check if the queue is empty
            System.out.println("Stack is empty");
            return -1;
        }
        // Move all elements except the last one to q2
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        int top = q1.poll();
        System.out.println("Popped: " + top);
        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return top;
    }
    public int top() { // top element of the stack
        if (q1.isEmpty()) { // check if the queue is empty
            System.out.println("Stack is empty");
            return -1;
        }
        // Similar to pop but keep the element
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        int top = q1.poll();
        System.out.println("Top: " + top);
        // Add the top element to q2 as well
        q2.add(top);
        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return top;
    }
    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.top();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}

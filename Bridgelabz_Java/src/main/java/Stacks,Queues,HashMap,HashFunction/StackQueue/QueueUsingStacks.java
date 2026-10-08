/*
Implement a Queue Using Stacks
Problem: Design a queue using two stacks such that enqueue and dequeue operations are performed efficiently.
Hint: Use one stack for enqueue and another stack for dequeue. Transfer elements between stacks as needed.
Name : Utakarsh Jain
Date : 07/10/2026
*/

public class QueueUsingStacks {
    // stack1 for enqueue operations
    java.util.Stack<Integer> stack1;
    // stack2 for dequeue operations
    java.util.Stack<Integer> stack2;
    // Constructor to initialize the two stacks
    public QueueUsingStacks() {
        stack1 = new java.util.Stack<>();
        stack2 = new java.util.Stack<>();
    }
    // Method to add an element to the queue (enqueue)
    public void enqueue(int x) {
        stack1.push(x);
        System.out.println("Enqueued: " + x);
    }
    // Method to remove an element from the queue (dequeue)
    public int dequeue() {
        // If stack2 is empty, transfer all elements from stack1 to stack2
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        // If stack2 is still empty, the queue is empty
        if (stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // Or throw an exception
        }
        int dequeuedElement = stack2.pop();
        System.out.println("Dequeued: " + dequeuedElement);
        return dequeuedElement;
    }
    // Method to check if the queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
    // Method to display the queue elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        // Elements in stack2 are in reverse order (top to bottom)
        // Elements in stack1 are in enqueue order (bottom to top)
        // To display in queue order, we need to show stack2 (top to bottom)
        // followed by stack1 (bottom to top)
        
        // Create a temporary stack to reverse stack2 for display
        java.util.Stack<Integer> temp = new java.util.Stack<>();
        while (!stack2.isEmpty()) {
            int element = stack2.pop();
            temp.push(element);
        }
        // Display stack2 elements (now in correct queue order)
        while (!temp.isEmpty()) {
            int element = temp.pop();
            System.out.print(element + " ");
            stack2.push(element); // Push back to restore stack2
        }
        // Display stack1 elements (bottom to top)
        for (int i = 0; i < stack1.size(); i++) {
            System.out.print(stack1.get(i) + " ");
        }
        System.out.println();
    }
    // Main method to test the queue implementation
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        // Test enqueue operation
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        // Display the queue
        queue.display();
        // Test dequeue operation
        queue.dequeue();
        queue.dequeue();
        // Test enqueue after dequeue
        queue.enqueue(40);
        queue.enqueue(50);
        // Display the queue
        queue.display();
        // Empty the queue
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        // Test empty queue operations
        queue.dequeue();
        queue.display();
    }
}

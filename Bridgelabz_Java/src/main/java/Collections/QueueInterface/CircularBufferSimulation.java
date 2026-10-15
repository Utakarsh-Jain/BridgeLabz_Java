/*

Circular Buffer Simulation
Implement a circular buffer (fixed-size queue) using an array-based queue. When full, overwrite the oldest element.
Example:
Buffer size=3: Insert 1, 2, 3 → Insert 4 → Buffer: [2, 3, 4].
Name : Utakarsh Jain
Date: 14/10/2026

*/

package main.java.Collections.QueueInterface;
public class CircularBufferSimulation {
    private int[] buffer;
    private int front, rear, size, capacity;

    public CircularBufferSimulation(int capacity) { // create a new circular buffer 
        this.capacity = capacity;
        buffer = new int[capacity];
    }

    public void enqueue(int item) { // add an element to the circular buffer 
        if (isFull()) { // check if the buffer is full 
            front = (front + 1) % capacity; // move the front pointer to the next element 
        } else { 
            size++; // increase the size of the buffer 
        }
        rear = (rear + 1) % capacity; // move the rear pointer to the next element 
        buffer[rear] = item; // add the element to the rear of the buffer 
        
    }

    public int dequeue() { // remove an element from the circular buffer 
        if (isEmpty()) { // check if the buffer is empty 
            throw new IllegalStateException("Buffer is empty");
        }
        int item = buffer[front]; // remove the element from the front of the buffer 
        front = (front + 1) % capacity; // move the front pointer to the next element 
        size--; // decrease the size of the buffer 
        return item; // return the removed element 
    }

    public boolean isFull() { // check if the buffer is full 
        return size == capacity; // return true if the buffer is full 
    }

    public boolean isEmpty() { // check if the buffer is empty 
        return size == 0; // return true if the buffer is empty 
    }

    public void display() {
        System.out.print("Buffer: ");
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularBufferSimulation cb = new CircularBufferSimulation(3);
        cb.enqueue(1);
        cb.enqueue(2);
        cb.enqueue(3);
        cb.display(); // 1 2 3
        cb.enqueue(4); // overwrite 1
        cb.display(); // 2 3 4
        System.out.println("Dequeued: " + cb.dequeue()); // 2
        cb.display(); // 3 4
    }
}

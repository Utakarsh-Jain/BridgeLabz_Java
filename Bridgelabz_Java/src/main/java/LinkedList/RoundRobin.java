/*

Round Robin Scheduling Algorithm
Problem Statement: Implement a round-robin CPU scheduling algorithm using a circular linked list. Each node will represent a process and contain Process ID, Burst Time, and Priority. Implement the following functionalities:
Add a new process at the end of the circular list.
Remove a process by Process ID after its execution.
Simulate the scheduling of processes in a round-robin manner with a fixed time quantum.
Display the list of processes in the circular queue after each round.
Calculate and display the average waiting time and turn-around time for all processes.
Hint:
Use a circular linked list to represent a queue of processes.
Each process executes for a fixed time quantum, and then control moves to the next process in the circular list.
Maintain the current node as the process being executed, and after each round, update the list to simulate execution.
Name : Utakarsh Jain
Date : 6/10/2026
*/

package main.java.LinkedList;
public class RoundRobin {
    static class Node { // Represents a process in the queue
        int pid;
        int burstTime;
        int priority;
        Node next;
        Node prev;
        Node(int pid, int burstTime, int priority) { // Constructor to initialize a process
            this.pid = pid;
            this.burstTime = burstTime;
            this.priority = priority;
        }
    }
    Node head;
    Node tail;
    int timeQuantum; // Time quantum for each process
    void addProcess(int pid, int burstTime, int priority) { // Method to add a process to the queue
        Node newNode = new Node(pid, burstTime, priority); // Create a new node
        if (head == null) { // If the queue is empty
            head = tail = newNode; // The new node becomes the head and tail
            tail.next = head; // The tail points to the head to make it circular
            tail.prev = head;
            return;
        }
        tail.next = newNode; // The current tail points to the new node
        newNode.prev = tail; // The new node points to the current tail
        newNode.next = head; // The new node points to the head to make it circular
        tail = newNode; // The new node becomes the tail
    }

    void removeProcess(int pid) { // Method to remove a process from the queue based on its ID
        Node current = head; // Start from the head of the queue
        while (current != null) { // Traverse through the queue to find the process
            if (current.pid == pid) { // If the process is found
                if (current == head) { // If the process is the head
                    head = current.next; // Update the head to the next node
                }

                if (current == tail) { // If the process is the tail
                    tail = current.prev; // Update the tail to the previous node
                }

                if (current.prev != null) { // If the process is not the head
                    current.prev.next = current.next; // Link the previous node to the next node
                }
                if (current.next != null) { // If the process is not the tail
                    current.next.prev = current.prev; // Link the next node to the previous node
                }
                System.out.println("Process removed");
                return;
            }

            current = current.next;
        }

        System.out.println("Process not found");
    }
    void simulateScheduling() { // Method to simulate the round-robin scheduling
        Node current = head; // Start from the head of the queue
        while (current != null) { // Traverse through the queue to find the process
            if (current.burstTime > 0) { // If the process is not finished
                System.out.println("Executing process " + current.pid); // Print the process being executed
                current.burstTime -= timeQuantum; // Decrease the burst time by the time quantum
                if (current.burstTime < 0) { // If the burst time is negative
                    current.burstTime = 0; // Set the burst time to 0
                }
            }

            if (current.burstTime == 0) { // If the burst time is 0
                System.out.println("Process " + current.pid + " completed"); // Print the process completed
                removeProcess(current.pid); // Remove the process from the queue
            }

            current = current.next; // Move to the next process
        }
    }
    public static void main(String[] args) { // Main method to test the round-robin scheduling
        RoundRobin roundRobin = new RoundRobin(); // Create a new round-robin object
        roundRobin.addProcess(1, 10, 1); // Add a new process
        roundRobin.addProcess(2, 5, 2); // Add a new process
        roundRobin.addProcess(3, 8, 3); // Add a new process
        roundRobin.timeQuantum = 3; // Set the time quantum
        roundRobin.simulateScheduling(); // Simulate the round-robin scheduling
    }
    
}

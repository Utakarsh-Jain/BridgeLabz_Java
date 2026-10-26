/*
Problem Statement 1: "Simple Threaded Counter
Background:
You are tasked with creating a simple threaded counter program that counts from 1 to a
specified limit concurrently using multiple threads.
Requirements:
User Input: Prompt the user to input an integer representing the counting limit.
Threaded Counting: Create a Java program that uses multiple threads to count from 1 to the
specified limit. Each thread should be responsible for counting a portion of the range.
Thread Coordination: Implement a mechanism to ensure that the threads execute in a
synchronized manner to maintain the correct counting order.
Output: Print the count of each thread to the console, and ensure that the overall count from 1
to the specified limit is accurate.
Error Handling: Implement basic error handling to handle invalid user inputs or unexpected
issues during execution.
Deliverables: Provide a well-documented Java implementation of the threaded counter
program. Include a brief explanation of the program's functionality and any challenges faced
during implementation.
Name: Utakarsh Jain
Date: 24/10/2026

 */
import java.util.Scanner;
class Counter {
    private int count = 1;
    private final int limit;
    private final int totalThreads;
    public Counter(int limit, int totalThreads) { //Parameterized Constructor
        this.limit = limit;
        this.totalThreads = totalThreads;
    }
    public synchronized void printCount(int threadId) {
        while (count <= limit) {
            // Assign numbers to threads in round-robin order
            if ((count - 1) % totalThreads == threadId) {
                System.out.println("Thread " + (threadId + 1) + ": " + count);
                count++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) { //catching the exception
                    Thread.currentThread().interrupt(); //interrupting the current thread
                    return;
                }
            }
        }
        notifyAll(); //notifying all the threads
    }
}
public class SimpleThreadedCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter counting limit: ");
            int limit = sc.nextInt();
            if (limit < 1) {
                System.out.println("Limit must be a positive integer.");
                return;
            }
            int totalThreads = 3;
            Counter counter = new Counter(limit, totalThreads);
            Thread[] threads = new Thread[totalThreads];
            for (int i = 0; i < totalThreads; i++) {
                final int threadId = i;
                threads[i] = new Thread(
                        () -> counter.printCount(threadId)
                );
                threads[i].start();
            }
            for (Thread thread : threads) {
                thread.join();
            }
            System.out.println("Counting completed.");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input! Please enter an integer.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread was interrupted.");
        } finally {
            sc.close();
        }
    }
}

/*
Problem Statement 2: Producer-Consumer with Shared Resource
Background:
You are asked to implement a simple producer-consumer program where one thread generates
tasks (producers), and another thread processes these tasks (consumers) using a shared
resource.
Requirements:
Task Generation:
Create a producer thread that generates tasks, where each task is represented by a simple
integer value.
Task Processing:
Implement a consumer thread that processes tasks by consuming them from a shared resource
(e.g., a shared queue).
Shared Resource:

Design a shared resource (e.g., a shared queue) that facilitates communication between the
producer and consumer threads.
Thread Coordination:
Ensure proper synchronization between the producer and consumer threads to avoid race
conditions or conflicts over the shared resource.
Output:
Print messages to the console indicating when a task is produced and when it is consumed.
Error Handling:
Implement basic error handling to handle unexpected issues during execution.
Deliverables:
Provide a well-documented Java implementation of the producer-consumer program with a
shared resource.
Include a brief explanation of the program's functionality and any challenges faced during
implementation.

Name: Utakarsh Jain
Dte: 24/10/2026

 */
import java.util.LinkedList;
import java.util.Queue;
class SharedResource {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int capacity = 3;
    public synchronized void produce(int task) throws InterruptedException {
        while (queue.size() == capacity) { //checking if there is any product present
            wait();
        }

        queue.add(task); //adding the product
        System.out.println("Produced task: " + task);

        notifyAll(); //notifying the consumer block
    }

    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }

        int task = queue.remove(); //consuming the product
        System.out.println("Consumed task: " + task);

        notifyAll(); //notifying the producer
        return task;
    }
}

class Producer implements Runnable {
    private final SharedResource resource;
    private final int totalTasks;

    public Producer(SharedResource resource, int totalTasks) {
        this.resource = resource;
        this.totalTasks = totalTasks;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= totalTasks; i++) {
                resource.produce(i);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Producer interrupted.");
        }
    }
}

class Consumer implements Runnable {
    private final SharedResource resource;
    private final int totalTasks;

    public Consumer(SharedResource resource, int totalTasks) {
        this.resource = resource;
        this.totalTasks = totalTasks;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= totalTasks; i++) {
                resource.consume();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Consumer interrupted.");
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        int totalTasks = 5;

        Thread producer = new Thread(
                new Producer(resource, totalTasks) //creating threads
        );

        Thread consumer = new Thread( //creating threads
                new Consumer(resource, totalTasks)
        );

        producer.start(); //starting of threads
        consumer.start(); //starting of threads

        try {
            producer.join();
            consumer.join();
            System.out.println("All tasks processed successfully.");
        } catch (InterruptedException e) { //catching of exception
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted.");
        }
    }
}

/*
Implement a Custom Hash Map
Problem: Design and implement a basic hash map class with operations for insertion, deletion, and retrieval.
Hint: Use an array of linked lists to handle collisions using separate chaining.
Name : Utakarsh Jain
Date : 8/10/2026
*/

public class CustomHashMap {
    private static class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node[] buckets; // Array of linked lists
    private int capacity;

    // Constructor to initialize the hash map
    public CustomHashMap(int capacity) {
        this.capacity = capacity;
        buckets = new Node[capacity];
    }

    // Hash function to determine the bucket index
    private int getHash(int key) {
        return Math.abs(key) % capacity;
    }

    // Insert or update a key-value pair
    public void put(int key, int value) {
        int index = getHash(key);
        Node head = buckets[index];

        // Check if key already exists
        while (head != null) {
            if (head.key == key) {
                head.value = value; // Update value if key exists
                return;
            }
            head = head.next;
        }

        // Insert new key-value pair at the beginning of the list
        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
    }

    // Retrieve value for a given key
    public int get(int key) {
        int index = getHash(key);
        Node head = buckets[index];

        // Traverse the linked list to find the key
        while (head != null) {
            if (head.key == key) {
                return head.value;
            }
            head = head.next;
        }

        return -1; // Return -1 if key is not found
    }

    // Remove a key-value pair
    public void remove(int key) {
        int index = getHash(key);
        Node head = buckets[index];
        Node prev = null;

        // Traverse the linked list to find the key
        while (head != null) {
            if (head.key == key) {
                if (prev == null) {
                    buckets[index] = head.next; // Remove from beginning
                } else {
                    prev.next = head.next; // Remove from middle/end
                }
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap(10);

        // Test put operation
        map.put(1, 10);
        map.put(2, 20);
        map.put(11, 110); // Should collide with key 1

        // Test get operation
        System.out.println("Value for key 1: " + map.get(1));
        System.out.println("Value for key 11: " + map.get(11));
        System.out.println("Value for key 3: " + map.get(3)); // Key not present

        // Test update operation
        map.put(2, 25);
        System.out.println("Updated value for key 2: " + map.get(2));

        // Test remove operation
        map.remove(1);
        System.out.println("Value for key 1 after removal: " + map.get(1));
    }
}

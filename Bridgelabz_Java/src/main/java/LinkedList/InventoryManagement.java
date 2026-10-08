/*

Design an inventory management system using a singly linked list where each node stores information about an item such as Item Name, Item ID, Quantity, and Price. Implement the following functionalities:
Add an item at the beginning, end, or at a specific position.
Remove an item based on Item ID.
Update the quantity of an item by Item ID.
Search for an item based on Item ID or Item Name.
Calculate and display the total value of inventory (Sum of Price * Quantity for each item).
Sort the inventory based on Item Name or Price in ascending or descending order.
Hint:
Use a singly linked list where each node represents an item in the inventory.
Implement sorting using an appropriate algorithm (e.g., merge sort) on the linked list.
For total value calculation, traverse through the list and sum up Quantity * Price for each item.
Name : Utakarsh Jain
Date : 6/10/2026
*/


package main.java.LinkedList;
public class InventoryManagement {
    // Node represents one inventory item
    static class Node {
        String itemName;
        int itemId;
        int quantity;
        double price;
        Node next;
        // Constructor to initialize item details
        Node(String itemName, int itemId, int quantity, double price) {
            this.itemName = itemName;
            this.itemId = itemId;
            this.quantity = quantity;
            this.price = price;
        }
    }
    // Head points to the first node of the linked list
    Node head;
    // Add a new item at the beginning
    void addAtBeginning(String name, int id, int quantity, double price) {
        Node newNode = new Node(name, id, quantity, price);
        // New node points to current head
        newNode.next = head;
        // New node becomes the new head
        head = newNode;
    }
    // Add a new item at the end
    void addAtEnd(String name, int id, int quantity, double price) {
        Node newNode = new Node(name, id, quantity, price);
        // If list is empty, new node becomes head
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        // Traverse until the last node
        while (current.next != null) {
            current = current.next;
        }
        // Connect last node to the new node
        current.next = newNode;
    }
    // Add a new item at a specific position
    void addAtPosition(String name, int id, int quantity, double price, int position) {

        // Position 1 means insert at beginning
        if (position <= 1) {
            addAtBeginning(name, id, quantity, price);
            return;
        }
        Node current = head;
        // Move to the node just before the required position
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        // Position is outside the list
        if (current == null) {
            System.out.println("Invalid position");
            return;
        }
        Node newNode = new Node(name, id, quantity, price);
        // Connect new node with the next node
        newNode.next = current.next;
        // Connect previous node with the new node
        current.next = newNode;
    }
    // Remove an item using Item ID
    void removeItem(int id) {
        // Check if the list is empty
        if (head == null) {
            return;
        }
        // If the first node contains the required ID
        if (head.itemId == id) {
            head = head.next;
            return;
        }
        Node current = head;
        // Search for the node before the item to be deleted
        while (current.next != null) {
            if (current.next.itemId == id) {
                // Skip the node that needs to be deleted
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
        System.out.println("Item not found");
    }
    // Update quantity using Item ID
    void updateQuantity(int id, int quantity) {
        Node current = head;
        // Traverse the list to find the item
        while (current != null) {
            if (current.itemId == id) {
                current.quantity = quantity;
                System.out.println("Quantity updated");
                return;
            }
            current = current.next;
        }
        System.out.println("Item not found");
    }
    // Search for an item using Item ID
    void searchById(int id) {
        Node current = head;
        while (current != null) {
            if (current.itemId == id) {
                displayItem(current);
                return;
            }
            current = current.next;
        }
        System.out.println("Item not found");
    }
    // Search for an item using Item Name
    void searchByName(String name) {
        Node current = head;
        while (current != null) {
            // equalsIgnoreCase ignores upper/lower case difference
            if (current.itemName.equalsIgnoreCase(name)) {
                displayItem(current);
            }
            current = current.next;
        }
    }
    // Calculate total inventory value
    // Formula: Price * Quantity for every item
    double calculateTotalValue() {
        double total = 0;
        Node current = head;
        // Traverse the complete list
        while (current != null) {
            total += current.price * current.quantity;
            current = current.next;
        }
        return total;
    }
    // Sort inventory by Item Name in ascending order
    void sortByNameAscending() {
        if (head == null) {
            return;
        }
        Node current = head;
        // Compare current node with all following nodes
        while (current != null) {
            Node next = current.next;
            while (next != null) {
                // compareToIgnoreCase returns positive
                // when current name comes after next name
                if (current.itemName.compareToIgnoreCase(next.itemName) > 0) {
                    swapData(current, next);
                }
                next = next.next;
            }
            current = current.next;
        }
    }
    // Sort inventory by Price in ascending order
    void sortByPriceAscending() {
        if (head == null) {
            return;
        }
        Node current = head;
        while (current != null) {
            Node next = current.next;
            while (next != null) {
                // Smaller price should come first
                if (current.price > next.price) {
                    swapData(current, next);
                }
                next = next.next;
            }
            current = current.next;
        }
    }
    // Sort inventory by Price in descending order
    void sortByPriceDescending() {
        if (head == null) {
            return;
        }
        Node current = head;
        while (current != null) {
            Node next = current.next;
            while (next != null) {
                // Larger price should come first
                if (current.price < next.price) {
                    swapData(current, next);
                }
                next = next.next;
            }
            current = current.next;
        }
    }
    // Swap the data of two nodes
    // The node connections are not changed
    void swapData(Node first, Node second) {
        String name = first.itemName;
        first.itemName = second.itemName;
        second.itemName = name;
        int id = first.itemId;
        first.itemId = second.itemId;
        second.itemId = id;
        int quantity = first.quantity;
        first.quantity = second.quantity;
        second.quantity = quantity;
        double price = first.price;
        first.price = second.price;
        second.price = price;
    }
    // Display details of one item
    void displayItem(Node item) {
        System.out.println("Item ID: " + item.itemId + ", Name: " + item.itemName + ", Quantity: " + item.quantity + ", Price: " + item.price);
    }
    // Display all items in the linked list
    void display() {
        Node current = head;
        // Traverse from head until null
        while (current != null) {
            displayItem(current);
            current = current.next;
        }
    }

    public static void main(String[] args) {

        // Create InventoryManagement object
        InventoryManagement inventory = new InventoryManagement();

        // Add items at different positions
        inventory.addAtEnd("Laptop", 101, 5, 50000);
        inventory.addAtEnd("Mouse", 102, 20, 500);
        inventory.addAtBeginning("Keyboard", 103, 10, 1200);
        inventory.addAtPosition("Monitor", 104, 8, 15000, 2);

        // Display all inventory items
        System.out.println("Inventory:");
        inventory.display();

        // Calculate and display total inventory value
        System.out.println("\nTotal Inventory Value:");
        System.out.println(inventory.calculateTotalValue());

        // Search item by ID
        System.out.println("\nSearch by ID:");
        inventory.searchById(102);

        // Update quantity
        System.out.println("\nUpdating Quantity:");
        inventory.updateQuantity(102, 30);

        // Sort items alphabetically by name
        System.out.println("\nSort by Name:");
        inventory.sortByNameAscending();
        inventory.display();

        // Sort items by price from high to low
        System.out.println("\nSort by Price Descending:");
        inventory.sortByPriceDescending();
        inventory.display();
    }
}



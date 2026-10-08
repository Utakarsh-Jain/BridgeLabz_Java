package main.java.LinkedList;
/*
Library Management System
Problem Statement: Design a library management system using a doubly linked list. Each node represents a book and contains the following attributes: Book Title, Author, Genre, Book ID, and Availability Status. Implement the following functionalities:
Add a new book at the beginning, end, or at a specific position.
Remove a book by Book ID.
Search for a book by Book Title or Author.
Update a book’s Availability Status.
Display all books in forward and reverse order.
Count the total number of books in the library.
Hint:
Use a doubly linked list with two pointers (next and prev) in each node to facilitate traversal in both directions.
Ensure that when removing a book, both the next and prev pointers are correctly updated.
Displaying in reverse order will require traversal from the last node using prev pointers.
*/

public class LibraryManagement {
    static class Node { // Represents a book in the library
        String title;
        String author;
        String genre;
        int bookId;
        boolean available;
        Node prev;
        Node next;
        Node(String title, String author, String genre, int bookId, boolean available) { // Constructor to initialize a book
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.bookId = bookId;
            this.available = available;
        }
    }
    Node head;
    Node tail;
    void addAtBeginning(String title, String author, String genre, int id, boolean available) { // Method to add a book at the beginning of the list
        Node newNode = new Node(title, author, genre, id, available);
        if (head == null) { // If the list is empty
            head = tail = newNode;
            return;
        }
        newNode.next = head; // Link the new node to the current head
        head.prev = newNode; // Link the current head to the new node
        head = newNode; // Update the head to the new node
    }
    void addAtEnd(String title, String author, String genre, int id, boolean available) { // Method to add a book at the end of the list
        Node newNode = new Node(title, author, genre, id, available);
        if (head == null) { // If the list is empty
            head = tail = newNode;
            return;
        }
        tail.next = newNode; // Link the current tail to the new node
        newNode.prev = tail; // Link the new node to the current tail
        tail = newNode;
    }

    void addAtPosition(String title, String author, String genre, int id, boolean available, int position) { // Method to add a book at a specific position
        if (position <= 1) { // If the position is 1 or less, add the book at the beginning
            addAtBeginning(title, author, genre, id, available);
            return;
        }
        Node current = head; // Start from the head of the list
        for (int i = 1; i < position - 1 && current != null; i++) { // Traverse to the position before the desired position
            current = current.next;
        }
        if (current == null) { // If the position is out of bounds
            System.out.println("Invalid position");
            return;
        }
        if (current == tail) { // If the current node is the tail, add the book at the end
            addAtEnd(title, author, genre, id, available);
            return;
        }
        Node newNode = new Node(title, author, genre, id, available); // Create a new node
        newNode.next = current.next; // Link the new node to the next node of the current node
        newNode.prev = current; // Link the new node to the current node
        current.next.prev = newNode; // Link the next node of the current node to the new node
        current.next = newNode; // Link the current node to the new node
    }

    void removeBook(int id) { // Method to remove a book from the list based on its ID
        Node current = head; // Start from the head of the list
        while (current != null) { // Traverse through the list to find the book
            if (current.bookId == id) { // If the book is found
                if (current == head) { // If the book is the head
                    head = current.next;
                }

                if (current == tail) { // If the book is the tail
                    tail = current.prev;
                }

                if (current.prev != null) {
                    current.prev.next = current.next;
                }
                if (current.next != null) { // If the book is not the tail
                    current.next.prev = current.prev;
                }
                System.out.println("Book removed");
                return;
            }

            current = current.next;
        }

        System.out.println("Book not found");
    }

    void searchByTitle(String title) { // Method to search for a book by its title
        Node current = head; // Start from the head of the list

        while (current != null) { // Traverse through the list to find the book
            if (current.title.equalsIgnoreCase(title)) { // If the book is found
                displayBook(current); // Display the book
            }

            current = current.next;
        }
    }

    void searchByAuthor(String author) { // Method to search for a book by its author
        Node current = head; // Start from the head of the list

        while (current != null) { // Traverse through the list to find the book
            if (current.author.equalsIgnoreCase(author)) { // If the book is found
                displayBook(current); // Display the book
            }

            current = current.next;
        }
    }

    void updateAvailability(int id, boolean status) { // Method to update the availability of a book based on its ID
        Node current = head; // Start from the head of the list
        while (current != null) { // Traverse through the list to find the book
            if (current.bookId == id) { // If the book is found
                current.available = status; // Update the availability
                System.out.println("Availability updated");
                return;
            }

            current = current.next;
        }

        System.out.println("Book not found");
    }

    void displayBook(Node book) { // Method to display the book details
        System.out.println("Book ID: " + book.bookId + ", Title: " + book.title + ", Author: " + book.author + ", Genre: " + book.genre + ", Available: " + book.available);
    }

    void displayForward() { // Method to display the book details in forward order
        Node current = head;

        while (current != null) {
            displayBook(current);
            current = current.next;
        }
    }

    void displayReverse() { // Method to display the book details in reverse order
        Node current = tail; // Start from the tail of the list
        while (current != null) { // Traverse through the list to display the book details
            displayBook(current); // Display the book
            current = current.prev; // Move to the previous node
        }
    }

    int countBooks() { // Method to count the number of books in the list
        int count = 0; // Initialize the count
        Node current = head; // Start from the head of the list

        while (current != null) { // Traverse through the list to count the number of books
            count++; // Increment the count
            current = current.next; // Move to the next node
        }

        return count;
    }

    public static void main(String[] args) { // Main method to test the library management system
        LibraryManagement library = new LibraryManagement();

        library.addAtBeginning("Java Programming", "James Gosling", "Programming", 101, true);
        library.addAtEnd("Clean Code", "Robert Martin", "Programming", 102, true);
        library.addAtEnd("The Alchemist", "Paulo Coelho", "Fiction", 103, false);
        library.addAtPosition("Data Structures", "Mark Allen", "Computer Science", 104, true, 2);

        System.out.println("Forward Display:");
        library.displayForward();

        System.out.println("\nReverse Display:");
        library.displayReverse();

        System.out.println("\nSearch by Author:");
        library.searchByAuthor("Robert Martin");

        System.out.println("\nUpdate Availability:");
        library.updateAvailability(103, true);

        System.out.println("\nTotal Books: " + library.countBooks());

        System.out.println("\nRemoving Book:");
        library.removeBook(102);

        library.displayForward();
    }
}


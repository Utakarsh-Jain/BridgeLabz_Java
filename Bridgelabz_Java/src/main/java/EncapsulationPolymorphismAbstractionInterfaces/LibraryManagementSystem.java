/*

Library Management System
Description: Develop a library management system:
Use an abstract class LibraryItem with fields like itemId, title, and author.
Add an abstract method getLoanDuration() and a concrete method getItemDetails().
Create subclasses Book, Magazine, and DVD, overriding getLoanDuration() with specific logic.
Implement an interface Reservable with methods reserveItem() and checkAvailability().
Apply encapsulation to secure details like the borrower’s personal data.
Use polymorphism to allow a general LibraryItem reference to manage all items, regardless of type.
Name : Utakarsh Jain
Date: 3/10/2026

*/

package main.java.EncapsulationPolymorphismAbstractionInterfaces;
import java.util.ArrayList;

// Interface defines reservation behavior
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

// Abstract class provides common library item properties
abstract class LibraryItem {
    // Private fields provide encapsulation
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) { 
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    public int getItemId() { //getter method for itemId
        return itemId;
    }

    public String getTitle() { //getter method for title
        return title;
    }

    public String getAuthor() { //getter method for author
        return author;
    }

    // Loan duration differs for different library items
    public abstract int getLoanDuration();

    public void getItemDetails() { //Method to display library item details
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
    }
}

class Book extends LibraryItem implements Reservable {
    private boolean available = true; //Flag to check if the book is available
    private String borrowerName; //Variable to store the name of the borrower

    public Book(int itemId, String title, String author) { //Parameterized constructor for Book class
        super(itemId, title, author); //call to the parent class constructor
    }

    @Override
    public int getLoanDuration() { //Method to get the loan duration
        return 21;
    }

    @Override
    public void reserveItem(String borrowerName) { //Method to reserve the book
        if (available) { //Check if the book is available
            this.borrowerName = borrowerName; //Assign the borrower name
            available = false; //Set the availability to false
            System.out.println("Book reserved by " + borrowerName); //Print the reservation message
        } else {
            System.out.println("Book is not available."); //Print the not available message
        }
    }

    @Override
    public boolean checkAvailability() { //Method to check if the book is available
        return available;
    }
}

class Magazine extends LibraryItem implements Reservable { //Magazine class
    private boolean available = true; //Flag to check if the magazine is available
    private String borrowerName; //Variable to store the name of the borrower

    public Magazine(int itemId, String title, String author) { //Parameterized constructor for Magazine class
        super(itemId, title, author); //call to the parent class constructor
    }

    @Override
    public int getLoanDuration() { //Method to get the loan duration
        return 7;
    }

    @Override
    public void reserveItem(String borrowerName) { //Method to reserve the magazine
        if (available) {
            this.borrowerName = borrowerName;
            available = false;
            System.out.println("Magazine reserved by " + borrowerName);
        } else {
            System.out.println("Magazine is not available.");
        }
    }

    @Override
    public boolean checkAvailability() { //Method to check if the magazine is available
        return available;
    }
}

class DVD extends LibraryItem implements Reservable { //DVD class
    private boolean available = true; //Flag to check if the DVD is available
    private String borrowerName; //Variable to store the name of the borrower

    public DVD(int itemId, String title, String author) { //Parameterized constructor for DVD class
        super(itemId, title, author); //call to the parent class constructor
    }

    @Override
    public int getLoanDuration() { //Method to get the loan duration
        return 3;
    }

    @Override
    public void reserveItem(String borrowerName) { //Method to reserve the DVD
        if (available) {
            this.borrowerName = borrowerName;
            available = false;
            System.out.println("DVD reserved by " + borrowerName);
        } else {
            System.out.println("DVD is not available.");
        }
    }

    @Override
    public boolean checkAvailability() { //Method to check if the DVD is available
        return available;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Parent reference manages different item types
        ArrayList<LibraryItem> items = new ArrayList<>();
        items.add(new Book(101, "Java Programming", "James Gosling"));
        items.add(new Magazine(102, "Tech Today", "John Smith"));
        items.add(new DVD(103, "Java Tutorial", "Programming Academy"));

        for (LibraryItem item : items) {
            item.getItemDetails();

            // Interface reference accesses reservation behavior
            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                System.out.println("Available: " + reservableItem.checkAvailability());
                reservableItem.reserveItem("Rahul");
            }
            System.out.println();
        }
    }
}

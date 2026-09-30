/*

Problem 5 : Java Constructor Level 1
Library Book System: Create a Book class with attributes title, author, price, and availability. Implement a method to borrow a book.
Name: Utakarsh Jain
Date: 30/09/2026

*/

class Book {
    String title;
    String author;
    double price;
    boolean availability;
    Book(String bookTitle, String bookAuthor, double bookPrice, boolean bookAvailability) { // Parameterized Constructor
        title = bookTitle;
        author = bookAuthor;
        price = bookPrice;
        availability = bookAvailability;
    }
    void borrowBook() { // Method to borrow a book
        if (availability) { //Checking if the book is available or not for borrowing 
            availability = false;  //Updating the availability of the book to false as it will get borrowed
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    void displayDetails() { //displaying the details of the book
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + availability);
    }

    public static void main(String args[]) {
        Book book = new Book("The Great Gatsby","F. Scott Fitzgerald",10.99,true);
        book.displayDetails();
        System.out.println("\nBorrowing Book:");
        book.borrowBook();
        System.out.println("\nAfter Borrowing:");
        book.displayDetails();
    }
}
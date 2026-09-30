/*
Problem 1 : Java Constructor Level 1

Create a Book class with attributes title, author, and price. Provide both default and parameterized constructors.
Name: Utakarsh Jain
Date: 30/09/2026
*/

class Book {
    String title;
    String author;
    double price;
    Book() { // Default Constructor
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0;
    }
    Book(String title, String author, double price) { // Parameterized Constructor
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void display() { // Method to display the book details
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
    public static void main(String args[]) { // Main method
        Book book1 = new Book();
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        book1.display();
        book2.display();
    }
}

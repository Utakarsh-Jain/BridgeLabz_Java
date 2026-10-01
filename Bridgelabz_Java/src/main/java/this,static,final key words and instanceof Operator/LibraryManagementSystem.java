/*

Sample Program 2: Library Management System
Create a Book class to manage library books with the following features:
Static:
A static variable libraryName shared across all books.
A static method displayLibraryName() to print the library name.
This:
Use this to initialize title, author, and isbn in the constructor.
Final:
Use a final variable isbn to ensure the unique identifier of a book cannot be changed.
Instanceof:
Verify if an object is an instance of the Book class before displaying its details.
Name : Utakarsh Jain
Date : 30/09/2026
*/

import java.util.Scanner;

class Book {
    static String libraryName = "Central Library";
    static int totalBooks = 0;
    String title;
    String author;
    final String isbn;
    double price;
    Book(String title, String author, String isbn, double price) { //Parameterized Constructor
        this.title = title; //Using 'this' keyword to resolve ambiguity
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        totalBooks++;
    }
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName); //Displaying the library name
    }
    void displayDetails() {
        System.out.println("Title: " + title); //Displaying the title
        System.out.println("Author: " + author); //Displaying the author
        System.out.println("ISBN: " + isbn); //Displaying the ISBN
        System.out.println("Price: " + price); //Displaying the price
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book Details: ");
        System.out.print("Enter Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Author: ");
        String author = sc.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        Book book1 = new Book(title, author, isbn, price);
        if (book1 instanceof Book) {
            book1.displayDetails();
        }
        System.out.println();
        Book.displayLibraryName();
        System.out.println("Total Books: " + totalBooks);
        sc.close();
    }
}
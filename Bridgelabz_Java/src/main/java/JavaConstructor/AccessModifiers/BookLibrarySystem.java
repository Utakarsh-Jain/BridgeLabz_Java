/*

Problem 2: Book Library System
Design a Book class with:
ISBN (public).
title (protected).
author (private).
Write methods to:
Set and get the author name.
Create a subclass EBook to access ISBN and title and demonstrate access modifiers.
Name : Utakarsh Jain
Date : 30/09/2026
*/


package main.java.JavaConstructor.AccessModifiers;
import java.util.Scanner;
class Book {
    public String isbn; //public member
    protected String title; //protected member
    private String author; //private member
    Book(String isbn, String title, String author) { //parameterized constructor
        //this is used to refer to the current object
        this.isbn = isbn; 
        this.title = title; 
        this.author = author; 
    }
    public String getAuthor() { //public method to get the author name
        return author; //returns the author name
    }
    public void setAuthor(String author) { //public method to set the author name
        this.author = author; //sets the author name
    }
}
class EBook extends Book { //subclass of Book
    EBook(String isbn, String title, String author) { //parameterized constructor
        super(isbn, title, author); //calls the constructor of the superclass
    }
}
public class BookLibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ISBN: ");
        String isbn = sc.next();
        System.out.println("Enter the title: ");
        String title = sc.next();
        System.out.println("Enter the author: ");
        String author = sc.next();
        Book book = new Book(isbn, title, author); //creating an object of Book class
        System.out.println("ISBN: " + book.isbn); //printing the ISBN
        System.out.println("Title: " + book.title); //printing the title
        System.out.println("Author: " + book.getAuthor()); //printing the author
        book.setAuthor("Utakarsh"); //setting the author name
        System.out.println("Author: " + book.getAuthor()); //printing the author name
        EBook eBook = new EBook(isbn, title, author); //creating an object of EBook class
        System.out.println("ISBN: " + eBook.isbn); //printing the ISBN
        System.out.println("Title: " + eBook.title); //printing the title
        System.out.println("Author: " + eBook.getAuthor()); //printing the author
        eBook.setAuthor("Utakarsh"); //setting the author name
        System.out.println("Author: " + eBook.getAuthor()); //printing the author name
        sc.close();
    }
}

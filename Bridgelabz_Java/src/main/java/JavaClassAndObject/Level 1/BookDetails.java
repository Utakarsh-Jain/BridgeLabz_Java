/*
Problem 3 : Java Class And Object Level 1
Program to Handle Book Details
Problem Statement: Write a program to create a Book class with attributes title, author, and price. Add a method to display the book details
Name: Utakarsh Jain
Date : 29/09/2026
*/

import java.util.Scanner;
class Book {
    String title; //attribute
    String author; //attribute
    double price; //attribute

    void displayDetails() { //Method to print out the attributes of the class Book
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: " + price);
    }
}
public class BookDetails {
    public static void main(String args[]) { //Main method to test the class
        Scanner sc = new Scanner(System.in);
        Book book = new Book(); //Create an object of class book
        System.out.print("Enter the title of the book: ");
        book.title = sc.nextLine();
        System.out.print("Enter the author of the book: ");
        book.author = sc.nextLine();
        System.out.print("Enter the price of the book: ");
        book.price = sc.nextDouble(); 
        book.displayDetails(); //Calling the display method
        sc.close();
    }
}
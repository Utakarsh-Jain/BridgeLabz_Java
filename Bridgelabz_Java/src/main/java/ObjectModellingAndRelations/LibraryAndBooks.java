/*
Problem 1 : Object Modelling and Relations
Library and Books (Aggregation)
Description: Create a Library class that contains multiple Book objects. Model the relationship such that a library can have many books, but a book can exist independently (outside of a specific library).
Tasks:
Define a Library class with an ArrayList of Book objects.
Define a Book class with attributes such as title and author.
Demonstrate the aggregation relationship by creating books and adding them to different libraries.
Goal: Understand aggregation by modeling a real-world relationship where the Library aggregates Book objects.
Name : Utakarsh Jain
Date : 1/10/2026
 */
import java.util.*;

class Book //Class Book to store & display the details of the books
{
    String title;
    String author;
    Book(String title, String author) //Parameterized Constructor
    {
        this.title = title;
        this.author = author;
    }
    void display() //Method to dsiplay the details of the book
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
class Library
{
    String libraryName;
    ArrayList<Book> books; //Array List to store the title & the author name of the book
    Library(String libraryName)
    {
        this.libraryName = libraryName;
        books = new ArrayList<>();
    }
    void addBook(Book book) //adding the book into the list
    {
        books.add(book);
    }
    void displayBooks() //displaying the book
    {
        System.out.println("Library Name: " + libraryName);
        for(Book book : books) //using for loop to iterate through the books & print out the details
        {
            book.display();
        }
        System.out.println();
    }
}
public class LibraryAndBooks
{
    public static void main(String[] args)
    {
        Book book1 = new Book("The Alchemist", "Paulo Coelho");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Library library1 = new Library("Central Library");
        Library library2 = new Library("City Library");
        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book3);
        library2.addBook(book1);
        library1.displayBooks();
        library2.displayBooks();
        System.out.println("Book can exist independently:");
        book1.display();
    }
}
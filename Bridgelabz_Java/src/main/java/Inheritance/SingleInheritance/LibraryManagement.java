/*

Sample Problem 1: Library Management with Books and Authors
Description: Model a Book system where Book is the superclass, and Author is a subclass.
Tasks:
Define a superclass Book with attributes like title and publicationYear.
Define a subclass Author with additional attributes like name and bio.
Create a method displayInfo() to show details of the book and its author.
Goal: Practice single inheritance by extending the base class and adding more specific details in the subclass.
Name : Utakarsh Jain
Date : 3/10/2026
*/

package main.java.Inheritance.SingleInheritance;
class Book{ //Parent Constructor 
    String title;
    int publicationYear;
    Book(String title, int publicationYear){ //Parameterized Constructor to initialize parent class variables
        this.title=title;
        this.publicationYear=publicationYear;
    } 
    void displayBookInfo(){ //Method to display book information
        System.out.println("Title: "+title);
        System.out.println("Publication Year: "+publicationYear);
    }
}

class Author extends Book{ //Class Author extends the class Book
    String name;
    String bio;
    Author(String title, int publicationYear, String name, String bio){ //Parameterized Constructor to initialize child class variables
        super(title,publicationYear); //Calls the parameterized constructor of the parent class
        this.name=name;
        this.bio=bio;
    }
    void displayAuthorInfo(){ //Method to display author information
        System.out.println("Author Name: "+name);
        System.out.println("Author Bio: "+bio);
    }
}
public class LibraryManagement { //Main method to demonstrate single inheritance
    public static void main(String[] args){
        Author author=new Author("The Great Gatsby",1925,"F. Scott Fitzgerald","An American novelist known for his novels set in the Jazz Age."); //Initializing an object of class author
        author.displayBookInfo(); 
        author.displayAuthorInfo();
    }
}

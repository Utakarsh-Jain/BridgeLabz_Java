/*

Doubly Linked List: Movie Management System
Problem Statement: Implement a movie management system using a doubly linked list. Each node will represent a movie and contain Movie Title, Director, Year of Release, and Rating. Implement the following functionalities:
Add a movie record at the beginning, end, or at a specific position.
Remove a movie record by Movie Title.
Search for a movie record by Director or Rating.
Display all movie records in both forward and reverse order.
Update a movie's Rating based on the Movie Title.
Hint:
Use a doubly linked list where each node has two pointers: one pointing to the next node and the other to the previous node.
Maintain pointers to both the head and tail for easier insertion and deletion at both ends.
For reverse display, start from the tail and traverse backward using the prev pointers.

Name : Utakarsh Jain
Date : 6/10/2026


*/
package main.java.LinkedList;
class Movie {
    String title;
    String director;
    int year;
    double rating;
    Movie next;
    Movie prev;
    public Movie(String title, String director, int year, double rating) { // Constructor to initialize a movie record
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}
public class MovieManagementSystem { // Class to manage movie records
    private Movie head;
    private Movie tail;
    public void addMovieAtBeginning(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        newMovie.next = head;
        if (head != null) {
            head.prev = newMovie;
        }
        head = newMovie;
        if (tail == null) {
            tail = newMovie;
        }
        System.out.println("Movie added at the beginning.");
    }
    public void addMovieAtEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (tail == null) {
            head = newMovie;
            tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
        System.out.println("Movie added at the end.");
    }
    public void addMovieAtSpecificPosition(int position, String title, String director, int year, double rating) {
        if (position == 1) {
            addMovieAtBeginning(title, director, year, rating);
            return;
        }
        Movie newMovie = new Movie(title, director, year, rating);
        Movie temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position is out of bounds.");
            return;
        }
        newMovie.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newMovie;
        } else {
            tail = newMovie;
        }
        temp.next = newMovie;
        newMovie.prev = temp;
        System.out.println("Movie added at the specific position.");
    }
    public void removeMovieByTitle(String title) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.title.equals(title)) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            System.out.println("Movie with title " + title + " deleted.");
            return;
        }
        Movie temp = head;
        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Movie with title " + title + " not found.");
            return;
        }
        if (temp == tail) {
            tail = temp.prev;
            tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        System.out.println("Movie with title " + title + " deleted.");
    }
    public void searchByDirector(String director) {
        Movie temp = head;
        boolean found = false;
        System.out.println("Movies by director " + director + ":");
        while (temp != null) {
            if (temp.director.equals(director)) {
                System.out.println("Title: " + temp.title + ", Year: " + temp.year + ", Rating: " + temp.rating);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No movies found by director " + director);
        }
    }
    public void searchByRating(double rating) {
        Movie temp = head;
        boolean found = false;
        System.out.println("Movies with rating " + rating + ":");
        while (temp != null) {
            if (temp.rating == rating) {
                System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.year);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No movies found with rating " + rating);
        }
    }
    public void displayAllMoviesForward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Movie temp = head;
        System.out.println("Movie records (Forward):");
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.year + ", Rating: " + temp.rating);
            temp = temp.next;
        }
    }
    public void displayAllMoviesBackward() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }
        Movie temp = tail;
        System.out.println("Movie records (Backward):");
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.year + ", Rating: " + temp.rating);
            temp = temp.prev;
        }
    }
    public void updateRating(String title, double rating) {
        Movie movie = head;
        while (movie != null) {
            if (movie.title.equals(title)) {
                movie.rating = rating;
                System.out.println("Rating updated for movie " + title);
                return;
            }
            movie = movie.next;
        }
        System.out.println("Movie with title " + title + " not found.");
    }
    public static void main(String[] args) {
        MovieManagementSystem movieManagementSystem = new MovieManagementSystem();
        movieManagementSystem.addMovieAtEnd("The Shawshank Redemption", "Frank Darabont", 1994, 9.3);
        movieManagementSystem.addMovieAtEnd("The Godfather", "Francis Ford Coppola", 1972, 9.2);
        movieManagementSystem.addMovieAtEnd("The Dark Knight", "Christopher Nolan", 2008, 9.0);
        movieManagementSystem.addMovieAtEnd("The Lord of the Rings: The Return of the King", "Peter Jackson", 2003, 8.9);
        movieManagementSystem.addMovieAtEnd("Pulp Fiction", "Quentin Tarantino", 1994, 8.9);
        movieManagementSystem.displayAllMoviesForward();
        movieManagementSystem.searchByDirector("Christopher Nolan");
        movieManagementSystem.searchByRating(9.2);
        movieManagementSystem.updateRating("The Shawshank Redemption", 9.4);
        movieManagementSystem.removeMovieByTitle("The Godfather");
        movieManagementSystem.displayAllMoviesBackward();
    }
}

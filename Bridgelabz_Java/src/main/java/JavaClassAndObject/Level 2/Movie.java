/*
Problem 4 : Java Class And Object Level 2
Program to Model a Movie Ticket Booking System
Problem Statement: Create a MovieTicket class with attributes movieName, seatNumber, and price. Add methods to:
Book a ticket (assign seat and update price).
Display ticket details.
Explanation: The MovieTicket class organizes ticket information with attributes. The methods handle booking logic and display ticket details.
Name: Utakarsh Jain
Date: 29/09/2026

*/

import java.util.Scanner;

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    void bookTicket(String movieName, int seatNumber) {
        this.movieName = movieName; 
        this.seatNumber = seatNumber;
        this.price = price;
    }
    void displayTicket() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
    public static void main(String args[]) {
        MovieTicket m = new MovieTicket();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the movie name: ");
        m.movieName = sc.nextLine();
        System.out.print("Enter the seat number: ");
        m.seatNumber = sc.nextInt();
        System.out.print("Enter the price: ");
        m.price = sc.nextDouble(); 
        m.displayTicket();
        sc.close();
    }
}
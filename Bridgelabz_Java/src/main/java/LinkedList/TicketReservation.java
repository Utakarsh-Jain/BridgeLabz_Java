/*
Online Ticket Reservation System
Problem Statement: Design an online ticket reservation system using a circular linked list, where each node represents a booked ticket. Each node will store the following information: Ticket ID, Customer Name, Movie Name, Seat Number, and Booking Time. Implement the following functionalities:
Add a new ticket reservation at the end of the circular list.
Remove a ticket by Ticket ID.
Display the current tickets in the list.
Search for a ticket by Customer Name or Movie Name.
Calculate the total number of booked tickets.

Hint:
Use a circular linked list to represent the ticket reservations, with the last node’s next pointer pointing to the first node.
When removing a ticket, update the circular pointers accordingly.
For displaying all tickets, traverse the list starting from the first node, looping back after reaching the last node.
Name : Utakarsh Jain
Date : 6/10/2026
*/
package main.java.LinkedList;
public class TicketReservation {
    // Node stores information about one ticket
    static class Node {
        int ticketId;
        String customerName;
        String movieName;
        Node next;
        Node(int ticketId, String customerName, String movieName) {
            this.ticketId = ticketId;
            this.customerName = customerName;
            this.movieName = movieName;
        }
    }
    // Head points to the first ticket
    Node head;
    // Tail points to the last ticket
    Node tail;
    // Add a new ticket to the circular linked list
    void addTicket(int ticketId, String customerName, String movieName) {
        Node newNode = new Node(ticketId, customerName, movieName);
        // If list is empty, new node becomes both head and tail
        if (head == null) {
            head = newNode;
            tail = newNode;
            // Last node points back to head
            tail.next = head;
            return;
        }
        // Add new node after tail
        tail.next = newNode;
        tail = newNode;
        // Maintain circular connection
        tail.next = head;
    }
    // Remove a ticket using Ticket ID
    void removeTicket(int ticketId) {
        // Check if the list is empty
        if (head == null) {
            System.out.println("No tickets available");
            return;
        }
        Node current = head;
        Node previous = tail;
        // Traverse circular list until ticket is found
        do {
            if (current.ticketId == ticketId) {
                // If there is only one ticket
                if (current == head && current == tail) {
                    head = null;
                    tail = null;
                    System.out.println("Ticket removed");
                    return;
                }
                // If removing the first ticket
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                    System.out.println("Ticket removed");
                    return;
                }
                // Remove the current node
                previous.next = current.next;
                // If removing the last ticket
                if (current == tail) {
                    tail = previous;
                    tail.next = head;
                }
                System.out.println("Ticket removed");
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);
        System.out.println("Ticket not found");
    }
    // Display all reserved tickets
    void displayTickets() {

        if (head == null) {
            System.out.println("No tickets reserved");
            return;
        }
        Node current = head;
        System.out.println("Reserved Tickets:");
        // Since the list is circular, stop when we reach head again
        do {
            System.out.println("Ticket ID: " + current.ticketId +", Customer: " + current.customerName + ", Movie: " + current.movieName);
            current = current.next;
        } while (current != head);
    }
    // Search ticket using customer name
    void searchByCustomer(String customerName) {
        if (head == null) {
            System.out.println("No tickets available");
            return;
        }

        Node current = head;
        boolean found = false;

        // Traverse the circular list
        do {

            if (current.customerName.equalsIgnoreCase(customerName)) {
                displayTicket(current);
                found = true;
            }

            current = current.next;

        } while (current != head);

        if (!found) {
            System.out.println("Customer not found");
        }
    }

    // Search ticket using movie name
    void searchByMovie(String movieName) {

        if (head == null) {
            System.out.println("No tickets available");
            return;
        }

        Node current = head;
        boolean found = false;

        // Traverse the complete circular list
        do {

            if (current.movieName.equalsIgnoreCase(movieName)) {
                displayTicket(current);
                found = true;
            }

            current = current.next;

        } while (current != head);

        if (!found) {
            System.out.println("Movie not found");
        }
    }

    // Count total number of reserved tickets
    void countTickets() {

        if (head == null) {
            System.out.println("Total Tickets: 0");
            return;
        }

        int count = 0;
        Node current = head;

        // Count nodes until we reach head again
        do {
            count++;
            current = current.next;

        } while (current != head);

        System.out.println("Total Tickets: " + count);
    }

    // Display details of one ticket
    void displayTicket(Node ticket) {
        System.out.println(
                "Ticket ID: " + ticket.ticketId +
                ", Customer: " + ticket.customerName +
                ", Movie: " + ticket.movieName
        );
    }

    public static void main(String[] args) {

        TicketReservation reservation = new TicketReservation();

        // Add tickets
        reservation.addTicket(101, "Rahul", "Avengers");
        reservation.addTicket(102, "Aman", "Inception");
        reservation.addTicket(103, "Riya", "Avengers");
        reservation.addTicket(104, "Neha", "Interstellar");

        // Display all tickets
        System.out.println();
        reservation.displayTickets();

        // Search tickets by customer
        System.out.println();
        reservation.searchByCustomer("Riya");

        // Search tickets by movie
        System.out.println();
        reservation.searchByMovie("Avengers");

        // Count total tickets
        System.out.println();
        reservation.countTickets();

        // Remove a ticket
        System.out.println();
        reservation.removeTicket(102);

        // Display updated ticket list
        System.out.println();
        reservation.displayTickets();
    }
}


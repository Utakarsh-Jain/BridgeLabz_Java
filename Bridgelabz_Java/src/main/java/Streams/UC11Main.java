package main.java.Streams;

/*
Ability to sort the entries in the
address book alphabetically by
Person’s name
- Use Console to sort person details by name
- Use Collection Library for Sorting
- Override toString method to finally Print Person Entry in
Concole
- Use Java Streams
Name: Utakarsh Jain
Date: 15/10/2026

*/
import java.util.*;

public class UC11Main {
    public static void main(String[] args) {
        AddressBook book = new AddressBook("Friends");

        book.addContact(new Contact(
                "Rahul", "Sharma", "Address 1",
                "Delhi", "Delhi", "110001",
                "9876501234", "r@example.com"));

        book.addContact(new Contact(
                "Aman", "Verma", "Address 2",
                "Mumbai", "Maharashtra", "400001",
                "9876500000", "a@example.com"));

        book.addContact(new Contact(
                "Utkarsh", "Jain", "Address 3",
                "Chennai", "Tamil Nadu", "600001",
                "9876543210", "u@example.com"));

        book.getContacts().stream()
                .sorted(Comparator
                        .comparing(Contact::getFirstName,
                                String.CASE_INSENSITIVE_ORDER) //Use Java Streams to print the sorted list
                        .thenComparing(Contact::getLastName,
                                String.CASE_INSENSITIVE_ORDER)) //Use Java Streams to print the sorted list
                .forEach(System.out::println); //printing the contacts
    }
}

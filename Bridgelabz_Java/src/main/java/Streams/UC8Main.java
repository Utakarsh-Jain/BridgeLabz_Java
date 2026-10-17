package main.java.Streams;

/*
Ability to search Person
in a City or State across
the multiple
AddressBook - Search Result can show multiple person in
the city or state

UC 8

- Use Java Streams

Name: Utakarsh Jain
Date: 15/10/2026
*/
import java.util.*;
import java.util.stream.*;

public class UC8Main {
    public static void main(String[] args) {
        AddressBook friends = new AddressBook("Friends");
        AddressBook family = new AddressBook("Family");

        friends.addContact(new Contact(
                "Utkarsh", "Jain", "Address 1",
                "Chennai", "Tamil Nadu", "600001",
                "9876543210", "u@example.com"));

        family.addContact(new Contact(
                "Rahul", "Sharma", "Address 2",
                "Chennai", "Tamil Nadu", "600002",
                "9876501234", "r@example.com"));

        family.addContact(new Contact(
                "Aman", "Verma", "Address 3",
                "Delhi", "Delhi", "110001",
                "9876500000", "a@example.com"));

        List<AddressBook> books = Arrays.asList(friends, family); //creating a list of address books

        // Combine contacts from all address books.
        Stream<Contact> allContacts = books.stream()
                .flatMap(book -> book.getContacts().stream()); //combining the contacts from all address books

        // Search by city.
        List<Contact> results = allContacts
                .filter(c -> c.getCity().equalsIgnoreCase("Chennai")) // filtering the contacts based on the city
                .collect(Collectors.toList());

        results.forEach(System.out::println); //printing the contacts
    }
}

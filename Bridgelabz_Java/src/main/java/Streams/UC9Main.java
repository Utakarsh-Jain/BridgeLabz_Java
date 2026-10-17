package main.java.Streams;
/*
Ability to view Persons
by City or State - Maintain Dictionary of City and Person as
well as State and Person
- Use Collection Library to maintain
Dictionary
Name: Utakarsh Jain
Date: 15/10/2026
*/
import java.util.*;
import java.util.stream.*;

public class UC9Main {
    public static void main(String[] args) {
        AddressBook book = new AddressBook("Friends");

        book.addContact(new Contact(
                "Utkarsh", "Jain", "Address 1",
                "Chennai", "Tamil Nadu", "600001",
                "9876543210", "u@example.com"));

        book.addContact(new Contact(
                "Rahul", "Sharma", "Address 2",
                "Chennai", "Tamil Nadu", "600002",
                "9876501234", "r@example.com"));

        book.addContact(new Contact(
                "Aman", "Verma", "Address 3",
                "Delhi", "Delhi", "110001",
                "9876500000", "a@example.com"));

        Map<String, List<Contact>> cityMap =
                book.getContacts().stream()
                    .collect(Collectors.groupingBy(
                            Contact::getCity,
                            TreeMap::new,
                            Collectors.toList())); //grouping the contacts based on the city

        cityMap.forEach((city, contacts) -> { //forEach loop to print the contacts based on the city
            System.out.println("\nCity: " + city);
            contacts.forEach(System.out::println); //printing the contacts based on the city
        });
    }
}

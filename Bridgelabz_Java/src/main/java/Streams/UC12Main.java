package main.java.Streams;
/*
Ability to sort the entries in
the address book by City,
State, or Zip - Write functions to sort person by City, State or Zip - Use Collection Library for Sorting - Use Java Streams
Name: Utakarsh Jain
Date: 15/10/2026
*/
import java.util.*;

public class UC12Main {
    public static void main(String[] args) {
        AddressBook book = new AddressBook("Friends");

        book.addContact(new Contact(
                "Utkarsh", "Jain", "Address 1",
                "Chennai", "Tamil Nadu", "600001",
                "9876543210", "u@example.com"));

        book.addContact(new Contact(
                "Rahul", "Sharma", "Address 2",
                "Delhi", "Delhi", "110001",
                "9876501234", "r@example.com"));

        book.addContact(new Contact(
                "Aman", "Verma", "Address 3",
                "Mumbai", "Maharashtra", "400001",
                "9876500000", "a@example.com"));

        System.out.println("\nSort by City:");
        book.getContacts().stream()
                .sorted(Comparator.comparing(
                        Contact::getCity,
                        String.CASE_INSENSITIVE_ORDER))
                .forEach(System.out::println);

        System.out.println("\nSort by State:");
        book.getContacts().stream()
                .sorted(Comparator.comparing(
                        Contact::getState,
                        String.CASE_INSENSITIVE_ORDER))
                .forEach(System.out::println);

        System.out.println("\nSort by ZIP:");
        book.getContacts().stream()
                .sorted(Comparator.comparing(Contact::getZip)) //Use Java Streams to print the sorted list
                .forEach(System.out::println);
    }
}

package main.java.Streams;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private String name;
    private List<Contact> contacts = new ArrayList<>(); //creating a array list

    public AddressBook(String name) {  //calling the constructor
        this.name = name;
    }

    public String getName() { //getting the name
        return name; 
    }

    public List<Contact> getContacts() { //getting the contacts
        return contacts;
    }

    public boolean addContact(Contact contact) { //adding the contact
        if (contacts.stream().anyMatch(c -> c.equals(contact))) { //Use Java Streams to print the sorted list
            System.out.println("Duplicate contact: "
                    + contact.getFullName());
            return false;
        }

        contacts.add(contact);
        System.out.println("Contact added.");
        return true;
    }
}

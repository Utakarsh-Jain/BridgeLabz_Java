
/*
Program 16: Iterator Design Pattern

Purpose:
Iterator Pattern provides a way to access collection elements
sequentially without exposing the collection's internal structure.
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorPattern {
    public static void main(String[] args) {
        // Create a collection of names
        List<String> names = new ArrayList<>();

        names.add("Utkarsh");
        names.add("Rahul");
        names.add("Aman");

        // Obtain an iterator for traversing the collection
        Iterator<String> iterator = names.iterator();

        // Check for the next element before accessing it
        while (iterator.hasNext()) {
            // Retrieve and display the next element
            System.out.println(iterator.next());
        }
    }
}

/*
Find the Nth Element from the End
Given a singly linked list (use LinkedList), find the Nth element from the end without calculating its size.
Example:
Input: [A, B, C, D, E], N=2 → Output: D.
Name : Utakarsh Jain
Date: 14/10/2026
*/

package main.java.ListInterface;

import java.util.LinkedList;
import java.util.Iterator;

public class NthElementFromEnd {

    public static <E> E getNthElementFromEnd(LinkedList<E> list, int n) { // find the Nth element from the end without calculating its size
        if (list == null || n <= 0) { // check if the list is null or n is not valid
            return null;
        }
        Iterator<E> first = list.iterator(); // create an iterator for the first pointer
        Iterator<E> second = list.iterator(); // create an iterator for the second pointer

        for (int i = 0; i < n; i++) { // Move the first pointer n steps ahead
            if (!first.hasNext()) { // check if the first pointer has a next element
                return null; // if not return null
            }
            first.next();
        }

        while (first.hasNext()) { // Move both pointers together
            first.next(); // move the first pointer to the next element
            second.next(); // move the second pointer to the next element 
        }

        return second.next(); // return the element at the second pointer
    }

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");

        System.out.println("Original List: " + linkedList);

        int n = 2;
        String result = getNthElementFromEnd(linkedList, n);

        if (result != null) {
            System.out.println("The " + n + "th element from the end is: " + result);
        } else {
            System.out.println("Invalid input or list is empty.");
        }
    }
}
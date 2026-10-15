/*
Reverse a List
Write a program to reverse the elements of a given List without using built-in reverse methods.
Implement it for both ArrayList and LinkedList.

Name : Utakarsh Jain
Date: 13/10/2026
*/

package main.java.ListInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseAList {

    // Reverse the list using two pointers
    static void reverseList(List<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) { // swap the elements at left and right pointers
            int temp = list.get(left); // store the element at left pointer
            list.set(left, list.get(right)); // set the element at left pointer to the element at right pointer
            list.set(right, temp); // set the element at right pointer to the stored element

            left++; // increment left pointer
            right--; // decrement right pointer
        }
    }

    public static void main(String[] args) {

        // Using ArrayList
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("Original ArrayList: " + arrayList);
        reverseList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);

        // Using LinkedList
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println("Original LinkedList: " + linkedList);
        reverseList(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }
}
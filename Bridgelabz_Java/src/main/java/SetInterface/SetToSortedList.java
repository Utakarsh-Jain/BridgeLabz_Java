/*

Convert a Set to a Sorted List
Convert a HashSet of integers into a sorted list in ascending order.
Example:
Input: {5, 3, 9, 1} → Output: [1, 3, 5, 9].
Name : Utakarsh Jain
Date: 14/10/2026

*/

package main.java.SetInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToSortedList {
    public static <E extends Comparable<E>> List<E> setToSortedList(Set<E> set) { // convert a HashSet of integers into a sorted list in ascending order 
        List<E> list = new ArrayList<>(set); // create a new list with the elements of the set 
        list.sort(null); // sort the list 
        return list; // return the sorted list
    }
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); // create a new HashSet 
        set.add(5); // add elements to the set
        set.add(3); // add elements to the set
        set.add(9); // add elements to the set
        set.add(1); // add elements to the set

        System.out.println("Set: " + set); // print the set

        List<Integer> list = setToSortedList(set); // convert the set to a sorted list 
        System.out.println("Sorted List: " + list); // print the sorted list 
    }
}

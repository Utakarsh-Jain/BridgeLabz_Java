/*

Check if Two Sets Are Equal
Compare two sets and determine if they contain the same elements, regardless of order.
Example:
Set1: {1, 2, 3}, Set2: {3, 2, 1} → Output: true.
Name : Utakarsh Jain
Date: 14/10/2026

*/

package main.java.Collections.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class CheckTwoSets {
    public static <E> boolean areSetsEqual(Set<E> set1, Set<E> set2) { // check if two sets are equal
        if (set1 == null || set2 == null) { // check if either set is null
            return false; // if either set is null return false
        }
        return set1.equals(set2); // check if the sets are equal
    }
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(); // create a new HashSet
        set1.add(1); // add elements to the set
        set1.add(2); // add elements to the set
        set1.add(3); // add elements to the set

        Set<Integer> set2 = new HashSet<>(); // create a new HashSet
        set2.add(3); // add elements to the set
        set2.add(2); // add elements to the set
        set2.add(1); // add elements to the set

        System.out.println("Set1: " + set1); // print the first set
        System.out.println("Set2: " + set2); // print the second set

        boolean result = areSetsEqual(set1, set2); // check if the sets are equal
        System.out.println("Are the sets equal? " + result); // print the result 
    }
}

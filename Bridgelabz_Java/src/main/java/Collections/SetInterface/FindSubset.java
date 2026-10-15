/*
Find Subsets
Check if one set is a subset of another.
Example:
Set1: {2, 3}, Set2: {1, 2, 3, 4} → Output: true.
Name : Utakarsh Jain
Date: 14/10/2026

*/

package main.java.Collections.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class FindSubset {
    public static <E> boolean isSubset(Set<E> set1, Set<E> set2) { // check if one set is a subset of another
        return set2.containsAll(set1); // check if the second set contains all the elements of the first set
    }
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(); // create a new HashSet
        set1.add(2); // add elements to the set
        set1.add(3); // add elements to the set

        Set<Integer> set2 = new HashSet<>(); // create a new HashSet
        set2.add(1); // add elements to the set
        set2.add(2); // add elements to the set
        set2.add(3); // add elements to the set
        set2.add(4); // add elements to the set

        System.out.println("Set1: " + set1); // print the first set 
        System.out.println("Set2: " + set2); // print the second set 

        boolean result = isSubset(set1, set2); // check if the first set is a subset of the second set
        System.out.println("Is Set1 a subset of Set2? " + result); // print the result 
    }
}

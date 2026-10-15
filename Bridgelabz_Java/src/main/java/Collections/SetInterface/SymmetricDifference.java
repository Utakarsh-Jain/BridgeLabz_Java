/*

Symmetric Difference
Find the symmetric difference (elements present in either set but not in both) of two sets.
Example:
Set1: {1, 2, 3}, Set2: {3, 4, 5} → Output: {1, 2, 4, 5}.
Name : Utakarsh Jain
Date: 14/10/2026

*/

package main.java.Collections.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static <E> Set<E> symmetricDifference(Set<E> set1, Set<E> set2) { // find the symmetric difference of two sets 
        Set<E> result = new HashSet<>(set1); // create a new set with the elements of the first set
        result.addAll(set2); // add the elements of the second set to the result set
        Set<E> intersection = new HashSet<>(set1); // create a new set with the elements of the first set
        intersection.retainAll(set2); // keep only the elements that are present in both sets
        result.removeAll(intersection); // remove the elements that are present in both sets
        return result; // return the result set 
    }
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(); // create a new HashSet
        set1.add(1); // add elements to the set
        set1.add(2); // add elements to the set
        set1.add(3); // add elements to the set

        Set<Integer> set2 = new HashSet<>(); // create a new HashSet
        set2.add(3); // add elements to the set
        set2.add(4); // add elements to the set
        set2.add(5);     // add elements to the set

        System.out.println("Set1: " + set1); // print the first set 
        System.out.println("Set2: " + set2); // print the second set 

        Set<Integer> symmetricDifference = symmetricDifference(set1, set2); // find the symmetric difference of the two sets
        System.out.println("Symmetric Difference: " + symmetricDifference); // print the symmetric difference of the two sets 
    }
}

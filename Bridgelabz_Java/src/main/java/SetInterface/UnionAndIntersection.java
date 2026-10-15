/*

Union and Intersection of Two Sets
Given two sets, compute their union and intersection.
Example:
Set1: {1, 2, 3}, Set2: {3, 4, 5} → Union: {1, 2, 3, 4, 5}, Intersection: {3}.
Name : Utakarsh Jain
Date: 14/10/2026

*/

package main.java.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {
    public static <E> Set<E> union(Set<E> set1, Set<E> set2) { // compute the union of two sets
        Set<E> result = new HashSet<>(set1); // create a new set with the elements of the first set
        result.addAll(set2); // add the elements of the second set to the result set
        return result; // return the result set 
    }
    public static <E> Set<E> intersection(Set<E> set1, Set<E> set2) { // compute the intersection of two sets 
        Set<E> result = new HashSet<>(set1); // create a new set with the elements of the first set
        result.retainAll(set2); // keep only the elements that are present in both sets
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
        set2.add(5); // add elements to the set

        System.out.println("Set1: " + set1); // print the first set 
        System.out.println("Set2: " + set2); // print the second set 

        Set<Integer> union = union(set1, set2); // compute the union of the two sets
        System.out.println("Union: " + union); // print the union of the two sets

        Set<Integer> intersection = intersection(set1, set2); // compute the intersection of the two sets
        System.out.println("Intersection: " + intersection); // print the intersection of the two sets 
    }
}

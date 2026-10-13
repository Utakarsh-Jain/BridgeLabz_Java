/*
Comparing Different Data Structures for Searching
Objective:
Compare Array (O(N)), HashSet (O(1)), and TreeSet (O(log N)) for searching elements.
Approach:
Array: Linear search (O(N)).
HashSet: Uses hashing (O(1) on average).
TreeSet: Balanced BST (O(log N)).
Name: Utakarsh Jain
Date: 13/10/2026

*/


package main.java.RuntimeAnalysisAndBigONotation;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class ComparingDataStructureForSearching {
    public static void main(String[] args) {
        int size = 100000;
        Random random = new Random();
        
        // Create array
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000000);
        }
        
        // Create HashSet
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < size; i++) {
            hashSet.add(array[i]);
        }
        
        // Create TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < size; i++) {
            treeSet.add(array[i]);
        }
        
        // Search for elements
        int searchElement = array[size / 2];
        
        // Measure time for array search
        long startTime = System.nanoTime();
        boolean foundArray = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == searchElement) {
                foundArray = true;
                break;
            }
        }
        long endTime = System.nanoTime();
        long arrayTime = endTime - startTime;
        
        // Measure time for HashSet search
        startTime = System.nanoTime();
        boolean foundHashSet = hashSet.contains(searchElement);
        endTime = System.nanoTime();
        long hashSetTime = endTime - startTime;
        
        // Measure time for TreeSet search
        startTime = System.nanoTime();
        boolean foundTreeSet = treeSet.contains(searchElement);
        endTime = System.nanoTime();
        long treeSetTime = endTime - startTime;
        
        // Print results
        System.out.println("Array Search: " + arrayTime + " ns" + (foundArray ? " (found)" : " (not found)"));
        System.out.println("HashSet Search: " + hashSetTime + " ns" + (foundHashSet ? " (found)" : " (not found)"));
        System.out.println("TreeSet Search: " + treeSetTime + " ns" + (foundTreeSet ? " (found)" : " (not found)"));
    }
}

/*

Remove Duplicates While Preserving Order
Remove duplicate elements from a list while maintaining the original order of elements.
Example:
Input: [3, 1, 2, 2, 3, 4] → Output: [3, 1, 2, 4].
Name : Utakarsh Jain
Date: 14/10/2026

*/

package main.java.Collections.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static void removeDuplicates(List<Integer> list) { // remove duplicate elements from a list while maintaining the original order of elements
        List<Integer> result = new ArrayList<>(); // create a new list to store the result
        for (Integer element : list) { // iterate over the list
            if (!result.contains(element)) { // check if the element is already in the result list 
                result.add(element); // add the element to the result list 
            }
        }
        list.clear(); // clear the original list
        list.addAll(result); // add the elements from the result list to the original list
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // create a new ArrayList
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Original List: " + list); 
        removeDuplicates(list); // remove duplicates from the list 
        System.out.println("List after removing duplicates: " + list);
    }
}

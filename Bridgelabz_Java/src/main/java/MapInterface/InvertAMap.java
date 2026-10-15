/*

Invert a Map
Invert a Map<K, V> to produce a Map<V, K>. Handle duplicate values by storing them in a list.
Example:
Input: {A=1, B=2, C=1} → Output: {1=[A, C], 2=[B]}.
Name: Utakarsh Jain
Date: 14/10/2026
*/

package main.java.MapInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvertAMap {
    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> map) { 
        Map<V, List<K>> invertedMap = new HashMap<>(); // create a new hash map to store the inverted map 
        for (Map.Entry<K, V> entry : map.entrySet()) { // iterate over the hash map 
            V value = entry.getValue(); // get the value from the hash map 
            K key = entry.getKey(); // get the key from the hash map 
            invertedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(key); // add the key to the inverted map 
        }
        return invertedMap; // return the inverted map 
    }
    public static void main(String[] args) { 
        Map<String, Integer> map = new HashMap<>(); // create a new hash map 
        map.put("A", 1); // put the key-value pair in the hash map 
        map.put("B", 2); // put the key-value pair in the hash map 
        map.put("C", 1); // put the key-value pair in the hash map 
        System.out.println("Original Map: " + map); // print the original map 
        Map<Integer, List<String>> invertedMap = invertMap(map); // invert the map 
        System.out.println("Inverted Map: " + invertedMap); // print the inverted map 
    }
}

/*

Merge Two Maps
Merge two maps such that if a key exists in both, sum their values.
Example:
Map1: {A=1, B=2}, Map2: {B=3, C=4} → Output: {A=1, B=5, C=4}.
Name: Utakarsh Jain
Date: 14/10/2026

*/

package main.java.MapInterface;
import java.util.HashMap;
import java.util.Map;

public class MergeTwoMaps {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();// create a new hash map 
        map1.put("A", 1);
        map1.put("B", 2);
        Map<String, Integer> map2 = new HashMap<>(); //create a new hash map 
        map2.put("B", 3);
        map2.put("C", 4);
        System.out.println("Map1: " + map1); // print the first map 
        System.out.println("Map2: " + map2); // print the second map 
        Map<String, Integer> mergedMap = mergeMaps(map1, map2); // merge the two maps 
        System.out.println("Merged Map: " + mergedMap); // print the merged map 
    }
    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) { // merge two maps 
        Map<String, Integer> mergedMap = new HashMap<>(map1); // create a new hash map with the elements of the first map 
        for (Map.Entry<String, Integer> entry : map2.entrySet()) { // iterate over the second map 
            mergedMap.merge(entry.getKey(), entry.getValue(), Integer::sum); // merge the second map with the first map 
        }
        return mergedMap; // return the merged map 
    }
}

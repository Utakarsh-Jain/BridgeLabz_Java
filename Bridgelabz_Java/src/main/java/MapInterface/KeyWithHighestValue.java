/*
Find the Key with the Highest Value
Given a Map<String, Integer>, find the key with the maximum value.
Example:
Input: {A=10, B=20, C=15} → Output: B.
Name: Utakarsh Jain
Date: 14/10/2026

*/

package main.java.MapInterface;
import java.util.HashMap; 
import java.util.Map; 
public class KeyWithHighestValue {
    public static void main(String[] args) { // main method 
        Map<String, Integer> map = new HashMap<>(); // create a new hash map 
        map.put("A", 10); // put the key-value pair in the hash map 
        map.put("B", 20); // put the key-value pair in the hash map 
        map.put("C", 15); // put the key-value pair in the hash map 
        System.out.println("Original Map: " + map); // print the original map 
        String key = findKeyWithHighestValue(map); // find the key with the highest value 
        System.out.println("Key with highest value: " + key); // print the key with the highest value 
    }
    public static String findKeyWithHighestValue(Map<String, Integer> map) { 
        String key = null; 
        int maxValue = Integer.MIN_VALUE; 
        for (Map.Entry<String, Integer> entry : map.entrySet()) { 
            if (entry.getValue() > maxValue) { 
                maxValue = entry.getValue(); 
                key = entry.getKey(); 
            } 
        } 
        return key; 
    }
}

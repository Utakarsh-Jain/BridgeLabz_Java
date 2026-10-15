/*

Find Frequency of Elements
Given a list of strings, count the frequency of each element and return the results in a Map<String, Integer>.
Example:
Input: ["apple", "banana", "apple", "orange"] → Output: {apple=2, banana=1, orange=1}.
Name : Utakarsh Jain
Date: 14/10/2026
*/

package main.java.ListInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class FrequencyOfElement {

    public static Map<String, Integer> findFrequency(List<String> list) {
        Map<String, Integer> frequencyMap = new HashMap<>();  // create a HashMap to store the frequency of each element 
        for (String element : list) { // iterate over the list
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1); // put the element in the map and increment the count
        }
        return frequencyMap; 
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("apple");
        words.add("orange");
        words.add("banana");
        words.add("apple");

        System.out.println("Original List: " + words);

        Map<String, Integer> frequencyMap = findFrequency(words); // get the frequency of each element
        System.out.println("Frequency Map: " + frequencyMap);
    }
}

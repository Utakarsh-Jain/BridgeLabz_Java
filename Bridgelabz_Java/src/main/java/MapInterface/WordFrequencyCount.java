/*
Word Frequency Counter
Read a text file and count the frequency of each word using a HashMap.
Ignore case and punctuation.
Example:
Input: "Hello world, hello Java!" → Output: {hello=2, world=1, java=1}
Name: Utakarsh Jain
Date: 14/10/2026
*/

package main.java.MapInterface;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class WordFrequencyCount {
    public static void main(String[] args) { 
        String fileName = "input.txt"; // file name 
        HashMap<String, Integer> wordCount = new HashMap<>(); // hash map to store the frequency of each word 
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) { // read the file 
            String line; 
            while ((line = br.readLine()) != null) { // read the file line by line 
                line = line.toLowerCase().replaceAll("[^a-z0-9\\s]", " "); // convert the file to lowercase and remove punctuation 
                String[] words = line.trim().split("\\s+"); // split the file into words 
                for (String word : words) { // iterate over the words 
                    if (!word.isEmpty()) { // check if the word is not empty 
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1); // put the word in the hash map 
                    }
                }
            }

            System.out.println("Word Frequencies: " + wordCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
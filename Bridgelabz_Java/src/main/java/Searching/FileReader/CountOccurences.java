/*

Count the Occurrence of a Word in a File Using FileReader
Problem:
Write a program that uses FileReader and BufferedReader to read a file and count how many times a specific word appears in the file.
Approach:
Create a FileReader to read from the file and wrap it in a BufferedReader.
Initialize a counter variable to keep track of word occurrences.
For each line in the file, split it into words and check if the target word exists.
Increment the counter each time the word is found.
Print the final count.
Name : Utakarsh Jain
Date : 09/10/2026

*/
package main.java.Searching.FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountOccurences {
    // Function to count the occurrence of a word in a file
    public static void countOccurences(String filePath, String word) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) { // create a BufferedReader object
            int count = 0; // create a counter variable to keep track of word occurrences
            String line; // create a String variable to store each line
            while ((line = br.readLine()) != null) { // read each line from the file
                String[] words = line.split(" "); // split each line into words
                for (String w : words) { // iterate over each word in the array
                    if (w.equals(word)) { // check if the current word is equal to the target word
                        count++; // increment the counter
                    }
                }
            }
            System.out.println("The word " + word + " appears " + count + " times in the file."); // print the final count
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage()); // print error if any
        }
    }
    public static void main(String[] args) {
        countOccurences("test.txt", "hello"); // specify the path to the text file and the word to count
    }
}

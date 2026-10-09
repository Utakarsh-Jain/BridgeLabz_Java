/*

Compare StringBuilder, StringBuffer, FileReader, and InputStreamReader
Problem:
Write a program that:
Uses StringBuilder and StringBuffer to concatenate a list of strings 1,000,000 times.
Uses FileReader and InputStreamReader to read a large file (e.g., 100MB) and print the number of words in the file.
Approach:
StringBuilder and StringBuffer:
Create a list of strings (e.g., "hello").
Concatenate the strings 1,000,000 times using both StringBuilder and StringBuffer.
Measure and compare the time taken for each.
FileReader and InputStreamReader:
Read a large text file (100MB) using FileReader and InputStreamReader.
Count the number of words by splitting the text on whitespace characters.
Print the word count and compare the time taken for reading the file.

Name : Utakarsh Jain
Date : 09/10/2026


*/

package main.java.Searching.ChallengeProblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Comparison {
    // Function to compare StringBuilder and StringBuffer for string concatenation
    public static void compareStringBuilderAndStringBuffer() {
        int numStrings = 1000000; // 1 million strings
        String[] strings = new String[numStrings];
        for (int i = 0; i < numStrings; i++) {
            strings[i] = "hello"; // initialize with "hello"
        }

        // Measure time for StringBuilder
        long startTime = System.nanoTime(); // measure the time for StringBuilder
        StringBuilder stringBuilder = new StringBuilder(); // create a StringBuilder object
        for (String str : strings) {
            stringBuilder.append(str); // append each string to the StringBuilder
        }
        long endTime = System.nanoTime(); // measure the time for StringBuilder
        long timeTakenStringBuilder = endTime - startTime; // calculate the time taken by StringBuilder

        // Measure time for StringBuffer
        startTime = System.nanoTime(); // measure the time for StringBuffer
        StringBuffer stringBuffer = new StringBuffer(); // create a StringBuffer object
        for (String str : strings) {
            stringBuffer.append(str); // append each string to the StringBuffer
        }
        endTime = System.nanoTime(); // measure the time for StringBuffer
        long timeTakenStringBuffer = endTime - startTime; // calculate the time taken by StringBuffer

        // Output the results
        System.out.println("Time taken by StringBuilder: " + timeTakenStringBuilder + " nanoseconds");
        System.out.println("Time taken by StringBuffer: " + timeTakenStringBuffer + " nanoseconds");
    }

    // Function to read a large file and count words
    public static void readLargeFile(String filePath) {
        try (FileReader fr = new FileReader(filePath); // create a FileReader object to read a large file
             BufferedReader br = new BufferedReader(fr)) { // wrap the FileReader in a BufferedReader to read characters efficiently
            int wordCount = 0; // create a counter variable to keep track of word count
            String line; // create a String variable to store each line
            while ((line = br.readLine()) != null) { // read each line from the file
                String[] words = line.split(" "); // split each line into words
                wordCount += words.length; // add the number of words in the current line to the total word count
            }
            System.out.println("Number of words in the file: " + wordCount); // print the total word count
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage()); // print error if any
        }
    }

    public static void main(String[] args) {
        compareStringBuilderAndStringBuffer();
        readLargeFile("test.txt"); // specify the path to the large text file
    }
}

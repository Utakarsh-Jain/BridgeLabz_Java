/*

Read a File Line by Line Using FileReader
Problem:
Write a program that uses FileReader to read a text file line by line and print each line to the console.
Approach:
Create a FileReader object to read from the file.
Wrap the FileReader in a BufferedReader to read lines efficiently.
Use a loop to read each line using the readLine() method and print it to the console.
Close the file after reading all the lines.
Name : Utakarsh Jain
Date : 09/10/2026
*/

package main.java.Searching.FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadALine {
    // Function to read a file line by line using FileReader
    public static void readFileLineByLine(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) { // create a BufferedReader object
            String line; // create a String variable to store each line
            while ((line = br.readLine()) != null) { // read each line from the file
                System.out.println(line); // print each line to the console
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage()); // print error if any
        }
    }
    public static void main(String[] args) {
        readFileLineByLine("test.txt"); // specify the path to the text file
    }
}

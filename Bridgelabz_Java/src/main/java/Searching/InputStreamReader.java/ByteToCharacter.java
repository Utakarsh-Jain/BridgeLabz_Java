/*

1: Convert Byte Stream to Character Stream Using InputStreamReader
Problem:
Write a program that uses InputStreamReader to read binary data from a file and print it as characters. The file contains data encoded in a specific charset (e.g., UTF-8).
Approach:
Create a FileInputStream object to read the binary data from the file.
Wrap the FileInputStream in an InputStreamReader to convert the byte stream into a character stream.
Use a BufferedReader to read characters efficiently from the InputStreamReader.
Read the file line by line and print the characters to the console.
Handle any encoding exceptions as needed.

Name : Utakarsh Jain
Date : 09/10/2026


*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class ByteToCharacter {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("test.txt"); // create a FileInputStream object to read binary data from a file
             InputStreamReader isr = new InputStreamReader(fis); // wrap the FileInputStream in an InputStreamReader to convert the byte stream into a character stream
             BufferedReader br = new BufferedReader(isr)) { // use a BufferedReader to read characters efficiently from the InputStreamReader
            String line; // create a String variable to store each line
            while ((line = br.readLine()) != null) { // read the file line by line and print the characters to the console
                System.out.println(line); // print each line to the console
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage()); // print error if any
        }
    }
}

/*
Checked Exception (Compile-time Exception)
Problem Statement:
Create a Java program that reads a file named "data.txt". If the file does not exist, handle the IOException properly and display a user-friendly message.
Expected Behavior:
If the file exists, print its contents.
If the file does not exist, catch the IOException and print "File not found".
Name: Utakarsh Jain
Date: 19/10/2026
*/

package main.java.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        try {
            // Attempt to read the file
            BufferedReader reader = new BufferedReader(new FileReader("data.txt")); //creating a file reader
            String line;
            System.out.println("File content:");
            while ((line = reader.readLine()) != null) { //reading the file
                System.out.println(line);
            }

            reader.close(); // Close the file
        } catch (IOException e) {
            // Handle the exception if the file is not found
            System.out.println("File not found");
        }
    }
}

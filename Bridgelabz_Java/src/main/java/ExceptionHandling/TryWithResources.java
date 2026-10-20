/*
try-with-resources (Auto-closing Resources)
Problem Statement:
Write a Java program that reads the first line of a file named "info.txt" using BufferedReader.
Use try-with-resources to ensure the file is automatically closed after reading.
Handle any IOException that may occur.
Expected Behavior:
If the file exists, print its first line.
If the file does not exist, catch IOException and print "Error reading file".

Name: Utakarsh Jain
Date: 19/10/2026
*/
package main.java.ExceptionHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class TryWithResources {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("info.txt"))) {
            String line = reader.readLine();
            System.out.println("First line: " + line); //printing the first line
        } catch (IOException e) {
            System.out.println("Error reading file"); //printing the error message
        }
    }
}

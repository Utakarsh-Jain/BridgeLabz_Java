/*

Read User Input and Write to File Using InputStreamReader
Problem:
Write a program that uses InputStreamReader to read user input from the console and write the input to a file. Each input should be written as a new line in the file.
Approach:
Create an InputStreamReader to read from System.in (the console).
Wrap the InputStreamReader in a BufferedReader for efficient reading.
Create a FileWriter to write to the file.
Read user input using readLine() and write the input to the file.
Repeat the process until the user enters "exit" to stop inputting.
Close the file after the input is finished.

Name : Utakarsh Jain
Date : 09/10/2026


*/

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReadAndWrite {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // create a BufferedReader object
             FileWriter fw = new FileWriter("output.txt")) { // create a FileWriter object
            System.out.println("Enter your input: "); // print the prompt to the console
            String line;
            while ((line = br.readLine()) != null) { // read the input until the user enters "exit"
                if (line.equals("exit")) { // check if the input is equal to "exit"
                    break; // exit the loop
                }
                fw.write(line + "\n"); // write the input to the file
            }
            System.out.println("Input written to file successfully."); // print the success message
        } catch (IOException e) {
            System.err.println("Error reading/writing file: " + e.getMessage()); // print error if any
        }
    }
}       

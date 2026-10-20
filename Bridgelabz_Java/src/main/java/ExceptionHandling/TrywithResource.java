
/*
Problem Statement 1: Try-With-Resources
Problem:
Read data from multiple files and process their contents.
Use BufferedReader and try-with-resources to close resources properly.

Name: Utakarsh Jain
Date: 21/10/2026
*/

package main.java.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Arrays;

class FileProcessor {

    public void processFiles(List<String> filePaths) {
        for (String filePath : filePaths) { //looping through the file paths
            System.out.println("Reading file: " + filePath);

            try (BufferedReader br =
                         new BufferedReader(new FileReader(filePath))) { //using try-with-resources to read the file

                String line;

                while ((line = br.readLine()) != null) { //looping through the file
                    System.out.println(line);
                }

            } catch (IOException e) {
                System.out.println("Error reading file: " + filePath); //printing the error message
                System.out.println(e.getMessage());
            }
        }
    }
}

public class TrywithResource {

    public static void main(String[] args) {
        FileProcessor processor = new FileProcessor();

        List<String> filePaths = Arrays.asList(
                "file1.txt",
                "file2.txt",
                "file3.txt" //adding the file paths
        );

        processor.processFiles(filePaths); //processing the file paths
    }
}

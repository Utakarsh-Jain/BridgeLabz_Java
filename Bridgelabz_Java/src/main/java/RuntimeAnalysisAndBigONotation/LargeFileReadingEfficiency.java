/*
Large File Reading Efficiency

Objective:
Compare FileReader (Character Stream) and InputStreamReader (Byte Stream)
when reading a large file (500MB).

Approach:
FileReader: Reads characters from a file.
InputStreamReader: Converts bytes into characters using a character encoding.

Name: Utakarsh Jain
Date: 13/10/2026
*/

package main.java.RuntimeAnalysisAndBigONotation;

import java.io.File;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class LargeFileReadingEfficiency {

    private static final String FILE_NAME = "largeFile.txt";
    private static final long FILE_SIZE = 500L * 1024 * 1024;

    // Create a large text file of approximately 500 MB
    public static void createLargeFile() throws IOException {
        File file = new File(FILE_NAME);

        if (file.exists() && file.length() >= FILE_SIZE) {
            System.out.println("Large file already exists.");
            return;
        }

        String data = "Java File Reading Efficiency Test 123456789\n";
        byte[] bytes = data.getBytes(StandardCharsets.UTF_8);

        try (FileOutputStreamWrapper output =
                     new FileOutputStreamWrapper(FILE_NAME)) {

            long written = 0;

            while (written + bytes.length <= FILE_SIZE) {
                output.write(bytes);
                written += bytes.length;
            }

            while (written < FILE_SIZE) {
                output.write(' ');
                written++;
            }
        }

        System.out.println("Large file created: " + file.length() + " bytes");
    }

    // Read file using FileReader
    public static long readUsingFileReader() throws IOException {
        long charactersRead = 0;

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(FILE_NAME))) {

            char[] buffer = new char[8192];
            int count;

            while ((count = reader.read(buffer)) != -1) {
                charactersRead += count;
            }
        }

        return charactersRead;
    }

    // Read file using InputStreamReader
    public static long readUsingInputStreamReader() throws IOException {
        long charactersRead = 0;

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(FILE_NAME),
                        StandardCharsets.UTF_8))) {

            char[] buffer = new char[8192];
            int count;

            while ((count = reader.read(buffer)) != -1) {
                charactersRead += count;
            }
        }

        return charactersRead;
    }
    public static void main(String[] args) {
        try {
            createLargeFile();
            // Warm up the file-reading code
            readUsingFileReader();
            readUsingInputStreamReader();
            // Measure FileReader
            long startTime = System.nanoTime();
            long fileReaderCount = readUsingFileReader();
            long endTime = System.nanoTime();
            double fileReaderTime = (endTime - startTime) / 1_000_000_000.0;
            // Measure InputStreamReader
            startTime = System.nanoTime();
            long inputStreamReaderCount = readUsingInputStreamReader();
            endTime = System.nanoTime();
            double inputStreamReaderTime = (endTime - startTime) / 1_000_000_000.0;
            System.out.println("\nFile Reading Results");
            System.out.println("File Size: " + new File(FILE_NAME).length() / (1024 * 1024) + " MB");
            System.out.println("\nFileReader:");
            System.out.println("Characters Read: " + fileReaderCount);
            System.out.println("Time Taken: " + fileReaderTime + " seconds");

            System.out.println("\nInputStreamReader:");
            System.out.println("Characters Read: " + inputStreamReaderCount);
            System.out.println("Time Taken: " + inputStreamReaderTime + " seconds");
        } catch (IOException e) {
            System.out.println("File operation failed: " + e.getMessage());
        }
    }
    // Helper class for writing file bytes
    private static class FileOutputStreamWrapper
            extends java.io.FileOutputStream {
        public FileOutputStreamWrapper(String name) throws IOException {
            super(name);
        }
    }
}
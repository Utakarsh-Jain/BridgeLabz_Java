/*

Compare StringBuffer with StringBuilder for String Concatenation
Problem:
Write a program that compares the performance of StringBuffer and StringBuilder for concatenating strings. For large datasets (e.g., concatenating 1 million strings), compare the execution time of both classes.
Approach:
Initialize two StringBuffer and StringBuilder objects.
Perform string concatenation in both objects, appending 1 million strings (e.g., "hello").
Measure the time taken to complete the concatenation using System.nanoTime() for both StringBuffer and StringBuilder.
Output the time taken by both classes for comparison.

Name : Utakarsh Jain
Date : 09/10/2026



*/

package main.java.Searching.StringBuffer;

public class ComparisonStringConcatenation {
    // Function to compare StringBuffer and StringBuilder for string concatenation
    public static void compareStringBufferAndStringBuilder() {
        int numStrings = 1000000; // 1 million strings
        String[] strings = new String[numStrings];
        for (int i = 0; i < numStrings; i++) {
            strings[i] = "hello"; // initialize with "hello"
        }

        // Measure time for StringBuffer
        long startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : strings) {
            stringBuffer.append(str);
        }
        long endTime = System.nanoTime();
        long timeTakenStringBuffer = endTime - startTime;

        // Measure time for StringBuilder
        startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strings) {
            stringBuilder.append(str);
        }
        endTime = System.nanoTime();
        long timeTakenStringBuilder = endTime - startTime;

        // Output the results
        System.out.println("Time taken by StringBuffer: " + timeTakenStringBuffer + " nanoseconds");
        System.out.println("Time taken by StringBuilder: " + timeTakenStringBuilder + " nanoseconds");
        
        if (timeTakenStringBuilder < timeTakenStringBuffer) {
            System.out.println("StringBuilder is faster than StringBuffer.");
        } else {
            System.out.println("StringBuffer is faster than StringBuilder.");
        }
    }
    public static void main(String[] args) {
        compareStringBufferAndStringBuilder();
    }
}

/*

String Concatenation Performance
Objective:
Compare the performance of String (O(N²)), StringBuilder (O(N)), and StringBuffer (O(N)) when concatenating a million strings.
Approach:
Using String (Immutable, creates new object each time)
Using StringBuilder (Fast, mutable, thread-unsafe)
Using StringBuffer (Thread-safe, slightly slower than StringBuilder)

Name: Utakarsh Jain
Date: 13/10/2026

*/


package main.java.RuntimeAnalysisAndBigONotation;

public class StringConcatination {
    public static void main(String[] args) {
        int size = 100000; // Reduced to 100,000 to avoid extreme runtime
        String resultString = "";
        StringBuilder resultBuilder = new StringBuilder();
        StringBuffer resultBuffer = new StringBuffer();
        
        System.out.println("Starting concatenation tests with " + size + " strings...");

        // Test String Concatenation (O(N^2))
        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            resultString += "a";
        }
        long endTime = System.nanoTime();
        long stringTime = (endTime - startTime) / 1000000;
        System.out.println("String Concatenation (O(N^2)): " + stringTime + "ms");
        
        // Test StringBuilder (O(N))
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            resultBuilder.append("a");
        }
        endTime = System.nanoTime();
        long builderTime = (endTime - startTime) / 1000000;
        System.out.println("StringBuilder (O(N)): " + builderTime + "ms");
        
        // Test StringBuffer (O(N))
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            resultBuffer.append("a");
        }
        endTime = System.nanoTime();
        long bufferTime = (endTime - startTime) / 1000000;
        System.out.println("StringBuffer (O(N)): " + bufferTime + "ms");
    }
}


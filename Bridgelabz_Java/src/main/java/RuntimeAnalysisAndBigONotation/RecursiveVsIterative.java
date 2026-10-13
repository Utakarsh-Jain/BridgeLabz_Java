/*
Recursive vs Iterative Fibonacci Computation
Objective:
Compare Recursive (O(2ⁿ)) vs Iterative (O(N)) Fibonacci solutions.
Approach:
Recursive:
public static int fibonacciRecursive(int n) {
    if (n <= 1) return n;
    return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
}

Iterative:
public static int fibonacciIterative(int n) {
    int a = 0, b = 1, sum;
    for (int i = 2; i <= n; i++) {
        sum = a + b;
        a = b;
        b = sum;
    }
    return b;
}
Name: Utakarsh Jain
Date: 13/10/2026

*/

package main.java.RuntimeAnalysisAndBigONotation;

public class RecursiveVsIterative {
    public static void main(String[] args) {
        int n = 40; // Fibonacci number to compute
        // Measure recursive approach
        long startTime = System.nanoTime(); // computes start time
        long recursiveResult = fibonacciRecursive(n); // computes fibonacci
        long endTime = System.nanoTime();  // computes end time
        long recursiveTime = (endTime - startTime) / 1000000; // computes time in milliseconds
        System.out.println("Recursive Fibonacci(" + n + "): " + recursiveResult + " time: " + recursiveTime + "ms"); // prints result
        
        // Measure iterative approach
        startTime = System.nanoTime(); // computes start time
        long iterativeResult = fibonacciIterative(n); // computes fibonacci
        endTime = System.nanoTime(); // computes end time
        long iterativeTime = (endTime - startTime) / 1000000; // computes time in milliseconds
        System.out.println("Iterative Fibonacci(" + n + "): " + iterativeResult + " time: " + iterativeTime + "ms"); // prints result
    }
    public static long fibonacciRecursive(int n) {
        if (n <= 1) return n; // base case
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2); // recursive step
    }
    public static long fibonacciIterative(int n) {
        long a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b; // computes sum
            a = b; // updates a
            b = sum; // updates b
        }
        return b; // returns result
    }
}

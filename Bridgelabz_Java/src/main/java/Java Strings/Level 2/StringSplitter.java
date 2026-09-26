/*
Problem 2 - Java String Level 2
Write a program to split the text into words, compare the result with the split() method and display the result 
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to find the length of the String without using the built-in length() method. 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words. Use the following logic
Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
Then Create an array to store the words and use the indexes to extract the words
Create a method to compare the two String arrays and return a boolean
The main function calls the user-defined method and the built-in split() method. Call the user defined method to compare the two string arrays and display the result
Name : Utakarsh Jain
Date : 25-09-2026

*/

import java.util.Scanner;
class StringSplitter {
    // Method to find the length of a string without using length()
    public static int findStringLength(String text) {
        int count = 0;
        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return count;
    }
    // Method to split the text into words using charAt()
    public static String splitTextIntoWords(String text)[] {
        if (text == null || text.isEmpty()) {
            return new String[0];
        }
        int length = findStringLength(text);
        // 1. Count words and store indexes of spaces
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        // Array to store indexes of spaces
        int spaceIndexes[] = new int[wordCount];
        int spaceIndex = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceIndex] = i;
                spaceIndex++;
            }
        }
        // 2. Create array to store words and extract them
        String words[] = new String[wordCount];
        int startIndex = 0;
        for (int i = 0; i < wordCount; i++) {
            int endIndex;
            if (i == wordCount - 1) {
                endIndex = length;
            } else {
                endIndex = spaceIndexes[i];
            }
            StringBuilder wordBuilder = new StringBuilder();
            for (int j = startIndex; j < endIndex; j++) {
                wordBuilder.append(text.charAt(j));
            }
            words[i] = wordBuilder.toString();
            startIndex = endIndex + 1;
        }
        return words;
    }
    // Method to compare two String arrays
    public static boolean compareArrays(String arr1[], String arr2[]) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = sc.nextLine();
        // Split using user-defined method
        String userWords[] = splitTextIntoWords(text);
        // Split using built-in split() method
        String builtInWords[] = text.split("\\s+");
        // Display both results
        System.out.println("\n User-defined Split");
        for (String word : userWords) {
            System.out.println(word);
        }
        System.out.println("\n Built-in split()");
        for (String word : builtInWords) {
            System.out.println(word);
        }
        // Compare the results
        boolean arraysEqual = compareArrays(userWords, builtInWords);
        System.out.println("\nComparison Result: " + (arraysEqual ? "Arrays are identical" : "Arrays are different"));
        sc.close();
    }
}

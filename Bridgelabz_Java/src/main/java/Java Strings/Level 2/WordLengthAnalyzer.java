/*
Problem 3 - Java String Level 2
Write a program to split the text into words and return the words along with their lengths in a 2D array
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
The main function calls the user-defined method and displays the result in a tabular format. During display make sure to convert the length value from String to Integer and then display
Name : Utakarsh Jain
Date : 26-09-2026

*/

import java.util.Scanner;
class WordLengthAnalyzer {
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
    // Method to split text into words using charAt() without using split()
    public static String splitTextIntoWords(String text)[] {
        if (text == null || text.isEmpty()) {
            return new String[0];
        }
        int length = findStringLength(text);
        // Count words and find space indexes
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        int spaceIndexes[] = new int[wordCount];
        int spaceIndex = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceIndex] = i;
                spaceIndex++;
            }
        }
        // Create array to store words
        String words[] = new String[wordCount];
        int startIndex = 0;
        for (int i = 0; i < wordCount; i++) {
            int endIndex;
            if (i == wordCount - 1) {
                endIndex = length;
            } else {
                endIndex = spaceIndexes[i];
            }
            // Extract word using charAt()
            StringBuilder wordBuilder = new StringBuilder();
            for (int j = startIndex; j < endIndex; j++) {
                wordBuilder.append(text.charAt(j));
            }
            words[i] = wordBuilder.toString();
            startIndex = endIndex + 1;
        }
        return words;
    }
    // Method to take the word array and return a 2D array of word and its length
    public static String[][] getWordAndLengthArray(String words[]) {
        int wordCount = words.length;
        String wordLengthArray[][] = new String[wordCount][2];
        for (int i = 0; i < wordCount; i++) {
            int length = findStringLength(words[i]);
            wordLengthArray[i][0] = words[i]; // Store word
            // Convert length to String using String.valueOf()
            wordLengthArray[i][1] = String.valueOf(length); 
        }
        return wordLengthArray;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = sc.nextLine();
        // Split text into words
        String words[] = splitTextIntoWords(text);
        // Create 2D array of words and their lengths
        String wordLengthArray[][] = getWordAndLengthArray(words);
        // Display the result in tabular format
        System.out.println("\n Word Lengths ");
        System.out.println("Word   | Length");
        for (int i = 0; i < wordLengthArray.length; i++) {
            String word = wordLengthArray[i][0];
            String lengthStr = wordLengthArray[i][1];
            // Convert length from String to Integer for display
            int length = Integer.parseInt(lengthStr); 
            System.out.println( word + " | " + length);
        }
        sc.close();
    }
}

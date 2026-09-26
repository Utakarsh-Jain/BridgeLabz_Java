/*
Problem 4 - Java String Level 2
Write a program to split the text into words and find the shortest and longest strings in a given text
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
Create a Method that takes the 2D array of word and corresponding length as parameters, find the shortest and longest string and return them in an 1D int array. 
The main function calls the user-defined methods and displays the result. 
Name : Utakarsh Jain
Date : 25-09-2026

*/
import java.util.Scanner;
class ShortestLongestString {
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
    // Method to take word array and return 2D array of word and its length
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
    // Method to find shortest and longest strings and return their lengths
    public static int[] findShortestLongestLength(String[][] wordLengthArray) {
        if (wordLengthArray == null || wordLengthArray.length == 0) {
            return new int[] {0, 0};
        }
        int minLength = Integer.MAX_VALUE;
        int maxLength = Integer.MIN_VALUE;
        for (int i = 0; i < wordLengthArray.length; i++) {
            String lengthStr = wordLengthArray[i][1];
            int currentLength = Integer.parseInt(lengthStr);
            if (currentLength < minLength) {
                minLength = currentLength;
            }
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }
        return new int[] {minLength, maxLength};
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = sc.nextLine();
        // Split text into words
        String words[] = splitTextIntoWords(text);
        // Create 2D array of words and their lengths
        String wordLengthArray[][] = getWordAndLengthArray(words);
        // Find shortest and longest string lengths
        int lengths[] = findShortestLongestLength(wordLengthArray);
        int shortestLength = lengths[0];
        int longestLength = lengths[1];
        // Display the result
        System.out.println("\n--- Shortest and Longest String Lengths ---");
        System.out.println("Shortest String Length: " + shortestLength);
        System.out.println("Longest String Length:  " + longestLength);
        sc.close();
    }
}
/*

Find the Longest Word in a Sentence
Problem:
Write a Java program that takes a sentence as input and returns the longest word in the
sentence.
Name : Utakarsh Jain
Date : 28/09/2026
*/

import java.util.*;
public class LongestWord {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = sc.nextLine();
        LongestWord obj = new LongestWord(); // creating an object of the class
        obj.findLongestWord(sentence); // calling the method to find the longest word
        sc.close();
    }
    public void findLongestWord(String sentence) {
        String words[] = sentence.split(" "); // splitting the sentence into words
        String longestWord = words[0];
        for (int i = 1; i < words.length; i++) { //looping through the words
            if (words[i].length() > longestWord.length()) { //checking if the current word is longer than the longest word
                longestWord = words[i]; //updating the longest word
            }
        }
        System.out.println("The longest word in the sentence is " + longestWord);
    }
}
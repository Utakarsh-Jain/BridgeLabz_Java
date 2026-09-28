/*
Problem 12
Write a replace method in Java that replaces a given word with another word in a
sentence:

Name : Utakarsh Jain
Date : 28/09/2026

*/

import java.util.*;
public class ReplaceWord {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence:");
        String sentence = sc.nextLine();
        System.out.print("Enter the word to replace:");
        String wordToReplace = sc.nextLine();
        System.out.print("Enter the word to replace with:");
        String wordToReplaceWith = sc.nextLine();
        ReplaceWord obj = new ReplaceWord();
        obj.replaceWord(sentence, wordToReplace, wordToReplaceWith);
        sc.close();
    }
    public void replaceWord(String sentence, String wordToReplace, String wordToReplaceWith) {
        String result = "";
        for (int i = 0; i < sentence.length(); i++) { //looping through the sentence
            if (sentence.substring(i, i + wordToReplace.length()).equals(wordToReplace)) { //checking if the word is equal to the word to replace
                result += wordToReplaceWith; //adding the word to replace with to the result string
                i += wordToReplace.length() - 1; //incrementing the index by the length of the word to replace minus 1
            } else {
                result += sentence.charAt(i); //adding the character to the result string
            }
        }
        System.out.println("Modified String: " + result); //printing the result string
    }
}
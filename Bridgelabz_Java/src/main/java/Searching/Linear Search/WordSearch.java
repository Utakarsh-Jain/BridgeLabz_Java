/*

Problem:
You are given an array of sentences (strings). Write a program that performs Linear Search to find the first sentence containing a specific word. If the word is found, return the sentence. If no sentence contains the word, return "Not Found".
Approach:
Iterate through the list of sentences.
For each sentence, check if it contains the specific word.
If the word is found, return the current sentence.
If no sentence contains the word, return "Not Found".
Name : Utakarsh Jain
Date : 9/10/2026
*/
public class WordSearch {
    // Function to find the first sentence containing a specific word
    public static String findFirstSentence(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }
    public static void main(String[] args) {
        String[] sentences = {"Hello world", "This is a test", "Another sentence", "Java programming is fun"};
        String word = "test";
        String result = findFirstSentence(sentences, word);
        System.out.println(result);
    }
}

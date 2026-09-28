/*

1. Number Guessing Game: 
○ Write a Java program where the user thinks of a number between 1 and 100, and the computer tries to guess the number by generating random guesses. 
○ The user provides feedback by indicating whether the guess is high, low, or correct. The program should be modular, with different functions for generating guesses, receiving user feedback, and determining the next guess. 



*/
import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    static int generateGuess(int low, int high) {
        Random random = new Random(); //Generating a random number between low and high
        return random.nextInt(high - low + 1) + low; 
    }
    static String getFeedback(Scanner sc) {
        System.out.print("Enter feedback (high/low/correct): ");
        return sc.nextLine().toLowerCase(); //Converting the feedback to lowercase
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1; //Setting the lower bound for the random number
        int high = 100; //Setting the upper bound for the random number
        String feedback;
        System.out.println("Think of a number between 1 and 100.");
        while (low <= high) { //Checking if the lower bound is less than or equal to the upper bound
            int guess = generateGuess(low, high);
            System.out.println("Computer's guess: " + guess);
            feedback = getFeedback(sc);
            if (feedback.equals("correct")) { //Checking if the guess is correct
                System.out.println("Computer guessed your number!");
                break;
            } else if (feedback.equals("low")) { //Checking if the guess is low
                low = guess + 1;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else {
                System.out.println("Invalid feedback.");
            }
        }
        sc.close();
    }
}
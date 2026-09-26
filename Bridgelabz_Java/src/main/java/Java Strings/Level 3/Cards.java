/*

Problem 10 - Java String LEVEL 3
Write a program to create a deck of cards, initialize the deck, shuffle the deck, and distribute the deck of n cards to x number of players. Finally, print the cards the players have.
Hint => 
Create a deck of cards with suits "Hearts", "Diamonds", "Clubs", "Spades" and ranks from "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", and "Ace"
Calculate the number of cards in the deck and initialize the deck
int numOfCards = suits.length * ranks.length;
Write a Method to Initialize the deck of cards with suits and ranks and return the deck. The deck is an array of strings where each string represents a card in the deck represented as "rank of suit" e.g., "2 of Hearts"
Write a Method to Shuffle the deck of cards and return the shuffled deck. To shuffle the card iterate over the deck and swap each card with a random card from the remaining deck to shuffle the deck. Please find the steps below
Step1: Use for Loop Iterate over the deck and swap each card with a random card from the remaining deck
Step 2: Inside the Loop Generate a random card number between i and n using the following code 
int randomCardNumber = i + (int) (Math.random() * (n - i));
Step 3: Swap the current card with the random card
Write a Method to distribute the deck of n cards to x number of players and return the players. For this Check the n cards can be distributed to x players. If possible then Create a 2D array to store the players and their cards
Write a Method to Print the players and their cards
Name : Utakarsh Jain
Date : 26/09/2026


*/
import java.util.Scanner;
public class Cards {
    // Method to initialize the deck of cards
    public static String[] initializeDeck() {

        String suits[] = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String ranks[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length; //Calculating the no of cards
        String deck[] = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit; //Adding cards in the deck
                index++;
            }
        }
        return deck;
    }
    // Method to shuffle the deck of cards
    public static String[] shuffleDeck(String deck[]) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomIndex =
                i + (int)(Math.random() * (n - i)); //Generating a random card number between i and n 

            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp; //Swap the current card with the random card
        }
        return deck;
    }

    // Method to distribute cards to players
    public static String[][] distributeCards(String deck[], int players) {
        int totalCards = deck.length;
        if (totalCards % players != 0) { //Checking if the n cards can be distributed to x players
            System.out.println("Cards cannot be distributed evenly!");
            return null;
        }
        int cardsPerPlayer = totalCards / players; //Calculating the no of cards for each player
        String playerDeck[][] = new String[players][cardsPerPlayer]; //Creating a 2D array to store the players and their cards
        int deckIndex = 0;
        for (int i = 0; i < players; i++) { //Distributing cards to players
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerDeck[i][j] = deck[deckIndex]; //Assigning cards to players
                deckIndex++; //Incrementing the deck index
            }
        }
        return playerDeck;
    }
    // Method to print the cards of each player
    public static void printPlayerCards(String playerDeck[][]) {
        for (int i = 0; i < playerDeck.length; i++) { //Printing the cards of each player
            System.out.println("Player " + (i + 1) + " cards:");
            for (int j = 0; j < playerDeck[i].length; j++) {
                System.out.print(playerDeck[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) { //Main method
        Scanner sc = new Scanner(System.in);     
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        if (players <= 0) { //Checking if the number of players is valid
            System.out.println("Invalid number of players.");
            sc.close();
            return;
        }
        // Initialize and shuffle deck
        String deck[] = initializeDeck(); //Initializing the deck
        deck = shuffleDeck(deck); //Shuffling the deck
        // Distribute cards
        String playerDeck[][] = distributeCards(deck, players); //Distributing cards to players
        // Print cards
        if (playerDeck != null) {
            printPlayerCards(playerDeck);
        }
        sc.close();
    }
}
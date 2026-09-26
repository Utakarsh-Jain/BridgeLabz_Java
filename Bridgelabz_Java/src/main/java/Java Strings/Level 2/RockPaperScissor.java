/*
Problem 9 - Java String Level 2
Rock-Paper-Scissors is a game played between a minimum of two players. Each player can choose either rock, paper, or scissors. Here the game is played between a user and a computer. Based on the rules, either a player or a computer will win. Show the stats of player and computer win in a tabular format across multiple games. Also, show the winning percentage between the player and the computer.
Hint => 
The rule is: rock-scissors: rock will win (rock crushes scissors); rock-paper: paper wins (paper covers rock); scissors-paper: scissors win (scissors cuts paper)
Create a Method to find the Computer Choice using the Math.random
Create a Method to find the winner between the user and the computer
Create a Method to find the average and percentage of wins for the user and the computer and return a String 2D array
Create a Method to display the results of every game and also display the average and percentage wins 
In the main take user input for the number of games and call methods to display results
Name : Utakarsh Jain
Date : 26-09-2026
*/

import java.util.Scanner;
class RockPaperScissors {
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); // 0 for Rock, 1 for Paper, 2 for Scissors
        if (choice == 0) { // If choice is 0, return Rock
            return "Rock";
        } else if (choice == 1) { // If choice is 1, return Paper
            return "Paper";
        } else { // If choice is 2, return Scissors
            return "Scissors";
        }
    }
    public static String findWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) { // If player choice is equal to computer choice, return Draw
            return "Draw";
        }
        if (playerChoice.equals("Rock") && computerChoice.equals("Scissors") || playerChoice.equals("Paper") && computerChoice.equals("Rock") || playerChoice.equals("Scissors") && computerChoice.equals("Paper")) { // If player choice is Rock and computer choice is Scissors or player choice is Paper and computer choice is Rock or player choice is Scissors and computer choice is Paper, return Player
            return "Player";
        }
        return "Computer"; // Otherwise return Computer
    }
    public static String[][] calculateStatistics(int playerWins, int computerWins, int draws, int totalGames) {
        double playerPercentage = ((double) playerWins / totalGames) * 100; // Calculate player percentage
        double computerPercentage = ((double) computerWins / totalGames) * 100; // Calculate computer percentage
        String statistics[][] = new String[3][3]; // Create a 2D array to store statistics
        statistics[0][0] = "Player";
        statistics[0][1] = String.valueOf(playerWins);
        statistics[0][2] = String.valueOf(playerPercentage);
        statistics[1][0] = "Computer";
        statistics[1][1] = String.valueOf(computerWins);
        statistics[1][2] = String.valueOf(computerPercentage);
        statistics[2][0] = "Draw";
        statistics[2][1] = String.valueOf(draws);
        statistics[2][2] = String.valueOf(((double) draws / totalGames) * 100);
        return statistics;
    }
    public static void displayResults(String statistics[][]) {
        System.out.println("\nResult\tWins\tPercentage");
        for (int i = 0; i < statistics.length; i++) {
            System.out.println(statistics[i][0] + "\t" + statistics[i][1] + "\t" + statistics[i][2] + "%");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int numberOfGames = sc.nextInt();
        int playerWins = 0;
        int computerWins = 0;
        int draws = 0;
        for (int i = 1; i <= numberOfGames; i++) {
            System.out.println("\nGame " + i);
            System.out.print("Enter Rock, Paper, or Scissors: ");
            String playerChoice = sc.next();
            String computerChoice = getComputerChoice();
            String winner = findWinner(playerChoice, computerChoice);
            System.out.println("Computer choice: " + computerChoice);
            System.out.println("Winner: " + winner);
            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            } else {
                draws++;
            }
        }
        String statistics[][] = calculateStatistics(playerWins,computerWins,draws,numberOfGames);
        displayResults(statistics);
        sc.close();
    }
}
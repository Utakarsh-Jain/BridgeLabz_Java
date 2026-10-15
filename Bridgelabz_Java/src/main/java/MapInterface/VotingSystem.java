/*
Design a Voting System
Description: Design a system where:
Votes are stored in a HashMap (Candidate -> Votes).
TreeMap is used to display the results in sorted order.
LinkedHashMap is used to maintain the order of votes.
Name: Utakarsh Jain
Date: 15/10/2026
*/

package main.java.MapInterface;
import java.util.*;
class VotingSystem {
    private HashMap<String, Integer> votes = new HashMap<>(); // hash map to store votes 
    private TreeMap<String, Integer> sortedVotes = new TreeMap<>(); // tree map to store votes in sorted order 
    private LinkedHashMap<String, Integer> insertionOrder = new LinkedHashMap<>(); // hash map to store votes in insertion order 
    public void castVote(String candidate) { // cast vote method
        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1); // put vote in hash map
        sortedVotes.put(candidate, sortedVotes.getOrDefault(candidate, 0) + 1); // put vote in tree map 
        insertionOrder.put(candidate, insertionOrder.getOrDefault(candidate, 0) + 1); // put vote in insertion order 
    }

    public void displayVotesInInsertionOrder() { // display votes in insertion order 
        System.out.println("Votes in Insertion Order:");
        for (Map.Entry<String, Integer> entry : insertionOrder.entrySet()) { // iterate over the votes in insertion order 
            System.out.println(entry.getKey() + ": " + entry.getValue()); // print the votes 
        }
    }

    public void displayVotesSortedByName() { // display votes sorted by name 
        System.out.println("\nVotes Sorted by Name:");
        for (Map.Entry<String, Integer> entry : sortedVotes.entrySet()) { // iterate over the votes sorted by name 
            System.out.println(entry.getKey() + ": " + entry.getValue()); // print the votes 
        }
    }

    public void displayVotesSortedByVotes() { // display votes sorted by votes 
        System.out.println("\nVotes Sorted by Votes:");
        sortedVotes.entrySet().stream() // get the votes in sorted order 
                .sorted(Map.Entry.comparingByValue()) // sort the votes by value 
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue())); // print the votes 
    }

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        votingSystem.castVote("Candidate A");
        votingSystem.castVote("Candidate B");
        votingSystem.castVote("Candidate C");
        votingSystem.castVote("Candidate A");
        votingSystem.castVote("Candidate B");
        votingSystem.castVote("Candidate A");
        votingSystem.displayVotesInInsertionOrder();
        votingSystem.displayVotesSortedByName();
        votingSystem.displayVotesSortedByVotes();
    }
}

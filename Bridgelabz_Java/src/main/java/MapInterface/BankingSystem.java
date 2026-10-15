/*
Implement a Banking System
Description:
HashMap stores customer accounts (AccountNumber -> Balance).
TreeMap sorts customers by balance.
Queue processes withdrawal requests.
Name: Utakarsh Jain
Date: 14/10/2026
*/

package main.java.MapInterface;

import java.util.*;

class BankingSystem {
    private HashMap<String, Double> accounts = new HashMap<>(); // hash map to store accounts 
    private TreeMap<String, Double> sortedAccounts = new TreeMap<>(); // tree map to store accounts sorted by balance 
    private Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>(); // queue to store withdrawal requests 

    static class WithdrawalRequest { // class to store withdrawal requests 
        String accountNumber; // account number 
        double amount; // amount to be withdrawn 

        WithdrawalRequest(String accountNumber, double amount) { // constructor to initialize withdrawal request 
            this.accountNumber = accountNumber; // set account number 
            this.amount = amount; // set amount 
        }
    }

    public void addAccount(String accountNumber, double balance) { // add account method 
        accounts.put(accountNumber, balance); // put account in hash map 
        sortedAccounts.put(accountNumber, balance); // put account in sorted order 
    }

    public void displayAccountsSortedByBalance() { // display accounts sorted by balance 
        System.out.println("Accounts Sorted by Balance:");
        for (Map.Entry<String, Double> entry : sortedAccounts.entrySet()) { // iterate over the accounts sorted by balance 
            System.out.println(entry.getKey() + ": " + entry.getValue()); // print the accounts 
        }
    }

    public void requestWithdrawal(String accountNumber, double amount) { // request withdrawal method 
        withdrawalQueue.offer(new WithdrawalRequest(accountNumber, amount)); // add withdrawal request to the queue 
        System.out.println("Withdrawal request added for account " + accountNumber); // print withdrawal request 
    }

    public void processWithdrawals() { // process withdrawals method 
        System.out.println("\nProcessing Withdrawals:"); // print processing withdrawals 
        while (!withdrawalQueue.isEmpty()) { // iterate over the withdrawal requests 
            WithdrawalRequest request = withdrawalQueue.poll(); // get withdrawal request 
            String accountNumber = request.accountNumber; // get account number 
            double amount = request.amount; // get amount 

            if (accounts.containsKey(accountNumber)) { // check if account exists 
                double currentBalance = accounts.get(accountNumber); // get current balance 

                if (currentBalance >= amount) { // check if current balance is greater than or equal to amount 
                    // Update balance in both maps 
                    double newBalance = currentBalance - amount; // calculate new balance 
                    accounts.put(accountNumber, newBalance); // update balance in hash map 
                    sortedAccounts.put(accountNumber, newBalance); // update balance in tree map 
                    System.out.println("Withdrawn " + amount + " from account " + accountNumber); // print withdrawal 
                } else { // if current balance is less than amount 
                    System.out.println("Insufficient funds for account " + accountNumber); // print insufficient funds 
                }
            } else { // if account does not exist 
                System.out.println("Account " + accountNumber + " not found"); // print account not found 
            }
        }
    }

    public static void main(String[] args) { // main method 
        BankingSystem bank = new BankingSystem(); // create banking system 

        // Add accounts
        bank.addAccount("ACC101", 5000.0);
        bank.addAccount("ACC102", 2000.0);
        bank.addAccount("ACC103", 8000.0);

        bank.displayAccountsSortedByBalance();

        // Request withdrawals
        bank.requestWithdrawal("ACC101", 1000.0);
        bank.requestWithdrawal("ACC102", 3000.0);
        bank.requestWithdrawal("ACC103", 500.0);

        bank.processWithdrawals();

        System.out.println("\nAfter withdrawals:");
        bank.displayAccountsSortedByBalance();
    }
}

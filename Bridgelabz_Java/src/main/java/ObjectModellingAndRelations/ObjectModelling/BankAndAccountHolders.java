/*
Bank and Account Holders (Association)
Description: Model a relationship where a Bank has Customer objects associated with it. A Customer can have multiple bank accounts, and each account is linked to a Bank.
Tasks:
Define a Bank class and a Customer class.
Use an association relationship to show that each customer has an account in a bank.
Implement methods that enable communication, such as openAccount() in the Bank class and viewBalance() in the Customer class.
Goal: Illustrate association by setting up a relationship between customers and the bank.
Name : Utakarsh Jain
Date : 1/10/2026
*/

import java.util.ArrayList;
class Customer {
    private String name;
    private ArrayList<String> accounts; // Array List to store the account number
    public Customer(String name) //Parameterized Constructor
    {
        this.name = name;
        this.accounts = new ArrayList<>();
    }
    public String getName() //Method to get the name
    {
        return name;
    }
    public void addAccount(String accountNumber) //Method to add the account number
    {
        accounts.add(accountNumber);
    }
    public void viewBalance(Bank bank, String accountNumber) //Method to view the balance
    {
        double balance = bank.getBalance(accountNumber);
        System.out.println("Customer: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
class Bank {
    private String bankName;
    private ArrayList<Customer> customers;
    private ArrayList<String> accountNumbers;
    private ArrayList<Double> balances;
    public Bank(String bankName) //Parameterized Constructor
    {
        this.bankName = bankName;
        customers = new ArrayList<>();
        accountNumbers = new ArrayList<>();
        balances = new ArrayList<>();
    }
    public void openAccount(Customer customer, String accountNumber, double initialBalance) //Method to open an account
    {
        customers.add(customer);
        accountNumbers.add(accountNumber);
        balances.add(initialBalance);
        customer.addAccount(accountNumber);
        System.out.println("Account opened successfully for " + customer.getName());
    }
    public double getBalance(String accountNumber) //Method to get the balance
    {
        int index = accountNumbers.indexOf(accountNumber);
        if (index != -1) //Checking if the account number is present in the list
        {
            return balances.get(index);
        }
        return 0;
    }
    public void displayBankDetails() //Method to display the details of the bank
    {
        System.out.println("Bank: " + bankName);
        System.out.println("Number of Accounts: " + accountNumbers.size());
    }
}
public class BankAndAccountHolders 
{
    public static void main(String args[]) //Main method
    {
        Bank bank = new Bank("State Bank"); //Creating a bank object
        Customer customer1 = new Customer("Rahul"); //Creating a customer object
        Customer customer2 = new Customer("Aman");
        bank.openAccount(customer1, "ACC101", 25000);
        bank.openAccount(customer2, "ACC102", 40000);
        System.out.println();
        customer1.viewBalance(bank, "ACC101"); //Viewing the balance of customer 1
        System.out.println();
        customer2.viewBalance(bank, "ACC102"); //Viewing the balance of customer 2
        System.out.println();
        bank.displayBankDetails(); //Displaying the details of the bank
    }
}
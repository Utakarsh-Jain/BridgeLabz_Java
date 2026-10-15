/*
Insurance Policy Management System

Each policy has the following attributes:
● Policy Number (unique identifier)
● Policyholder Name
● Expiry Date
● Coverage Type (e.g., Health, Auto, Home)
● Premium Amount

Requirements:
1. Store Unique Policies: Implement methods to store policies using different
types of sets (HashSet, LinkedHashSet, TreeSet), each serving different
purposes:
 HashSet for quick lookups.
 LinkedHashSet to maintain the order of insertion.
 TreeSet to maintain policies sorted by expiry date.

2. Retrieve Policies: Implement methods to retrieve and display policies based on
certain criteria:
 All unique policies.
 Policies expiring soon (within the next 30 days
 Policies with a specific coverage type.
 Duplicate policies based on policy numbers.

3. Performance Comparison: Compare the performance of HashSet,
LinkedHashSet, and TreeSet in terms of adding, removing, and searching for
policies.
Name : Utakarsh Jain
Date: 14/10/2026

*/

package main.java.Collections.SetInterface;

import java.time.LocalDate;
import java.util.*;

class InsurancePolicy implements Comparable<InsurancePolicy> { // implements comparable interface 
    // instance variables
    int policyNumber; 
    String policyholderName;
    LocalDate expiryDate;
    String coverageType;
    double premiumAmount;

    // constructor
    public InsurancePolicy(int policyNumber, String policyholderName, LocalDate expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }
    @Override
    public boolean equals(Object obj) { // equals method to compare objects 
        if (this == obj)
            return true;
        if (!(obj instanceof InsurancePolicy)) // check if the object is an instance of InsurancePolicy
            return false;
        InsurancePolicy other = (InsurancePolicy) obj;
        return policyNumber == other.policyNumber; // compare policy numbers
    }
    @Override
    public int hashCode() {
        return Objects.hash(policyNumber); // hash code method to compare objects 
    }
    @Override
    public int compareTo(InsurancePolicy other) { // compareTo method to compare objects 
        int result = expiryDate.compareTo(other.expiryDate); // compare expiry dates 
        if (result == 0) { // if expiry dates are equal 
            return Integer.compare(policyNumber, other.policyNumber); // compare policy numbers 
        }
        return result;
    }
    @Override
    public String toString() {
        // to string method to print the object
        return "Policy Number: " + policyNumber + ", Name: " + policyholderName + ", Expiry: " + expiryDate + ", Coverage: " + coverageType + ", Premium: " + premiumAmount;
    }
}

public class InsurancePolicyManagement {
    static HashSet<InsurancePolicy> hashSet = new HashSet<>(); // hash set to store unique policies
    static LinkedHashSet<InsurancePolicy> linkedHashSet = new LinkedHashSet<>(); // linked hash set to store unique policies in the order of insertion
    static TreeSet<InsurancePolicy> treeSet = new TreeSet<>(); // tree set to store unique policies in the order of expiry date
    // Add a policy to all three sets
    static void addPolicy(InsurancePolicy policy) { // add a policy to all three sets 
        if (hashSet.add(policy)) { // add the policy to the hash set 
            linkedHashSet.add(policy); // add the policy to the linked hash set 
            treeSet.add(policy); // add the policy to the tree set 
            System.out.println("Policy added successfully.");
        } else {
            System.out.println("Duplicate policy number: " + policy.policyNumber);
        }
    }
    // Display all unique policies
    static void displayPolicies() {
        System.out.println("\nAll Unique Policies:"); // print all unique policies 
        for (InsurancePolicy policy : hashSet) { // iterate over the hash set 
            System.out.println(policy); // print the policy
        }
    }

    // Display policies expiring within the next 30 days
    static void expiringSoon() {
        LocalDate today = LocalDate.now(); // get the current date 
        LocalDate limit = today.plusDays(30); // get the date after 30 days 

        System.out.println("\nPolicies Expiring Within 30 Days:"); // print the policies expiring within 30 days 

        for (InsurancePolicy policy : treeSet) { // iterate over the tree set 
            if (!policy.expiryDate.isBefore(today) // check if the expiry date is not before the current date 
                    && !policy.expiryDate.isAfter(limit)) { // check if the expiry date is not after the limit date 
                System.out.println(policy); // print the policy
            }
        }
    }

    // Display policies by coverage type
    static void searchByCoverage(String coverage) { // display policies by coverage type 
        System.out.println("\nPolicies with Coverage: " + coverage); // print the policies with coverage type 

        for (InsurancePolicy policy : hashSet) { // iterate over the hash set 
            if (policy.coverageType.equalsIgnoreCase(coverage)) { // check if the coverage type is equal to the coverage type 
                System.out.println(policy); // print the policy
            }
        }
    }

    // Detect duplicate policy numbers
    static void detectDuplicate(InsurancePolicy policy) { // detect duplicate policy numbers 
        if (hashSet.contains(policy)) { // check if the hash set contains the policy 
            System.out.println("\nDuplicate policy number found: " // print the duplicate policy number 
                    + policy.policyNumber); // print the policy number 
        } else { // if the hash set does not contain the policy 
            System.out.println("\nNo duplicate found for policy number: " // print the no duplicate found for policy number 
                    + policy.policyNumber); // print the policy number
        }
    }

    // Compare adding, searching and removing performance
    static void comparePerformance() {
        int count = 10000;

        Set<InsurancePolicy> hash = new HashSet<>(); // hash set to store unique policies 
        Set<InsurancePolicy> linked = new LinkedHashSet<>(); // linked hash set to store unique policies in the order of insertion 
        Set<InsurancePolicy> tree = new TreeSet<>(); // tree set to store unique policies in the order of expiry date 

        List<InsurancePolicy> policies = new ArrayList<>(); // array list to store unique policies 

        for (int i = 1; i <= count; i++) { // loop to add policies to the array list 
            policies.add(new InsurancePolicy(i,"User" + i,LocalDate.now().plusDays(i % 365),"Health",5000.0));
        }

        List<Set<InsurancePolicy>> sets = Arrays.asList(hash, linked, tree);
        String[] names = {"HashSet", "LinkedHashSet", "TreeSet"};
        for (int i = 0; i < sets.size(); i++) {
            // Measure adding
            long start = System.nanoTime();

            for (InsurancePolicy policy : policies) {
                sets.get(i).add(policy);
            }

            long addTime = System.nanoTime() - start;

            // Measure searching
            start = System.nanoTime();

            for (InsurancePolicy policy : policies) {
                sets.get(i).contains(policy);
            }

            long searchTime = System.nanoTime() - start;

            // Measure removing
            start = System.nanoTime();

            for (InsurancePolicy policy : policies) {
                sets.get(i).remove(policy);
            }

            long removeTime = System.nanoTime() - start;

            System.out.println("\n" + names[i] + " Performance:");
            System.out.println("Adding: " + addTime + " ns");
            System.out.println("Searching: " + searchTime + " ns");
            System.out.println("Removing: " + removeTime + " ns");
        }
    }

    public static void main(String[] args) {

        // Add policies
        addPolicy(new InsurancePolicy(
                101, "Rahul",
                LocalDate.now().plusDays(10),
                "Health", 5000
        ));

        addPolicy(new InsurancePolicy(
                102, "Priya",
                LocalDate.now().plusDays(45),
                "Auto", 7000
        ));

        addPolicy(new InsurancePolicy(
                103, "Amit",
                LocalDate.now().plusDays(20),
                "Home", 6000
        ));

        addPolicy(new InsurancePolicy(
                104, "Sneha",
                LocalDate.now().plusDays(5),
                "Health", 4500
        ));

        // Attempt to add a duplicate policy number
        addPolicy(new InsurancePolicy(
                101, "Rahul Sharma",
                LocalDate.now().plusDays(60),
                "Auto", 8000
        ));

        // Display all unique policies
        displayPolicies();
        // Display policies in insertion order
        System.out.println("\nPolicies in Insertion Order:");
        for (InsurancePolicy policy : linkedHashSet) {
            System.out.println(policy);
        }
        // Display policies sorted by expiry date
        System.out.println("\nPolicies Sorted by Expiry Date:");
        for (InsurancePolicy policy : treeSet) {
            System.out.println(policy);
        }
        // Display policies expiring within 30 days
        expiringSoon();
        // Search policies by coverage type
        searchByCoverage("Health");
        // Check duplicate policy number
        detectDuplicate(new InsurancePolicy(101, "Test",LocalDate.now(),"Auto", 1000));
        // Compare collection performance
        comparePerformance();
    }
}
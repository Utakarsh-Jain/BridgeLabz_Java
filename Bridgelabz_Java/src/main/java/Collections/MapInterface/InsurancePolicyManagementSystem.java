/*
Insurance Policy Management System

Build a system for managing insurance policies where you have to:
Store and manage policies with unique identifiers.
Retrieve and manipulate policies based on different criteria.
Track policies by various attributes such as policyholder name and expiry date.

Requirements:
1. Store Policies in a Map:
Use HashMap to store policies with policy numbers as keys and policy
details as values.
Use LinkedHashMap to maintain the insertion order of policies.
Use TreeMap to store policies sorted by expiry date.

2. Retrieve and Manipulate Policies:
Implement methods to:
Retrieve a policy by its number.
List all policies expiring within the next 30 days.
List all policies for a specific policyholder.
Remove policies that are expired.

Name: Utakarsh Jain
Date: 14/10/2026
*/

package main.java.Collections.MapInterface;

import java.time.LocalDate;
import java.util.*;

class InsurancePolicy {
    private String policyNumber;
    private String policyholderName;
    private LocalDate expiryDate;

    public InsurancePolicy(String policyNumber, String policyholderName, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
    }

    public String getPolicyNumber() { // get policy number
        return policyNumber;
    }

    public String getPolicyholderName() { // get policy holder name
        return policyholderName;
    }

    public LocalDate getExpiryDate() { // get expiry date
        return expiryDate;
    }

    @Override
    public String toString() { // to string method
        return "Policy Number: " + policyNumber + ", Policyholder: " + policyholderName + ", Expiry Date: " + expiryDate;
    }
}

public class InsurancePolicyManagementSystem {
    private HashMap<String, InsurancePolicy> policies = new HashMap<>(); // hash map to store policies 
    private LinkedHashMap<String, InsurancePolicy> insertionOrder = new LinkedHashMap<>(); // hash map to store policies in insertion order 
    private TreeMap<LocalDate, List<InsurancePolicy>> expiryOrder = new TreeMap<>(); // hash map to store policies sorted by expiry date

    // Add a policy to all three maps
    public void addPolicy(InsurancePolicy policy) { // add policy to all three maps
        String number = policy.getPolicyNumber();
        if (policies.containsKey(number)) {
            System.out.println("Policy number already exists: " + number);
            return;
        }
        policies.put(number, policy);
        insertionOrder.put(number, policy); // put policy in insertion order 
        expiryOrder.computeIfAbsent(policy.getExpiryDate(), k -> new ArrayList<>()).add(policy); // put policy in expiry order 
    }

    // Retrieve a policy using its policy number
    public InsurancePolicy getPolicy(String policyNumber) { // get policy using its policy number
        return policies.get(policyNumber);
    }

    // Display policies in insertion order
    public void displayPoliciesInInsertionOrder() { // display policies in insertion order 
        for (InsurancePolicy policy : insertionOrder.values()) { // iterate over the policies in insertion order 
            System.out.println(policy); // print the policies 
        } 
    }

    // Display policies sorted by expiry date
    public void displayPoliciesByExpiryDate() { // display policies sorted by expiry date 
        for (List<InsurancePolicy> list : expiryOrder.values()) { // iterate over the policies sorted by expiry date 
            for (InsurancePolicy policy : list) { // iterate over the policies 
                System.out.println(policy); // print the policies 
            }
        }
    }

    // Find policies expiring within the next 30 days
    public List<InsurancePolicy> getPoliciesExpiringSoon() { // find policies expiring within the next 30 days 
        LocalDate today = LocalDate.now(); // get today's date 
        LocalDate limit = today.plusDays(30); // get the limit of 30 days from today 

        List<InsurancePolicy> result = new ArrayList<>(); // create a list to store the policies 

        for (InsurancePolicy policy : policies.values()) { // iterate over the policies 
            LocalDate expiry = policy.getExpiryDate(); // get the expiry date of the policy 

            if (!expiry.isBefore(today) && !expiry.isAfter(limit)) { // check if the expiry date is within the limit 
                result.add(policy); // add the policy to the result list 
            }
        }

        return result; // return the result list 
    }

    // Find policies belonging to a specific policyholder
    public List<InsurancePolicy> getPoliciesByHolder(String name) { // find policies belonging to a specific policyholder 
        List<InsurancePolicy> result = new ArrayList<>(); // create a list to store the policies 

        for (InsurancePolicy policy : policies.values()) { // iterate over the policies 
            if (policy.getPolicyholderName().equalsIgnoreCase(name)) { // check if the policyholder name is equal to the given name 
                result.add(policy); // add the policy to the result list 
            }
        }

        return result;
    }

    // Remove expired policies from all three maps
    public void removeExpiredPolicies() { // remove expired policies from all three maps 
        LocalDate today = LocalDate.now(); // get today's date 

        Iterator<Map.Entry<String, InsurancePolicy>> iterator = 
                policies.entrySet().iterator(); // iterate over the policies in the hash map 

        while (iterator.hasNext()) { // iterate over the policies in the hash map 
            InsurancePolicy policy = iterator.next().getValue(); // get the policy from the hash map 

            if (policy.getExpiryDate().isBefore(today)) { // check if the expiry date is before today 
                iterator.remove(); // remove the policy from the hash map 
                insertionOrder.remove(policy.getPolicyNumber()); // remove the policy from the insertion order hash map 

                List<InsurancePolicy> list = expiryOrder.get(policy.getExpiryDate()); // get the list of policies with the same expiry date 
                list.remove(policy); // remove the policy from the list 

                if (list.isEmpty()) { // check if the list is empty 
                    expiryOrder.remove(policy.getExpiryDate()); // remove the expiry date from the expiry order hash map 
                }
            }
        }
    }

    public static void main(String[] args) { // main method 
        InsurancePolicyManagementSystem system = new InsurancePolicyManagementSystem(); // create an instance of the system 

        system.addPolicy(new InsurancePolicy("P101", "Rahul Sharma", LocalDate.now().plusDays(10))); // add a policy to the system 

        system.addPolicy(new InsurancePolicy("P102", "Priya Verma", LocalDate.now().plusDays(45))); // add a policy to the system 

        system.addPolicy(new InsurancePolicy("P103", "Rahul Sharma", LocalDate.now().minusDays(5))); // add a policy to the system 

        system.addPolicy(new InsurancePolicy("P104", "Amit Kumar", LocalDate.now().plusDays(25))); // add a policy to the system 

        System.out.println("Policy by Number:"); // print policy by number 
        System.out.println(system.getPolicy("P101")); // print the policy with the given policy number 

        System.out.println("\\nPolicies in Insertion Order:"); // print policies in insertion order 
        system.displayPoliciesInInsertionOrder();

        System.out.println("\\nPolicies Sorted by Expiry Date:");
        system.displayPoliciesByExpiryDate();

        System.out.println("\\nPolicies Expiring Within 30 Days:");
        for (InsurancePolicy policy : system.getPoliciesExpiringSoon()) {
            System.out.println(policy);
        }

        System.out.println("\\nPolicies of Rahul Sharma:");
        for (InsurancePolicy policy : system.getPoliciesByHolder("Rahul Sharma")) {
            System.out.println(policy);
        }

        system.removeExpiredPolicies();

        System.out.println("\\nPolicies After Removing Expired Policies:");
        system.displayPoliciesInInsertionOrder();
    }
}
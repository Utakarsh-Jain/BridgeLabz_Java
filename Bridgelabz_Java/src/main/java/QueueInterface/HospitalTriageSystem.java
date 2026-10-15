/*

Hospital Triage System
Simulate a hospital triage system using a PriorityQueue where patients with higher severity are treated first.
Example:
Patients: [("John", 3), ("Alice", 5), ("Bob", 2)] → Order: Alice, John, Bob.
Name : Utakarsh Jain
Date: 14/10/2026

*/

package main.java.QueueInterface;
import java.util.PriorityQueue;
import java.util.Comparator;

public class HospitalTriageSystem {
    
    public static void main(String[] args) {

        // PriorityQueue sorted by severity (descending)
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>(
            new Comparator<Patient>() {
                @Override
                public int compare(Patient p1, Patient p2) { 
                    return Integer.compare(p2.severity, p1.severity); // higher first
                }
            }
        );

        triageQueue.add(new Patient("John", 3));
        triageQueue.add(new Patient("Alice", 5));
        triageQueue.add(new Patient("Bob", 2));
        triageQueue.add(new Patient("Sara", 5));

        System.out.println("Hospital Triage System");

        while (!triageQueue.isEmpty()) { // check if the queue is not empty 
            Patient next = triageQueue.poll(); // remove the patient with the highest severity from the queue 
            System.out.println("Treating: " + next.name + " (Severity: " + next.severity + ")"); // print the patient with the highest severity 
        }
    }
}

class Patient {
    String name;
    int severity;

    Patient(String name, int severity) { // create a new patient
        this.name = name;
        this.severity = severity; // store the severity of the patient
    }

    @Override
    public String toString() { // convert the patient to a string 
        return name;
    }
}

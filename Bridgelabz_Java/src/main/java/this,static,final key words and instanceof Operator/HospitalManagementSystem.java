/*

Hospital Management System
Create a Patient class with the following features:
Static:
A static variable hospitalName shared among all patients.
A static method getTotalPatients() to count the total patients admitted.
This:
Use this to initialize name, age, and ailment in the constructor.
Final:
Use a final variable patientID to uniquely identify each patient.
Instanceof:
Check if an object is an instance of the Patient class before displaying its details.
Name : Utakarsh Jain
Date : 30/09/2026
*/

import java.util.Scanner;
class Patient { //Class to manage patient details
    static String hospitalName; 
    static int totalPatients = 0; 
    String name; 
    final int patientID; 
    int age; 
    String ailment;
    Patient(String name, int patientID, int age, String ailment) { //Parameterized Constructor
        this.name = name; //Using 'this' keyword to resolve ambiguity
        this.patientID = patientID;
        this.age = age;
        this.ailment = ailment;
        totalPatients++; //Incrementing the total number of patients
    }
    static void displayTotalPatients() { //Displaying the total number of patients
        System.out.println("Total Patients: " + totalPatients);
    }
    void displayDetails() { //Displaying the patient details
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Patient Name: " + name);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }
    public static void main(String args[]) { //Main method
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Hospital Name:");
        Patient.hospitalName = sc.nextLine(); //Setting the hospital name
        System.out.println("Enter Patient Details:");
        System.out.print("Enter Patient Name:");
        String name = sc.nextLine();
        System.out.print("Enter Patient ID:");
        int patientID = sc.nextInt();
        System.out.print("Enter Age:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Ailment:");
        String ailment = sc.nextLine();
        Patient p1 = new Patient(name, patientID, age, ailment); //Creating an object of Patient class
        if(p1 instanceof Patient) { //Checking if the object is an instance of Patient class
            System.out.println("\nPatient Details:");
            p1.displayDetails();
        }
        System.out.println();
        Patient.displayTotalPatients(); //Displaying the total number of patients
        sc.close();
    }
}
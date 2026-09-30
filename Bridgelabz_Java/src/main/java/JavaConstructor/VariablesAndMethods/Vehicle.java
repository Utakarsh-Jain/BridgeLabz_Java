/*
Problem 3 : Variables and methods
Vehicle Registration
Create a Vehicle class to manage the details of vehicles:
Instance Variables: ownerName, vehicleType.
Class Variable: registrationFee (fixed for all vehicles).
Methods:
An instance method displayVehicleDetails() to display owner and vehicle details.
A class method updateRegistrationFee() to change the registration fee.
Name : Utakarsh Jain
Date : 30/09/2026

*/

package main.java.JavaConstructor.VariablesAndMethods;

import java.util.*;

public class Vehicle {
    String ownerName;
    String vehicleType;
    static int registrationFee;
    Vehicle(String ownerName, String vehicleType) { // Parameterized Constructor
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        registrationFee = 1000; // Default value for registrationFee
    }
    void displayVehicleDetails() { // Instance method to display the details of a vehicle
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }
    static void updateRegistrationFee(int registrationFee) { // Class method to update the registration fee
        Vehicle.registrationFee = registrationFee;
    }
    public static void main(String[] args) { // Main method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vehicles");
        int n = sc.nextInt();
        Vehicle vehicles[] = new Vehicle[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the owner name");
            String ownerName = sc.next();
            System.out.println("Enter the vehicle type");
            String vehicleType = sc.next();
            vehicles[i] = new Vehicle(ownerName, vehicleType);
        }
        for (int i = 0; i < n; i++) {
            vehicles[i].displayVehicleDetails();
        }
        System.out.println("Enter the new registration fee");
        int registrationFee = sc.nextInt();
        Vehicle.updateRegistrationFee(registrationFee);
        for (int i = 0; i < n; i++) {
            vehicles[i].displayVehicleDetails();
        }
        sc.close();
    }
}

/*

6: Vehicle Registration System
Create a Vehicle class with the following features:
Static:
A static variable registrationFee common for all vehicles.
A static method updateRegistrationFee() to modify the fee.
This:
Use this to initialize ownerName, vehicleType, and registrationNumber in the constructor.
Final:
Use a final variable registrationNumber to uniquely identify each vehicle.
Instanceof:
Check if an object belongs to the Vehicle class before displaying its registration details.
Name : Utakarsh Jain
Date : 30/09/2026
*/

import java.util.Scanner;
class Vehicle { //Class to manage vehicle details
    static double registrationFee = 5000.0;
    static int totalVehicles = 0; 
    String  ownerName; 
    final String registrationNumber; 
    String vehicleType; 
    Vehicle(String ownerName, String registrationNumber, String vehicleType) { //Parameterized Constructor
        this.ownerName = ownerName; //Using 'this' keyword to resolve ambiguity
        this.registrationNumber = registrationNumber;
        this.vehicleType = vehicleType;
        totalVehicles++; //Incrementing the total number of vehicles
    }
    static void updateRegistrationFee(double registrationFee) { //Updating the registration fee
        Vehicle.registrationFee = registrationFee;
    }
    void displayDetails() { //Displaying the vehicle details
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }
    public static void main(String args[]) { //Main method
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Vehicle Details:");
        System.out.print("Enter Owner Name:");
        String ownerName = sc.nextLine();
        System.out.print("Enter Registration Number:");
        String registrationNumber = sc.nextLine();
        System.out.print("Enter Vehicle Type: ");
        String vehicleType = sc.nextLine();
        Vehicle v1 = new Vehicle(ownerName, registrationNumber, vehicleType); //Creating an object of Vehicle class
        if(v1 instanceof Vehicle) { //Checking if the object is an instance of Vehicle class
            System.out.println("\nVehicle Details:");
            v1.displayDetails();
        }
        System.out.println();
        System.out.println("Updating Registration Fee...");
        System.out.print("Enter New Registration Fee: ");
        double newFee = sc.nextDouble();
        Vehicle.updateRegistrationFee(newFee); //Updating the registration fee
        v1.displayDetails();
        System.out.println();
        System.out.println("Total Vehicles: " + totalVehicles);
        sc.close();
    }
}
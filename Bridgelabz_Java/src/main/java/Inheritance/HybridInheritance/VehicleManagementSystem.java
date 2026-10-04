/*

Vehicle Management System with Hybrid Inheritance
Description: Model a vehicle system where Vehicle is the superclass and ElectricVehicle and PetrolVehicle are subclasses. Additionally, create a Refuelable interface implemented by PetrolVehicle.
Tasks:
Define a superclass Vehicle with attributes like maxSpeed and model.
Create an interface Refuelable with a method refuel().
Define subclasses ElectricVehicle and PetrolVehicle. PetrolVehicle should implement Refuelable, while ElectricVehicle include a charge() method.
Goal: Use hybrid inheritance by having PetrolVehicle implement both Vehicle and Refuelable, demonstrating how Java interfaces allow adding multiple behaviors.
Name: Utakarsh Jain
Date: 3/10/2026
*/
package main.java.Inheritance.HybridInheritance;
class Vehicle{ //Base class
    int maxSpeed;
    String model;
    Vehicle(int maxSpeed , String model){ //Parameterized constructor for Vehicle
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
    void displayDetails(){ //Method to display Vehicle details
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Model: " + model);
    }
}
interface Refuelable{ //Interface
    void refuel(); //Method to refuel
}
class ElectricVehicle extends Vehicle{ //Child class
    int batteryCapacity;
    ElectricVehicle(int maxSpeed , String model , int batteryCapacity){ //Parameterized constructor for ElectricVehicle
        super(maxSpeed, model); //call to the parent class
        this.batteryCapacity = batteryCapacity;
    }
    void displayDetails(){ //Method to display ElectricVehicle details
        super.displayDetails(); //call to the parent class method
        System.out.println("Battery Capacity: " + batteryCapacity);
    }
}
class PetrolVehicle extends Vehicle implements Refuelable{ //Child class
    int fuelCapacity;
    PetrolVehicle(int maxSpeed , String model , int fuelCapacity){ //Parameterized constructor for PetrolVehicle
        super(maxSpeed, model); //call to the parent class
        this.fuelCapacity = fuelCapacity;
    }
    void displayDetails(){ //Method to display PetrolVehicle details
        super.displayDetails(); //call to the parent class method
        System.out.println("Fuel Capacity: " + fuelCapacity);
    }
    public void refuel(){ //Method to refuel
        System.out.println("PetrolVehicle is refueling");
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) { //Main method
        ElectricVehicle electricVehicle = new ElectricVehicle(200, "Tesla", 100); //Creating an object of ElectricVehicle class
        PetrolVehicle petrolVehicle = new PetrolVehicle(200, "Toyota", 50); //Creating an object of PetrolVehicle class
        electricVehicle.displayDetails(); //Displaying the electric vehicle details
        petrolVehicle.displayDetails(); //Displaying the petrol vehicle details
        petrolVehicle.refuel(); //Displaying the petrol vehicle refuel method
    }
}

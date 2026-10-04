/*

Vehicle and Transport System
Description: Design a vehicle hierarchy where Vehicle is the superclass, and Car, Truck, and Motorcycle are subclasses with unique attributes.
Tasks:
Define a superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo().
Define subclasses Car, Truck, and Motorcycle, each with additional attributes, such as seatCapacity for Car.
Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and calling displayInfo() on each.
Goal: Understand how inheritance helps in organizing shared and unique features across subclasses and use polymorphism for dynamic method calls.
Name : Utakarsh Jain
Date : 2/10/26

*/

package main.java.Inheritance.AssistedProblems;
class Vehicle { //Base class Vehicle
    int maxSpeed;
    String fuelType;
    Vehicle(int maxSpeed , String fuelType){ //Parameterized constructor for Vehicle
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    void displayInfo(){ //Method to display Vehicle information
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
    }
}   
class Car extends Vehicle { //Child class Car
    int seatCapacity;
    Car(int maxSpeed , String fuelType , int seatCapacity){ //Parameterized constructor for Car
        super(maxSpeed, fuelType); //call to the parent class
        this.seatCapacity = seatCapacity;
    }
    @Override //Method overriding
    void displayInfo(){ //Method to display Car information
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}
class Truck extends Vehicle { //Child class Truck
    int payloadCapacity;
    Truck(int maxSpeed , String fuelType , int payloadCapacity){ //Parameterized constructor for Truck
        super(maxSpeed, fuelType); //call to the parent class
        this.payloadCapacity = payloadCapacity;
    }
    @Override //Method overriding
    void displayInfo(){ //Method to display Truck information
        super.displayInfo();
        System.out.println("Payload Capacity: " + payloadCapacity);
    }
}
class Motorcycle extends Vehicle { //Child class Motorcycle
    int gearCount;
    Motorcycle(int maxSpeed , String fuelType , int gearCount){ //Parameterized constructor for Motorcycle
        super(maxSpeed, fuelType); //call to the parent class
        this.gearCount = gearCount;
    }
    @Override //Method overriding
    void displayInfo(){ //Method to display Motorcycle information
        super.displayInfo();
        System.out.println("Gear Count: " + gearCount);
    }
}

public class VehicleAndTransportSystem { //Main class
    public static void main(String[] args) { //Main method
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car(180, "Petrol", 5);   
        vehicles[1] = new Truck(120, "Diesel", 10);  
        vehicles[2] = new Motorcycle(150, "Petrol", 6);
        for(Vehicle vehicle : vehicles){ //Enhanced for loop
            vehicle.displayInfo();
            System.out.println();
        }
    } 
} 
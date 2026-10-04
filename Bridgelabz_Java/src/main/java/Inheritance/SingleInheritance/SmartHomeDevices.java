/*
Sample Problem 2: Smart Home Devices
Description: Create a hierarchy for a smart home system where Device is the superclass and Thermostat is a subclass.
Tasks:
Define a superclass Device with attributes like deviceId and status.
Create a subclass Thermostat with additional attributes like temperatureSetting.
Implement a method displayStatus() to show each device's current settings.
Goal: Understand single inheritance by adding specific attributes to a subclass, keeping the superclass general.
Name : Utakarsh Jain
Date : 3/10/2026
*/

package main.java.Inheritance.SingleInheritance;
class Device {
    String deviceId;
    String status;
    Device(String deviceId, String status){ //Parameterized Constructor to initialize parent class variables
        this.deviceId=deviceId;
        this.status=status;
    }
    void displayStatus(){ //Method to display device status
        System.out.println("Device ID: "+deviceId);
        System.out.println("Status: "+status);
    }
}

class Thermostat extends Device{ //Class Thermostat extends the class Device
    int temperatureSetting;
    Thermostat(String deviceId, String status, int temperatureSetting){ //Parameterized Constructor to initialize child class variables
        super(deviceId,status); //Calls the parameterized constructor of the parent class
        this.temperatureSetting=temperatureSetting;
    }
    void displayThermostatInfo(){ //Method to display thermostat information
        System.out.println("Temperature Setting: "+temperatureSetting);
    }
}
public class SmartHomeDevices { //Main method to demonstrate single inheritance
    public static void main(String[] args){ //Main method
        Thermostat thermostat=new Thermostat("Thermostat1","On",22); //Initializing an object of class thermostat
        thermostat.displayStatus(); //Displaying device status
        thermostat.displayThermostatInfo(); //Displaying thermostat information
    }
}

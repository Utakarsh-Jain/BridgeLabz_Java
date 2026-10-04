/*
1: Restaurant Management System with Hybrid Inheritance
Description: Model a restaurant system where Person is the superclass and Chef and Waiter are subclasses. Both Chef and Waiter should implement a Worker interface that requires a performDuties() method.
Tasks:
Define a superclass Person with attributes like name and id.
Create an interface Worker with a method performDuties().
Define subclasses Chef and Waiter that inherit from Person and implement the Worker interface, each providing a unique implementation of performDuties().
Goal: Practice hybrid inheritance by combining inheritance and interfaces, giving multiple behaviors to the same objects.
Name : Utakarsh Jain
Date : 3/10/2026

*/
package main.java.Inheritance.HybridInheritance;
class Person{ //Base class
    String name;
    int id;
    Person(String name , int id){ //Parameterized constructor for Person
        this.name = name;
        this.id = id;
    }
    void displayDetails(){ //Method to display Person details
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
interface Worker{ //Interface
    void performDuties(); //Method to perform duties
}
class Chef extends Person implements Worker{ //Child class
    Chef(String name , int id){ //Parameterized constructor for Chef
        super(name, id); //call to the parent class
    }
    void displayDetails(){ //Method to display Chef details
        super.displayDetails(); //call to the parent class method
    }
    public void performDuties(){ //Method to perform duties
        System.out.println("Chef is cooking food");
    }
}
class Waiter extends Person implements Worker{ //Child class
    Waiter(String name , int id){ //Parameterized constructor for Waiter
        super(name, id); //call to the parent class
    }
    void displayDetails(){ //Method to display Waiter details
        super.displayDetails(); //call to the parent class method
    }
    public void performDuties(){ //Method to perform duties
        System.out.println("Waiter is serving food");
    }
}



public class ResturantManagement {
    public static void main(String[] args) { //Main method
        Chef chef = new Chef("John", 1); //Creating an object of Chef class
        Waiter waiter = new Waiter("Jane", 2); //Creating an object of Waiter class
        chef.displayDetails(); //Displaying the chef details
        waiter.displayDetails(); //Displaying the waiter details
        chef.performDuties(); //Displaying the chef duties
        waiter.performDuties(); //Displaying the waiter duties
    }
}

/*
Smart Warehouse Management System
Concepts: Generic Classes, Bounded Type Parameters, Wildcards
Problem Statement:
You are developing a Smart Warehouse System that manages different types of items like Electronics, Groceries, and Furniture. The system should be able to store and retrieve items dynamically while maintaining type safety.
Hints:
Create an abstract class WarehouseItem that all items extend (Electronics, Groceries, Furniture).
Implement a generic class Storage<T extends WarehouseItem> to store items safely.
Implement a wildcard method to display all items in storage regardless of their type (List<? extends WarehouseItem>).
Name: Utakarsh Jain
Date: 15/10/2026
*/

package main.java.JavaGenerics;

abstract class WarehouseItem {
    protected String itemName;
    protected double weight;
    public WarehouseItem(String itemName, double weight) {
        this.itemName = itemName;
        this.weight = weight;
    }
    public String getItemName() { return itemName; }
    public double getWeight() { return weight; }
    @Override public String toString() { return itemName + " (" + weight + "kg)"; }
}
class Electronics extends WarehouseItem { // electronics items
    public Electronics(String itemName, double weight) { super(itemName, weight); } // constructor
}
class Groceries extends WarehouseItem { // groceries items
    public Groceries(String itemName, double weight) { super(itemName, weight); } // constructor
}
class Furniture extends WarehouseItem { // furniture items
    public Furniture(String itemName, double weight) { super(itemName, weight); } // constructor
}
class Storage<T extends WarehouseItem> { // generic class to store items 
    private java.util.ArrayList<T> items = new java.util.ArrayList<>(); // array list to store items
    public void addItem(T item) { items.add(item); } // add item method
    public T getItem(int index) { return items.get(index); } // get item method
    public java.util.ArrayList<T> getAllItems() { return items; }
    public void displayAllItems() { // display all items method
        for (T item : items) { // iterate over the items 
            System.out.println(item); // print the items 
        }
    }
}

public class SmartWareHouseManagementSystem { // main class 
    public static void displayAllItems(java.util.List<? extends WarehouseItem> list) { // display all items method 
        System.out.println("All Items in Storage:"); // print all items 
        for (WarehouseItem item : list) { // iterate over the items 
            System.out.println(item); // print the items 
        }
    }
    public static void main(String[] args) { // main method 
        Storage<Electronics> electronicsStorage = new Storage<>(); // create electronics storage 
        electronicsStorage.addItem(new Electronics("Laptop", 2.5)); // add electronics items 
        electronicsStorage.addItem(new Electronics("Mobile", 0.3)); // add electronics items 
        Storage<Groceries> groceriesStorage = new Storage<>(); // create groceries storage 
        groceriesStorage.addItem(new Groceries("Apple", 1.0)); // add groceries items 
        groceriesStorage.addItem(new Groceries("Banana", 0.5)); // add groceries items 
        Storage<Furniture> furnitureStorage = new Storage<>(); // create furniture storage 
        furnitureStorage.addItem(new Furniture("Chair", 15.0)); // add furniture items 
        furnitureStorage.addItem(new Furniture("Table", 25.0)); // add furniture items 
        // Display items using wildcard method
        displayAllItems(electronicsStorage.getAllItems()); // display all items 
        displayAllItems(groceriesStorage.getAllItems()); // display all items 
        displayAllItems(furnitureStorage.getAllItems()); // display all items 
    }
}

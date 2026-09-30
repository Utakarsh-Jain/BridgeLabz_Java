/*
Problem 4 : Java Class And Object Level 1
Program to Track Inventory of Items
Problem Statement: Create an Item class with attributes itemCode, itemName, and price. Add a method to display item details and calculate the total cost for a given quantity.
Name : Utakarsh Jain
Date : 29/09/2026

*/

import java.util.Scanner;

class Item {
    int itemCode;
    String itemName; 
    double price;
    void displayItem() { //Method to display the details of the items
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + price);
    }
    double calculateTotalCost(int quantity) { //Method to calculate the total cost of the item
        return price * quantity;
    }
}
public class InventoryTracking{
    public static void main(String args[]) {
        Item item = new Item(); //Initializing the object of the class item
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the item code: ");
        item.itemCode = sc.nextInt();
        System.out.print("Enter the item name: ");
        item.itemName = sc.nextLine();
        System.out.print("Enter the price of the item: ");
        item.price = sc.nextDouble(); 
        item.displayItem(); //calling the display method to print the details
        System.out.println("Total Cost: " + item.calculateTotalCost(10)); //calling the calculateTotalCost method to print the total cost
        sc.close();
    }
}
/*

Program to Simulate a Shopping Cart
Problem Statement: Create a CartItem class with attributes itemName, price, and quantity. Add methods to:
Add an item to the cart.
Remove an item from the cart.
Display the total cost.
Explanation: The CartItem class models a shopping cart item. The methods handle cart operations like adding or removing items and calculating the total cost.

Name: Utakarsh Jain
Date: 29/09/2026

*/

import java.util.Scanner;
class CartItem {
    String itemName;
    double price;
    int quantity;
    void addItem(String itemName, double price, int quantity) { // Method to add items to the cart
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    void removeItem() { //Method to remove items from the cart
        this.itemName = null;
        this.price = 0;
        this.quantity = 0;
    }
    void displayTotalCost() { //Method to display the total cost of the items in the cart
        System.out.println("Total cost: " + (price * quantity));
    }
}
public class ShoppingCart {
    public static void main(String[] args) {
        CartItem cartItem = new CartItem();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the item name: ");
        cartItem.itemName = sc.nextLine();
        System.out.print("Enter the price: ");
        cartItem.price = sc.nextDouble();
        System.out.print("Enter the quantity: ");
        cartItem.quantity = sc.nextInt();
        cartItem.displayTotalCost();
        sc.close();
    }
}
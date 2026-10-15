/*
Implement a Shopping Cart
Description:
Use HashMap to store product prices.
Use LinkedHashMap to maintain the order of items added.
Use TreeMap to display items sorted by price.
Name: Utakarsh Jain
Date: 14/10/2026
*/

package main.java.MapInterface;

import java.util.*;

class ShoppingCart {
    private HashMap<String, Double> prices = new HashMap<>(); // hash map to store prices 
    private LinkedHashMap<String, Double> insertionOrder = new LinkedHashMap<>(); // hash map to store prices in insertion order 
    private TreeMap<String, Double> sortedByPrice = new TreeMap<>(); // tree map to store prices sorted by price 

    public void addProduct(String product, double price) { // add product method
        prices.put(product, price); // put product in hash map
        insertionOrder.put(product, price); // put product in insertion order
        sortedByPrice.put(product, price); // put product in sorted order
    }

    public void removeProduct(String product) { // remove product method
        prices.remove(product); // remove product from hash map
        insertionOrder.remove(product); // remove product from insertion order
        sortedByPrice.remove(product); // remove product from sorted order
    }

    public double getPrice(String product) { // get price method
        return prices.getOrDefault(product, 0.0); // get price of the product
    }

    public void displayProductsInInsertionOrder() { // display products in insertion order 
        System.out.println("Products in Insertion Order:");
        for (Map.Entry<String, Double> entry : insertionOrder.entrySet()) { // iterate over the products in insertion order 
            System.out.println(entry.getKey() + ": " + entry.getValue()); // print the products 
        }
    }

    public void displayProductsSortedByPrice() { // display products sorted by price 
        System.out.println("\nProducts Sorted by Price:");
        for (Map.Entry<String, Double> entry : sortedByPrice.entrySet()) { // iterate over the products sorted by price 
            System.out.println(entry.getKey() + ": " + entry.getValue()); // print the products 
        }
    }

    public double calculateTotalPrice() { // calculate total price
        return prices.values().stream().mapToDouble(Double::doubleValue).sum();
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Apple", 1.0);
        cart.addProduct("Banana", 0.5);
        cart.addProduct("Orange", 0.75);
        cart.addProduct("Milk", 2.0);

        cart.displayProductsInInsertionOrder();
        cart.displayProductsSortedByPrice();
        System.out.println("\nTotal Price: " + cart.calculateTotalPrice());

        cart.removeProduct("Banana");
        System.out.println("\nAfter removing Banana:");
        cart.displayProductsInInsertionOrder();
    }
}

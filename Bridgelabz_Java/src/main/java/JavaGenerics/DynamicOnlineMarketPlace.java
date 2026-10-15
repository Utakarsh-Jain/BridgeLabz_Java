/*
Dynamic Online Marketplace
Concepts: Type Parameters, Generic Methods, Bounded Type Parameters
Problem Statement:
Build a generic product catalog for an online marketplace that supports various product types like Books, Clothing, and Gadgets. Each product type has a specific price range and category.
Hints:
Define a generic class Product<T> where T is restricted to a category (BookCategory, ClothingCategory, etc.).
Implement a generic method to apply discounts dynamically (<T extends Product> void applyDiscount(T product, double percentage)).
Ensure type safety while allowing multiple product categories to exist in the same catalog.
Name: Utakarsh Jain
Date: 15/10/2026


*/
package main.java.JavaGenerics;

abstract class Product<T> { // abstract class to store products 
    protected String name; // product name 
    protected double price; // product price 
    protected T category; // product category 
    public Product(String name, double price, T category) { // constructor to initialize product 
        this.name = name; // set product name 
        this.price = price; // set product price 
        this.category = category; // set product category 
    } 
    public String getName() { return name; } // get product name 
    public double getPrice() { return price; } // get product price 
    public T getCategory() { return category; } // get product category 
    @Override public String toString() { return name + " (" + category + ") - $" + price; } // override to string 
}
class Book extends Product<BookCategory> { // book class 
    public Book(String name, double price, BookCategory category) { // constructor to initialize book 
        super(name, price, category); // call super constructor 
    } 
}
class Clothing extends Product<ClothingCategory> { // clothing class 
    public Clothing(String name, double price, ClothingCategory category) { // constructor to initialize clothing 
        super(name, price, category); // call super constructor 
    } 
}
class Gadget extends Product<GadgetCategory> { // gadget class 
    public Gadget(String name, double price, GadgetCategory category) { // constructor to initialize gadget 
        super(name, price, category); // call super constructor 
    } 
}
enum BookCategory { FICTION, NON_FICTION, SCIENCE } // book categories 
enum ClothingCategory { MENS, WOMENS, KIDS } // clothing categories 
enum GadgetCategory { ELECTRONICS, ACCESSORIES } // gadget categories
public class DynamicOnlineMarketPlace { // main class 
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) { // apply discount method 
        double discountedPrice = product.getPrice() - (product.getPrice() * percentage / 100); // calculate discounted price 
        System.out.println("Applied " + percentage + "% discount to " + product.getName() + ": $" + discountedPrice); // print discounted price 
    } 
    public static void main(String[] args) { // main method 
        Product<BookCategory> book = new Book("Java Programming", 50.0, BookCategory.FICTION); // create book 
        Product<ClothingCategory> shirt = new Clothing("Cotton Shirt", 30.0, ClothingCategory.MENS); // create shirt 
        Product<GadgetCategory> phone = new Gadget("Smartphone", 500.0, GadgetCategory.ELECTRONICS); // create phone 
        applyDiscount(book, 10); // apply discount to book 
        applyDiscount(shirt, 20); // apply discount to shirt 
        applyDiscount(phone, 15); // apply discount to phone 
    }
}

/*

Sample Problem 2: Grocery Store Bill Generation Application
Class Diagram
The class diagram models the system where a customer buys products, and the bill is generated.
Diagram Description:
Classes: Customer, Product, BillGenerator
Relationships:
A Customer can purchase multiple Product items (Composition).
BillGenerator computes the total for the Customer.
Name : Utakarsh Jain
Date : 1/10/2026
*/

package ClassObjectSequencediagrams;
import java.util.ArrayList;
import java.util.List;

class Product { 
    private String name;  //Name of the product
    private double quantity;  //Quantity of the product
    private double price;  //Price of the product

    public Product(String name, double quantity, double price) {  //Parameterized Constructor
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {  //Method to get the name
        return name;
    }

    public double getQuantity() {  //Method to get the quantity
        return quantity;
    }

    public double getPrice() {  //Method to get the price
        return price;
    }

    public double calculateTotal() {  //Method to calculate the total
        return quantity * price;
    }
}

class Customer {
    private String name; //Name of the customer
    private List<Product> products; //List of products

    public Customer(String name) { //Parameterized Constructor
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) { //Method to add the product
        products.add(product);
    }

    public String getName() { //Method to get the name
        return name;
    }

    public List<Product> getProducts() { //Method to get the products
        return products;
    }
}

class BillGenerator {  
    public double calculateTotal(Customer customer) {  //Method to calculate t  he total
        double total = 0;  

        for (Product product : customer.getProducts()) {  //For loop to calculate the total
            total += product.calculateTotal();  
        }

        return total;
    }

    public void generateBill(Customer customer) {
        System.out.println("Customer: " + customer.getName());
        System.out.println("----- Bill -----");

        for (Product product : customer.getProducts()) {  //For loop to generate the bill
            System.out.println(product.getName() + " | " + product.getQuantity() + " | $" + product.getPrice() + " | Total: $" + product.calculateTotal());
        }
        System.out.println("----------------");
        System.out.println("Total Bill: $" + calculateTotal(customer));
    }
}

public class GrocreyBill {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice");

        Product apples = new Product("Apples", 2, 3);
        Product milk = new Product("Milk", 1, 2);

        // Composition: Customer's purchase contains Product objects.
        customer.addProduct(apples);
        customer.addProduct(milk);

        BillGenerator billGenerator = new BillGenerator();

        billGenerator.generateBill(customer);
    }
}

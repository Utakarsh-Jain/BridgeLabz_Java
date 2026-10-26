
/*
Program 5: Prototype Design Pattern

Purpose:
Prototype Pattern creates a new object by copying an existing object.
In Java, the Cloneable interface and clone() method can be used.
*/

// Implement Cloneable to indicate that Employee objects can be cloned
class Employee implements Cloneable {

    private int id;
    private String name;
    private String department;

    // Initialize employee details
    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Create a copy of the current Employee object
    @Override
    public Employee clone() {
        try {
            // Perform a shallow copy of this object
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            // Convert the checked exception into a runtime exception
            throw new RuntimeException("Cloning failed", e);
        }
    }

    // Display employee information
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

public class PrototypePattern {
    public static void main(String[] args) {

        // Create the original employee object
        Employee original = new Employee(
                101, "Utkarsh", "Development"
        );

        // Clone the original object to create a separate object
        Employee copy = original.clone();

        System.out.println("Original Employee:");
        original.display();

        System.out.println("Copied Employee:");
        copy.display();

        // Verify that the objects are different references
        System.out.println(
                "Same object: " + (original == copy)
        );
    }
}


/*
Program 8: Composite Design Pattern

Purpose:
Composite Pattern treats individual objects and groups of objects
uniformly through a common interface.
Here, a Manager can contain Developers or other Employees.
*/

import java.util.ArrayList;
import java.util.List;

// Common interface for individual employees and employee groups
interface Employee {
    void showDetails();
}

// Leaf object: Developer is an individual employee
class Developer implements Employee {
    private String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Developer: " + name);
    }
}

// Composite object: Manager can contain multiple Employees
class Manager implements Employee {
    private String name;

    // Store developers or other managers in the same list
    private List<Employee> employees = new ArrayList<>();

    public Manager(String name) {
        this.name = name;
    }

    // Add an employee to the manager's group
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Remove an employee from the manager's group
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public void showDetails() {
        System.out.println("Manager: " + name);

        // Display details of every employee in the group
        for (Employee employee : employees) {
            employee.showDetails();
        }
    }
}

public class CompositePattern {
    public static void main(String[] args) {
        // Create individual employee objects
        Developer developer1 = new Developer("Utkarsh");
        Developer developer2 = new Developer("Rahul");

        // Create a manager who manages these developers
        Manager manager = new Manager("Amit");
        manager.addEmployee(developer1);
        manager.addEmployee(developer2);

        // Display the manager and the employees under them
        manager.showDetails();
    }
}

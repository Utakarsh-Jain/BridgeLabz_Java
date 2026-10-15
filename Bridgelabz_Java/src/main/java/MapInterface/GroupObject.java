/*
Group Objects by Property
Given a list of Employee objects, group them by their department using a Map<Department, List<Employee>>.
Example:
Employees: [Alice (HR), Bob (IT), Carol (HR)] → Output: HR: [Alice, Carol], IT: [Bob].
Name: Utakarsh Jain
Date: 14/10/2026
*/

package main.java.MapInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
    private String name;
    private String department;
    public Employee(String name, String department) { //constructor
        this.name = name; 
        this.department = department; 
    }
    public String getName() { // get the name of the employee 
        return name; 
    }
    public String getDepartment() {  // get the department of the employee 
        return department;
    }
    @Override
    public String toString() { // convert the employee object to string 
        return name + " (" + department + ")";
    }
}
public class GroupObject {
    public static void main(String[] args) { // main method 
        List<Employee> employees = new ArrayList<>(); // create a new list of employees 
        employees.add(new Employee("Alice", "HR")); // add employees to the list 
        employees.add(new Employee("Bob", "IT")); 
        employees.add(new Employee("Carol", "HR")); 
        Map<String, List<Employee>> groupedByDepartment = groupByDepartment(employees); // group the employees by department 
        System.out.println(groupedByDepartment); // print the grouped employees 
    }
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) { // group the employees by department 
        Map<String, List<Employee>> groupedByDepartment = new HashMap<>(); // create a new hash map 
        for (Employee employee : employees) { // iterate over the list of employees 
            String department = employee.getDepartment(); // get the department of the employee 
            groupedByDepartment.computeIfAbsent(department, k -> new ArrayList<>()).add(employee); // add the employee to the map 
        } 
        return groupedByDepartment; // return the grouped employees 
    }
}

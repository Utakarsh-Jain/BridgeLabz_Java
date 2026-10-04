/*

Company and Departments (Composition)
Description: A Company has several Department objects, and each department contains Employee objects. Model this using composition, where deleting a company should also delete all departments and employees.
Tasks:
Define a Company class that contains multiple Department objects.
Define an Employee class within each Department.
Show the composition relationship by ensuring that when a Company object is deleted, all associated Department and Employee objects are also removed.
Goal: Understand composition by implementing a relationship where Department and Employee objects cannot exist without a Company.


*/
import java.util.ArrayList;
class Employee { //Class Employee
    private String name;
    public Employee(String name) { //Parameterized Constructor
        this.name = name;
    }
    public void displayEmployee() { //Method to display the employee name
        System.out.println("Employee: " + name);
    }
}
class Department { //Class Department
    private String name;
    private ArrayList<Employee> employees; //Array List to store the employee name
    public Department(String name) { //Parameterized Constructor
        this.name = name;
        employees = new ArrayList<>();
    }
    public void addEmployee(String employeeName) { //Method to add the employee name
        Employee employee = new Employee(employeeName);
        employees.add(employee);
    }
    public void displayDepartment() { //Method to display the details of the department
        System.out.println("Department: " + name);
        for (Employee employee : employees) {
            employee.displayEmployee();
        }
    }
}
class Company { //Class Company
    private String name;
    private ArrayList<Department> departments; //Array List to store the department name
    public Company(String name) { //Parameterized Constructor
        this.name = name;
        departments = new ArrayList<>();
    }
    public void addDepartment(String departmentName) { //Method to add the department name
        Department department = new Department(departmentName);
        departments.add(department);
    }
    public Department getDepartment(int index) { //Method to get the department
        return departments.get(index);
    }
    public void displayCompany() { //Method to display the details of the company
        System.out.println("Company: " + name);
        for (Department department : departments) {
            department.displayDepartment();
            System.out.println();
        }
    }
}
public class CompanyandDepartments { //Main class
    public static void main(String[] args) {
        Company company = new Company("Tech Solutions"); //Creating a company object
        company.addDepartment("Development"); //Adding a department
        company.addDepartment("Testing");
        company.getDepartment(0).addEmployee("Rahul");
        company.getDepartment(0).addEmployee("Aman");
        company.getDepartment(1).addEmployee("Priya");
        company.getDepartment(1).addEmployee("Neha");
        company.displayCompany();
        company = null;
        System.out.println("Company and its departments are no longer referenced.");
    }
}
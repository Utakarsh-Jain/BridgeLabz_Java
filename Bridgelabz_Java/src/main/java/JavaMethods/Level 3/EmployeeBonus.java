/*
* Problem 11 - Employee Bonus Method Level 3
Create a program to find the bonus of 10 employees based on their years of service as well as the total bonus amount the 10-year-old company Zara has to pay as a bonus, along with the old and new salary.
Hint => 
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Create a Method to determine the Salary and years of service and return the same. Use the Math.random() method to determine the 5-digit salary for each employee and also use the random method to determine the years of service. Define 2D Array to save the salary and years of service.
Write a Method to calculate the new salary and bonus based on the logic defined above and return the new 2D Array of the latest salary and bonus amount 
Write a Method to Calculate the sum of the Old Salary, the Sum of the New Salary, and the Total Bonus Amount and display it in a Tabular Format
Name: <Utakarsh Jain>
* Date : 24-09-2026

*/
import java.util.*;
class EmployeeBonus {
    public static int[][] determineSalaryAndService() {
        int[][] salaryAndService = new int[10][2]; // 2D array to store salary and years of service
        for (int i = 0; i < 10; i++) {
            salaryAndService[i][0] = (int) (Math.random() * 90000) + 10000; // Random 5-digit salary
            salaryAndService[i][1] = (int) (Math.random() * 10) + 1; // Random years of service (1-10)
        }
        return salaryAndService;
    }
    public static int[][] calculateBonus(int salaryAndService[][]) {
        int newSalaryAndBonus[][] = new int[10][2]; // 2D array to store new salary and bonus amount
        for (int i = 0; i < 10; i++) {
            if (salaryAndService[i][1] > 5) {
                newSalaryAndBonus[i][0] = salaryAndService[i][0] + (salaryAndService[i][0] * 5 / 100); // 5% bonus
                newSalaryAndBonus[i][1] = salaryAndService[i][0] * 5 / 100;
            } else {
                newSalaryAndBonus[i][0] = salaryAndService[i][0] + (salaryAndService[i][0] * 2 / 100); // 2% bonus
                newSalaryAndBonus[i][1] = salaryAndService[i][0] * 2 / 100;
            }
        }
        return newSalaryAndBonus;
    }
    public static void calculateSum(int salaryAndService[][], int newSalaryAndBonus[][]) {
        int totalOldSalary = 0;
        int totalNewSalary = 0;
        int totalBonus = 0;
        for (int i = 0; i < 10; i++) {
            totalOldSalary += salaryAndService[i][0];
            totalNewSalary += newSalaryAndBonus[i][0];
            totalBonus += newSalaryAndBonus[i][1];
        }
        System.out.println("Employee Bonus Report");
        System.out.println("Employee | Old Salary | Bonus  | New Salary");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-8d | %-10d | %-6d | %-10d\n", i + 1, salaryAndService[i][0], newSalaryAndBonus[i][1], newSalaryAndBonus[i][0]);
        }
        System.out.printf("Total    | %-10d | %-6d | %-10d\n", totalOldSalary, totalBonus, totalNewSalary);
    }
    public static void main(String args[]) {
        int salaryAndService[][] = determineSalaryAndService(); // Determine salary and years of service
        int newSalaryAndBonus[][] = calculateBonus(salaryAndService); // Calculate new salary and bonus
        calculateSum(salaryAndService, newSalaryAndBonus); // Calculate and display the sum
    }
}
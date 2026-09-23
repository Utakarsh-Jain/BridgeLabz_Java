/*
Problem 7 - GCR Array Method Level 1
Write a program to find the sum of n natural numbers using loop
Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop 

Author : <Utakarsh Jain>
* Date : 23-09-2026
*/
import java.util.Scanner;
class NaturalNumbers {
    public int calculateSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i; //calculating the sum of natural numbers
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt(); //asking the user to enter a number
        NaturalNumbers obj = new NaturalNumbers();
        int sum = obj.calculateSum(number); //calling the method to calculate the sum of natural numbers
        System.out.println("The sum of natural numbers is: " + sum); //printing the sum of natural numbers
        sc.close();
    }
}

/*

 Fibonacci Sequence Generator: 
○ Write a program that generates the Fibonacci sequence up to a specified number of terms entered by the user. 
○ Organize the code by creating a function that calculates and prints the Fibonacci sequence. 

Name : Utakarsh Jain
Date : 28/09/2026

*/

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        Fibonacci obj = new Fibonacci();
        obj.generateFibonacci(n);
        sc.close();
    }
    public void generateFibonacci(int n) {
        int a = 0, b = 1, nextTerm;
        System.out.print("Fibonacci sequence: ");
        for (int i = 1; i <= n; i++) { //Looping through the numbers from 1 to n
            System.out.print(a + " "); //Printing the current term
            nextTerm = a + b; //Calculating the next term
            a = b; //Updating the current term
            b = nextTerm; //Updating the next term
        }
        System.out.println(); //Printing a new line
    }
}

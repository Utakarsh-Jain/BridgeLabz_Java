/*

Factorial Using Recursion: 
○ Write a program that calculates the factorial of a number using a recursive function. 
○ Include modular code to separate input, calculation, and output processes

Name : Utakarsh Jain
Date : 28/09/2026

*/

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        Factorial obj = new Factorial();
        int factorial = obj.calculateFactorial(num);
        System.out.println("Factorial of " + num + " is: " + factorial);
        sc.close();
    }
    public int calculateFactorial(int num) {
        if (num == 1) { //Base case
            return 1;
        } else { //Recursive step
            return num * calculateFactorial(num - 1);
        }
    }
}

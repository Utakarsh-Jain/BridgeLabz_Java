/*
Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and show the result from both computations is correct. 
Hint => 
Take the user input number and check whether it's a Natural number, if not exit
Write a Method to find the sum of n natural numbers using recursion
Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2 
Compare the two results and print the result

*/

import java.util.Scanner;
class NaturalNumbers {
    public static int findSumRecursively(int n) { //method to find the sum of n natural numbers using recursion
        if (n == 1) {
            return 1;
        }
        return n + findSumRecursively(n - 1);
    }
    public static int findSumUsingFormula(int n) { //method to find the sum of n natural numbers using the formulae
        return n * (n + 1) / 2;
    }
    public static void main(String args[]) { //main method
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) { //checking if the number is a natural number
            System.out.println("Please enter a natural number.");
            sc.close();
            return;
        }
        int sum1 = findSumRecursively(n);
        int sum2 = findSumUsingFormula(n);
        System.out.println("Sum of first " + n + " natural numbers using recursion: " + sum1);
        System.out.println("Sum of first " + n + " natural numbers using formula: " + sum2);
        if (sum1 == sum2) {
            System.out.println("The results from both methods are correct.");
        } else {
            System.out.println("The results from the two methods do not match.");
        }
        sc.close();
    }
}

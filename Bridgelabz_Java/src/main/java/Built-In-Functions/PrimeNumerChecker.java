/*

Prime Number Checker: 
○ Create a program that checks whether a given number is a prime number. 
○ The program should use a separate function to perform the prime check and return the result. 

Name : Utakarsh Jain
Date : 28/09/2026
*/

import java.util.Scanner;
public class PrimeNumerChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        PrimeNumerChecker obj = new PrimeNumerChecker();
        obj.checkPrime(num);
        sc.close();
    }
    public void checkPrime(int num) {
        boolean isPrime = true; //Checking if the number is prime
        if (num <= 1) { //Checking if the number is less than or equal to 1
            isPrime = false; //Setting the isPrime variable to false
        } else { //If the number is greater than 1
            for (int i = 2; i <= Math.sqrt(num); i++) { //Looping through the numbers from 2 to the square root of the number
                if (num % i == 0) { //Checking if the number is divisible by i
                    isPrime = false; //Setting the isPrime variable to false
                    break; //Breaking the loop
                }
            }
        }
        if (isPrime) { //Checking if the number is prime
            System.out.println(num + " is a prime number.");
        } else { //If the number is not prime
            System.out.println(num + " is not a prime number.");
        }
    }
}
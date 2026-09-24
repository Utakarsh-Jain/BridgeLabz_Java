/*
Problem 5- Array Method Level 3
Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to Check if a number is prime number. A prime number is a number greater than 1 that has no positive divisors other than 1 and itself. 
Method to Check if a number is a neon number. A neon number is a number where the sum of digits of the square of the number is equal to the number itself 
Method to Check if a number is a spy number. A number is called a spy number if the sum of its digits is equal to the product of its digits
Method to Check if a number is an automorphic number. An automorphic number is a number whose square ends with the number itself. E.g. 5 is an automorphic number
Method to Check if a number is a buzz number. A number is a number that is either divisible by 7 or ends with 7
Author : <Utakarsh Jain>
* Date : 24-09-2026
*/
import java.util.Scanner;
class NumberTypeChecker {
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Prime numbers are greater than 1
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Found a divisor other than 1 and itself
            }
        }
        return true; // No divisors found, it's a prime number
    }
    // Method to check if a number is neon
    public static boolean isNeonNumber(int number) {
        if (number < 0) return false;
        
        long square = (long) number * number;
        int sumOfDigits = 0;
        long tempSquare = square;
        
        // Calculate sum of digits of the square
        while (tempSquare > 0) {
            sumOfDigits += tempSquare % 10;
            tempSquare /= 10;
        }
        
        // Check if sum of digits equals the original number
        return sumOfDigits == number;
    }
    // Method to check if a number is spy
    public static boolean isSpyNumber(int number) {
        if (number < 0) return false;
        
        int sumOfDigits = 0;
        int productOfDigits = 1;
        int tempNumber = number;
        
        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            tempNumber /= 10;
        }
        // Check if sum of digits equals product of digits
        return sumOfDigits == productOfDigits;
    }
    // Method to check if a number is automorphic
    public static boolean isAutomorphic(int number) {
        if (number < 0) return false;
        long square = (long) number * number;
        // Check if the square ends with the number
        String numberStr = Integer.toString(number);
        String squareStr = Long.toString(square);
        return squareStr.endsWith(numberStr);
    }
    // Method to check if a number is buzz
    public static boolean isBuzzNumber(int number) {
        // Check if divisible by 7 or ends with 7
        return (number % 7 == 0) || (number % 10 == 7);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Display results for each type
        System.out.println("Is Prime: " + isPrime(number));
        System.out.println("Is Neon: " + isNeonNumber(number));
        System.out.println("Is Spy: " + isSpyNumber(number));
        System.out.println("Is Automorphic: " + isAutomorphic(number));
        System.out.println("Is Buzz: " + isBuzzNumber(number));
        sc.close();
    }
}

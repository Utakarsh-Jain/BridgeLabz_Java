/*
Problem 6 - Array Method Level 3
Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to find factors of a number and return them as an array. Note there are 2 for loops one for the count and another for finding the factor and storing in the array
Method to find the greates factor of a Number using the factors array
Method to find the sum of the factors using factors array and return the sum
Method to find the product of the factors using factors array and return the product
Method to find product of cube of the factors using the factors array. Use Math.pow() 
Method to Check if a number is a perfect number. Perfect numbers are positive integers that are equal to the sum of their proper divisors
Method to find the number is a abundant number. A number is called an abundant number if the sum of its proper divisors is greater than the number itself
Method to find the number is a deficient number. A number is called a deficient number if the sum of its proper divisors is less than the number itself
Method to Check if a number is a strong number. A number is called a strong number if the sum of the factorial of its digits is equal to the number itself
Author : <Utakarsh Jain>
* Date : 24-09-2026
*/
import java.util.Arrays;
import java.util.Scanner;
class NumberFactorChecker {
    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        if (number <= 0) {
            return new int[0]; // Return empty array for non-positive numbers
        }
        
        // First loop: count the number of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        // Create array and second loop: store the factors
        int factors[] = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    // Method to find the greatest factor of a Number using the factors array
    public static int findGreatestFactor(int factors[]) {
        if (factors == null || factors.length == 0) {
            return 0; // Or throw an exception
        }
        // The greatest factor is the last element in the sorted array
        return factors[factors.length - 1];
    }
    // Method to find the sum of the factors using factors array
    public static int findSumOfFactors(int factors[]) {
        if (factors == null) {
            return 0;
        }
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    // Method to find the product of the factors using factors array
    public static long findProductOfFactors(int factors[]) {
        if (factors == null) {
            return 0;
        }
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    // Method to find product of cube of the factors using the factors array
    public static double findProductOfCubeOfFactors(int factors[]) {
        if (factors == null) {
            return 0;
        }
        double productOfCubes = 1.0;
        for (int factor : factors) {
            productOfCubes *= Math.pow(factor, 3);
        }
        return productOfCubes;
    }
    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number, int sumOfFactors) {
        if (number <= 0) {
            return false;
        }
        // Perfect numbers are equal to the sum of their proper divisors
        // The sumOfFactors includes the number itself, so we compare with number
        return number == sumOfFactors;
    }
    // Helper method to calculate factorial for strong number check
    private static long calculateFactorial(int n) {
        if (n < 0) return 0;
        if (n == 0 || n == 1) return 1;
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        if (number < 0) return false;
        
        int temp = number;
        long sumOfFactorialOfDigits = 0;
        
        while (temp > 0) {
            int digit = temp % 10;
            sumOfFactorialOfDigits += calculateFactorial(digit);
            temp /= 10;
        }
        
        return sumOfFactorialOfDigits == number;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Find factors
        int[] factors = findFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));
        if (factors.length > 0) {
            // Find greatest factor
            int greatestFactor = findGreatestFactor(factors);
            System.out.println("Greatest Factor: " + greatestFactor);
            // Find sum of factors
            int sumOfFactors = findSumOfFactors(factors);
            System.out.println("Sum of Factors: " + sumOfFactors);
            // Find product of factors
            long productOfFactors = findProductOfFactors(factors);
            System.out.println("Product of Factors: " + productOfFactors);
            // Find product of cube of factors
            double productOfCubes = findProductOfCubeOfFactors(factors);
            System.out.println("Product of Cube of Factors: " + productOfCubes);
            // Check if perfect number
            boolean isPerfect = isPerfectNumber(number, sumOfFactors);
            System.out.println("Is Perfect Number: " + isPerfect);
            // Check if abundant number (sum of proper divisors > number)
            // Since sumOfFactors includes number, proper divisor sum is sumOfFactors - number
            boolean isAbundant = (sumOfFactors - number) > number;
            System.out.println("Is Abundant Number: " + isAbundant);
            // Check if deficient number (sum of proper divisors < number)
            boolean isDeficient = (sumOfFactors - number) < number;
            System.out.println("Is Deficient Number: " + isDeficient);
        } else {
            System.out.println("No factors found.");
        }
        // Check if strong number
        boolean isStrong = isStrongNumber(number);
        System.out.println("Is Strong Number: " + isStrong);
        sc.close();
    }
}

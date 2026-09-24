/*
Problem 4 - Array Method Level 3
Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
Method to reverse the digits array 
Method to compare two arrays and check if they are equal
Method to check if a number is a palindrome using the Digits. A palindrome number is a number that remains the same when its digits are reversed. 
Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it

Author : <Utakarsh Jain>
* Date : 24-09-2026
*/
import java.util.Arrays;
import java.util.Scanner;
class NumberPalindrome {
    // Method to find the count of digits
    public static int countDigits(int number) {
        if (number == 0) return 1;
        int count = 0;
        int temp = Math.abs(number); // Handle negative numbers
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        return count;
    }
    // Method to store digits in an array
    public static int[] getDigits(int number, int count) {
        int[] digits = new int[count];
        int temp = Math.abs(number);
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }
    // Method to reverse the digits array
    public static int[] reverseDigitsArray(int digits[]) {
        int[] reversedDigits = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversedDigits[i] = digits[digits.length - 1 - i];
        }
        return reversedDigits;
    }
    // Method to compare two arrays
    public static boolean areArraysEqual(int arr1[], int arr2[]) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        if (number < 0) return false; // Negative numbers are not considered palindromes
        
        int count = countDigits(number);
        int digits[] = getDigits(number, count);
        int reversedDigits[] = reverseDigitsArray(digits);
        return areArraysEqual(digits, reversedDigits);
    }
    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int digits[]) {
        for (int digit : digits) {
            if (digit != 0) {
                return true; // Found a non-zero digit
            }
        }
        return false; // All digits are zero
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Get digits and count
        int digitCount = countDigits(number);
        int digits[] = getDigits(number, digitCount);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Count of digits: " + digitCount);
        // Reverse the digits array
        int reversedDigits[] = reverseDigitsArray(digits);
        System.out.println("Reversed digits: " + Arrays.toString(reversedDigits));
        // Check if arrays are equal
        boolean isEqual = areArraysEqual(digits, reversedDigits);
        System.out.println("Are arrays equal: " + isEqual);
        // Check if number is a palindrome
        boolean isPalindromeResult = isPalindrome(number);
        System.out.println("Is Palindrome: " + isPalindromeResult);
        // Check if number is a duck number
        boolean isDuckResult = isDuckNumber(digits);
        System.out.println("Is Duck Number: " + isDuckResult);
        sc.close();
    }
}
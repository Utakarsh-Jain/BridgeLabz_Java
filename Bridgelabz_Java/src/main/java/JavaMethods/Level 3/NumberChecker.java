/*
Problem 2 - Array Method Level 3
Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to Find the count of digits in the number
Method to Store the digits of the number in a digits array
Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it
Method to check if the number is a armstrong number using the digits array. ​​Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits. Eg: 153 = 1^3 + 5^3 + 3^3
Method to find the largest and second largest elements in the digits array. Use Integer.MIN_VALUE to initialize the variable.
Method to find the the smallest and second smallest elements in the digits array. Use Integer.MAX_VALUE to initialize the variable.

Author : <Utakarsh Jain>
* Date : 24-09-2026
*/

import java.util.Arrays;
import java.util.Scanner;
class NumberChecker {
    public static int countDigits(int number) { //Method to count the number of digits in a number
        int count = 0;
        int temp = number;
        while (temp > 0) { //Checking if the number is greater than 0
            count++; //Incrementing the count
            temp /= 10; //Dividing the number by 10
        }
        return count; //Returning the count
    }
    public static int[] getDigits(int number, int count) { //Method to store the digits of a number in an array
        int digits[] = new int[count];
        int temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10; //Storing the last digit of the number
            temp /= 10; //Dividing the number by 10
        }
        return digits; //Returning the array of digits
    }
    public static boolean isDuckNumber(int digits[]) { //Method to check if a number is a duck number
        for (int digit : digits) {
            if (digit != 0) { //Checking if the digit is not zero
                return true; //Returning true if the digit is not zero
            }
        }
        return false; //Returning false if the digit is zero
    }
    public static boolean isArmstrongNumber(int number, int digits[]) { //Method to check if a number is an armstrong number
        int power = digits.length; 
        int sum = 0; 
        for (int digit : digits) { //Iterating through the digits
            sum += (int) Math.pow(digit, power); //Adding the power of each digit to the sum
        }
        return sum == number; //Returning true if the sum is equal to the number
    }
    public static int[] findLargestAndSecondLargest(int digits[]) { //Method to find the largest and second largest elements in the digits array
        int largest = Integer.MIN_VALUE; 
        int secondLargest = Integer.MIN_VALUE; 
        for (int digit : digits) { 
            if (digit > largest) { //Checking if the digit is greater than the largest
                secondLargest = largest; //Updating the second largest element
                largest = digit; //Updating the largest element
            } else if (digit > secondLargest && digit != largest) { //Checking if the digit is greater than the second largest and not equal to the largest
                secondLargest = digit; //Updating the second largest element
            }
        }
        return new int[]{largest, secondLargest};
    }
    public static int[] findSmallestAndSecondSmallest(int digits[]) {
        int smallest = Integer.MAX_VALUE; 
        int secondSmallest = Integer.MAX_VALUE; 
        for (int digit : digits) { 
            if (digit < smallest) { //Checking if the digit is smaller than the smallest
                secondSmallest = smallest; //Updating the second smallest element
                smallest = digit; //Updating the smallest element
            } else if (digit < secondSmallest && digit != smallest) { //Checking if the digit is smaller than the second smallest and not equal to the smallest
                secondSmallest = digit; //Updating the second smallest element
            }
        }
        return new int[]{smallest, secondSmallest};
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int count = countDigits(number);
        int digits[] = getDigits(number, count);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Count of digits: " + count);
        System.out.println("Duck Number: " + isDuckNumber(digits));
        System.out.println("Armstrong Number: " + isArmstrongNumber(number, digits));
        int largestValues[] = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + largestValues[0]);
        System.out.println("Second Largest: " + largestValues[1]);
        int smallestValues[] = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallestValues[0]);
        System.out.println("Second Smallest: " + smallestValues[1]);
        sc.close();
    }
}

/*
Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
Method to find the sum of the digits of a number using the digits array
Method to find the sum of the squares of the digits of a number using the digits array. Use Math.pow() method
Method to Check if a number is a harshad number using a digits array. A number is called a Harshad number if it is divisible by the sum of its digits. For e.g. 21
Method to find the frequency of each digit in the number. Create a 2D array to store the frequency with digit in the first column and frequency in the second column.
Author : <Utakarsh Jain>
* Date : 24-09-2026
*/
import java.util.Arrays;
import java.util.Scanner;
class NumberProperties {
    public static int countDigits(int number) { //Method to count the number of digits in a number
        int count = 0;
        int temp = number;
        while (temp > 0) { //Checking if the number is greater than 0
            count++;
            temp /= 10; //Dividing the number by 10
        }
        return count; 
    }
    public static int[] getDigits(int number, int count) { //Method to store the digits of a number in an array
        int digits[] = new int[count];
        int temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10; //Storing the last digit of the number
            temp /= 10; 
        }
        return digits;
    }
    public static int findSumOfDigits(int digits[]) { //Method to find the sum of the digits of a number
        int sum = 0;
        for (int digit : digits) { //Iterating through the digits
            sum += digit; //Adding the digit to the sum
        }
        return sum; 
    }
    public static int findSumOfSquares(int digits[]) { //Method to find the sum of the squares of the digits of a number
        int sum = 0;
        for (int digit : digits) { //Iterating through the digits
            sum += (int) Math.pow(digit, 2); //Adding the square of the digit to the sum
        }
        return sum; 
    }
    public static boolean isHarshadNumber(int number, int digits[]) { //Method to check if a number is a harshad number
        int sum = findSumOfDigits(digits); //Finding the sum of the digits
        return number % sum == 0; //Returning true if the number is divisible by the sum of its digits
    }
    public static int[][] findFrequencyOfEachDigit(int digits[]) { //Method to find the frequency of each digit in the number
        int frequency[][] = new int[10][2]; 
        for (int digit : digits) { 
            frequency[digit][0] = digit; //Storing the digit
            frequency[digit][1]++; //Incrementing the frequency of the digit
        }
        return frequency; 
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int count = countDigits(number); 
        int digits[] = getDigits(number, count); 
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Count of digits: " + count);
        System.out.println("Sum of digits: " + findSumOfDigits(digits)); 
        System.out.println("Sum of squares of digits: " + findSumOfSquares(digits)); 
        System.out.println("Harshad Number: " + isHarshadNumber(number, digits)); 
        int frequency[][] = findFrequencyOfEachDigit(digits); 
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) { 
            if (frequency[i][1] != 0) { 
                System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1]);
            }
        }
        sc.close();
    }
}
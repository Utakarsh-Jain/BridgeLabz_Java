/*
Problem 9 - GCR Array Method Level 1

Write a program to take 2 numbers and print their quotient and reminder
Hint => 
Take user input as integer
Use division operator (/) for quotient and moduli operator (%) for reminder
Write Method to find the reminder and the quotient of a number 
public static int[] findRemainderAndQuotient(int number, int divisor) 

Author : <Utakarsh Jain>
* Date : 23-09-2026
*/
import java.util.Scanner;
class QuotientAndRemainder {
    public int[] calculateQuotientAndRemainder(int dividend, int divisor) {
        int quotient = dividend / divisor; //calculating the quotient
        int remainder = dividend % divisor; //calculating the remainder
        return new int[]{quotient, remainder};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int dividend = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();
        QuotientAndRemainder obj = new QuotientAndRemainder();
        int result[] = obj.calculateQuotientAndRemainder(dividend, divisor); //calling the method to calculate the quotient and remainder
        System.out.println("Quotient: " + result[0]); 
        System.out.println("Remainder: " + result[1]);
        sc.close();
    }
}
/*
Problem 5 - GCR Array Method Level 1
Write a program to check whether a number is positive, negative, or zero.
Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1 for positive number and 0 if number is zero

Author : <Utakarsh Jain>
* Date : 23-09-2026
*/

import java.util.Scanner;
class NumberCheck
{
    public int checkNumber(int n)
    {
        if(n>0) return 1; //if n is positive return 1
        else if(n<0) return -1; //if n is negative return -1
        else return 0; //if n is zero return 0
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        NumberCheck obj = new NumberCheck(); //creating an object to call the method
        int result = obj.checkNumber(n); //calling the method to check the number
        System.out.println("Result: " + result); 
        sc.close(); 
    }
}
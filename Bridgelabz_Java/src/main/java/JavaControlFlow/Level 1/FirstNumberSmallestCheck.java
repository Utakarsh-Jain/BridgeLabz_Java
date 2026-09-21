import java.util.*;
/* 
Problem 2- GCR Control Flow Level 1
Write a program to check if the first is the smallest of the 3 numbers.
I/P => number1, number2, number3
O/P => Is the first number the smallest? ____
* Author : <Utakarsh Jain>
* Date : 21-09-2026
*/

public class FirstNumberSmallestCheck{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int number1 = sc.nextInt();
        System.out.print("Enter second number:");
        int number2 = sc.nextInt();
        System.out.print("Enter third number:");
        int number3 = sc.nextInt();
        if(number1 <= number2 && number1 <= number3){
            System.out.println("The first number " + number1 + " is the smallest");
        }else{
            System.out.println("The first number " + number1 + " is not the smallest");
        }
        sc.close();
    }
}

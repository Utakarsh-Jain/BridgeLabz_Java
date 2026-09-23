/*
Problem 10 - GCR Array Method Level 1
Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates
Hint => 
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Write the method to find the number of chocolates each child gets and number of remaining chocolates
public static int[] findRemainderAndQuotient(int number, int divisor) 

Author : <Utakarsh Jain>
* Date : 23-09-2026
*/

import java.util.Scanner;
class Chocolates {
    public int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor; //calculating the number of chocolates each child gets
        int remainder = number % divisor; //calculating the number of remaining chocolates
        return new int[]{quotient, remainder};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of chocolates: ");
        int number = sc.nextInt();
        System.out.print("Enter the number of children: ");
        int divisor = sc.nextInt();
        Chocolates obj = new Chocolates();
        int[] result = obj.findRemainderAndQuotient(number, divisor); //calling the method to calculate the number of chocolates each child gets and the number of remaining chocolates
        System.out.println("Number of chocolates each child gets: " + result[0]); //printing the number of chocolates each child gets
        System.out.println("Number of remaining chocolates: " + result[1]); //printing the number of remaining chocolates
        sc.close();
    }
}

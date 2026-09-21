import java.util.Scanner;
/**
 Problem 1 - GCR Control Flow Level 1
Write a program to check if a number is divisible by 5
I/P => number
O/P => Is the number ___ divisible by 5? ___ 

* Author : <Utakarsh Jain>
* Date : 21-09-2026
*/
class DivisibleBy5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if(number%5==0){
            System.out.println("The number " + number + " is divisible by 5");
        }else{
            System.out.println("The number " + number + " is not divisible by 5");
        }
        sc.close();
    }
}

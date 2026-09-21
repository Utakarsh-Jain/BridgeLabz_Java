import java.util.Scanner;
/*
Problem 12 - GCR Control Flow Level 1
Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
Hint => 
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using while loop
Compare the two results and print the result

Author : <Utakarsh Jain>
Date : 21-09-2026
*/
class SumOfNaturalNumbers{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        if (number > 0) {
            int formulaSum = number * (number + 1) / 2;
            int sum = 0;
            int counter = 1;
            while (counter <= number) {
                sum = sum + counter;
                counter++;
            }
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + sum);
            if (formulaSum == sum) {
                System.out.println("Both results are correct.");
            } else {
                System.out.println("Both results are not equal.");
            }
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
        sc.close();
    }
}
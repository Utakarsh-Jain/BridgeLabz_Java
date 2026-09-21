import java.util.Scanner;
/*
Problem 13 - GCR Control Flow Level 1
Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
Hint => 
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using for loop
Compare the two results and print the result
Author : <Utakarsh Jain>
* Date : 21-09-2026
*/
class NaturalNumberSumFor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        if (number > 0) {
            int formulaSum = number * (number + 1) / 2;
            int sum = 0;
            for (int counter = 1; counter <= number; counter++) {
                sum = sum + counter;
            }
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + sum);
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
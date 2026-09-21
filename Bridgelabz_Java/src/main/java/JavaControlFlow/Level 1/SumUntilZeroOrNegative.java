import java.util.Scanner;
/**
 Problem 11 - GCR Control Flow Level 1
Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
Hint => 
Use infinite while loop as in while (true)
Take the user entry and check if the user entered 0 or a negative number to break the loop using break;
Author : <Utakarsh Jain>
* Date : 21-09-2026
*/
public class SumUntilZeroOrNegative {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            double number = sc.nextDouble();
            if (number <= 0) {
                break;
            }
            total += number;
        }
        System.out.println("Total: " + total);
        sc.close();
    }
}
import java.util.Scanner;
/*Problem 5 - GCR Java Arrays Level 1
Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
Hint => 
Take integer input and store it in the variable number as well as define an integer array to store the multiplication result in the variable multiplicationResult
Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
Finally, display the result from the array in the format number * i = ___

* Author : <Utakarsh Jain>
* Date : 22-09-2026
*/
public class MultiplicationSixToNine {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();
        int multiplicationResult[]= new int[4];
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }
        sc.close();
    }
}

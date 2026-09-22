import java.util.Scanner;
/*Problem 3 - GCR Java Arrays Level 1
Create a program to print a multiplication table of a number.
Hint => 
Get an integer input and store it in the number variable. Also, define a integer array to store the results of multiplication from 1 to 1
Run a loop from 1 to 10 and store the results in the multiplication table array
Finally, display the result from the array in the format number * i = ___

* Author : <Utakarsh Jain>
* Date : 22-09-2026
*/
public class MultiplicationTable {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int multiplicationTable[] = new int[10];
        for (int i = 0; i < multiplicationTable.length; i++) { //Looping through the array to generate multiplication table
            multiplicationTable[i] = number * (i + 1); //Storing the result of multiplication in the array
        }
        for (int i = 0; i < multiplicationTable.length; i++) { //Looping through the array to display the multiplication table
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]); //Printing the multiplication table
        }
        sc.close();
    }
}

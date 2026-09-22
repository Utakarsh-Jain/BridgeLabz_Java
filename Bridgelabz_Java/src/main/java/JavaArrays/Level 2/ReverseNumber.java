/*Problem 5 - GCR Java Arrays Level 2
Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order
Hint => 
Take user input for a number. 
Find the count of digits in the number. 
Find the digits in the number and save them in an array
Create an array to store the elements of the digits array in reverse order
Finally, display the elements of the array in reverse order


* Author : <Utakarsh Jain>
* Date : 22-09-2026
*/
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Invalid number.");
            return;
        }
        // Find count of digits
        int count = 0;
        int temp = number;
        if (number == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                count++;
                temp /= 10;
            }
        }
        int digits[] = new int[count];
        // Store digits
        temp = number;
        for (int i = 0; i < digits.length; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        int reverse[] = new int[count];
        // Store digits in reverse order
        for (int i = 0; i < digits.length; i++) {
            reverse[i] = digits[digits.length - 1 - i];
        }
        System.out.print("Reversed number = ");
        for (int i = reverse.length - 1; i >= 0; i--) {
            System.out.print(reverse[i]);
        }
        sc.close();
    }
}
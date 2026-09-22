import java.util.Scanner;
/*Problem 2 - GCR Java Arrays Level 1
Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less
Hint => 
Define an integer array of 5 elements and get user input to store in the array.
Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
If the number is negative, print negative. Else if the number is zero, print zero. 
Finally compare the first and last element of the array and display if they equal, greater or less

* Author : <Utakarsh Jain>
* Date : 22-09-2026
*/
public class NumberCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[5];
        for (int i = 0; i < numbers.length; i++) { //Looping through the array to take user input
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) { //Checking if the number is positive
                if (numbers[i] % 2 == 0) { //Checking if the number is even
                    System.out.println(numbers[i] + " is positive and even"); //Printing that the number is positive and even
                } else { //If the number is not even
                    System.out.println(numbers[i] + " is positive and odd"); //Printing that the number is positive and odd
                }
            } else if (numbers[i] < 0) { //Checking if the number is negative
                System.out.println(numbers[i] + " is negative"); //Printing that the number is negative
            } else { //If the number is not negative
                System.out.println(numbers[i] + " is zero"); //Printing that the number is zero
            }
        }
        if (numbers[0] == numbers[4]) { //Checking if the first and last elements are equal
            System.out.println("First and last elements are equal"); //Printing that the first and last elements are equal
        } else if (numbers[0] > numbers[4]) { //Checking if the first element is greater than the last element
            System.out.println("First element is greater than last element"); //Printing that the first element is greater than the last element
        } else { //If the first element is not greater than the last element
            System.out.println("First element is less than last element");
        }
        sc.close();
    }
}
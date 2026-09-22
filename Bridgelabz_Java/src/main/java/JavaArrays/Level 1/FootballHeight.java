import java.util.Scanner;
/*Problem 6 - GCR Java Arrays Level 1
Create a program to find the mean height of players present in a football team.
Hint => 
The formula to calculate the mean is: mean = sum of all elements / number of elements
Create a double array named heights of size 11 and get input values from the user.
Find the sum of all the elements present in the array.
Divide the sum by 11 to find the mean height and print the mean height of the football team

* Author : <Utakarsh Jain>
* Date : 22-09-2026
*/
public class FootballHeight {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double heights[] = new double[11]; // Declaring an array of size 11 to store the heights
        double sum = 0; // Declaring a variable to store the sum of the heights
        for (int i = 0; i < heights.length; i++) { // Loop to take the heights of the players
            System.out.print("Enter height of player " + (i + 1) + ": "); 
            heights[i] = sc.nextDouble(); // Taking the user input
        }
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        double mean = sum / 11;
        System.out.println("Mean height of the football team = " + mean);
        sc.close();
    }
}

/*Problem 2 - GCR Java Arrays Level 2
Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint => 
Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
Loop through the array and find the youngest of the 3 friends and the tallest of the 3 friends
Finally display the youngest and tallest of the 3 friends

* Author : <Utakarsh Jain>
* Date : 22-09-2026
*/
import java.util.Scanner;
public class HeightComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ages[] = new int[3]; // Array to store ages
        int heights[] = new int[3]; // Array to store heights
        for (int i = 0; i < ages.length; i++) { // Loop to take input from the user
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of friend " + (i + 1) + ": ");
            heights[i] = sc.nextInt();
        }
        int minAge = ages[0];
        int maxAge = ages[0];
        int maxHeight = heights[0];
        int minHeight = heights[0]; 
        for (int i = 1; i < ages.length; i++) { // Loop to find the youngest and tallest
            if (ages[i] < minAge) { // Checking for the youngest
                minAge = ages[i];
            }
            if (ages[i] > maxAge) { // Checking for the tallest
                maxAge = ages[i];
            }
            if (heights[i] < minHeight) { // Checking for the shortest
                minHeight = heights[i];
            }
            if (heights[i] > maxHeight) { // Checking for the tallest
                maxHeight = heights[i];
            }
        }
        System.out.println("Youngest friend age: " + minAge);
        System.out.println("Tallest friend age: " + maxAge);
        System.out.println("Shortest friend height: " + minHeight);
        System.out.println("Tallest friend height: " + maxHeight);
        sc.close();
    }
}
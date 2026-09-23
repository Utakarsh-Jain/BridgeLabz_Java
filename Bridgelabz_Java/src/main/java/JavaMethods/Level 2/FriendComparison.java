/*
Problem 8 - GCR Array Method Level 2
Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based on their ages and tallest among the friends based on their heights and display it
Hint => 
Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
Write a Method to find the youngest of the 3 friends
Write a Method to find the tallest of the 3 friends
Author : <Utakarsh Jain>
* Date : 23-09-2026
*/

import java.util.Scanner;
public class FriendComparison {
    public int findYoungest(int ages[]) { //method to find the youngest of the 3 friends
        int min = ages[0];
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < min) {
                min = ages[i];
            }
        }
        return min;
    }
    public int findTallest(int heights[]) { //method to find the tallest of the 3 friends
        int max = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > max) {
                max = heights[i];
            }
        }
        return max;
    }
    public static void main(String args[]) { //main method
        Scanner sc = new Scanner(System.in);
        int ages[] = new int[3];
        int heights[] = new int[3];
        FriendComparison obj = new FriendComparison();
        for (int i = 0; i < ages.length; i++) { //loop to take user input for age and height
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of friend " + (i + 1) + ": ");
            heights[i] = sc.nextInt();
        }
        System.out.println("Youngest friend is " + obj.findYoungest(ages)); //printing the youngest friend
        System.out.println("Tallest friend is " + obj.findTallest(heights)); //printing the tallest friend
        sc.close();
    }
}
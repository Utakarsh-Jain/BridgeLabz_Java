import java.util.Scanner;
/*
Problem 8 - GCR Control Flow Level 2
Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint => 
Take user input for the age and height of the 3 friends and store it in a variable
Find the smallest of the 3 ages to find the youngest friend and display it
Find the largest of the 3 heights to find the tallest friend and display it

* Author : <Utakarsh Jain>
* Date : 21-09-2026
*/
class FriendComparison {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amar's age:");
        int amarage = sc.nextInt();
        System.out.print("Enter Akbar's age:");
        int akbarage = sc.nextInt();
        System.out.print("Enter Anthony's age:");
        int anthonyage = sc.nextInt();
        System.out.print("Enter Amar's height in cm:");
        double amarheight = sc.nextDouble();
        System.out.print("Enter Akbar's height in cm:");
        double akbarheight = sc.nextDouble();
        System.out.print("Enter Anthony's height in cm:");
        double anthonyheight = sc.nextDouble();
        String youngestfriend;
        if (amarage <= akbarage && amarage <= anthonyage) {
            youngestfriend = "Amar";
        } else if (akbarage <= amarage && akbarage <= anthonyage) {
            youngestfriend = "Akbar";
        } else {
            youngestfriend = "Anthony";
        }
        String tallestfriend;
        if (amarheight >= akbarheight && amarheight >= anthonyheight) {
            tallestfriend = "Amar";
        } else if (akbarheight >= amarheight
                && akbarheight >= anthonyheight) {
            tallestfriend = "Akbar";
        } else {
            tallestfriend = "Anthony";
        }
        System.out.println("The youngest friend is " + youngestfriend);
        System.out.println("The tallest friend is " + tallestfriend);
        sc.close();
    }
}
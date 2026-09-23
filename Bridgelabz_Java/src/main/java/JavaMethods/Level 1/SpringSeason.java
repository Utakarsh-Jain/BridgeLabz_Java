/*
Problem 6 - GCR Array Method Level 1
Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring season and return a boolean true or false 

Author : <Utakarsh Jain>
* Date : 23-09-2026
*/

import java.util.Scanner;
class SpringSeason {
    public static boolean isSpringSeason(int month, int day) { 
        return ((month == 3 && day >= 20) || month == 4 || month == 5 || (month == 6 && day <= 20)); //checking if the month and day are within the spring season range
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter month: "); 
        int month = sc.nextInt(); //taking the value of month from user
        System.out.print("Enter day: ");
        int day = sc.nextInt(); //taking the value of day from user
        if (isSpringSeason(month, day)) { //checking if it's a spring season
            System.out.println("Its a Spring Season"); //printing that it's a spring season
        } else {
            System.out.println("Not a Spring Season"); //printing that it's not a spring season
        }
        sc.close(); 
    }
}
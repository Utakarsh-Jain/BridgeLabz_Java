/*
* Problem 8 - Calendar Method Level 3
Create a program to display a calendar for a given month and year. The program should take the month and year as input from the user and display the calendar for that month. E.g. for 07 2005 user input, the program should display the calendar as shown below

Hint => 
Write a Method to get the name of the month. For this define a month Array to store the names of the months
Write a Method to get the number of days in the month. For this define a days Array to store the number of days in each month. For Feb month, check for Leap Year to get the number of days. Also, define a Leap Year Method. 
Write a method to get the first day of the month using the Gregorian calendar algorithm
y0 = y − (14 − m) / 12
x = y0 + y0/4 − y0/100 + y0/400
m0 = m + 12 × ((14 − m) / 12) − 2
d0 = (d + x + 31m0 / 12) mod 7
Displaying the Calendar requires 2 for loops. 
The first for loop up to the first day to get the proper indentation. As in the example above 3 spaces from Sun to Thu as to be set as July 1st starts on Fri
The Second for loop Displays the days of the month starting from 1 to the number of days. Add proper indentation for single-digit days using %3d to display the integer right-justified in a field of width 3. Please note to move to the next line after Sat
Name: <Utakarsh Jain>
* Date : 24-09-2026
*/
import java.util.*;
class Calendar {
    public static String getMonthName(int month) {
        String monthNames[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}; //Array of strings to store the names of the months
        return monthNames[month - 1];
    }
    public static int getDaysInMonth(int month, int year) {
        int daysInMonth[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //Array of integers to store the number of days in each month
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month];
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0); //Checks if the year is a leap year
    }
    public static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12; //Using Gregorian calendar algorithm to find the first day of the month
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;
        return d0;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month:");
        int month = sc.nextInt();
        System.out.print("Enter year:");
        int year = sc.nextInt();
        System.out.println(getMonthName(month) + " " + year); //prints the name of the month and the year
        System.out.println("Sun Mon Tue Wed Thu Fri Sat"); //Prints the days of the week
        int firstDay = getFirstDayOfMonth(month, year);
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); //Prints spaces to get the proper indentation
        }
        int daysInMonth = getDaysInMonth(month, year);
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day); //Displays the days of the month starting from 1 to the number of days
            if ((firstDay + day) % 7 == 0) {
                System.out.println(); //Displays the days of the month starting from 1 to the number of days
            }
        }
        System.out.println();
        sc.close();
    }
}
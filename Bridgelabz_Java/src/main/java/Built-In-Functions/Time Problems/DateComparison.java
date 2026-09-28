/*

Date Comparison Write a program that:
➢ Takes two date inputs and compares them to check if the first date is before, after,
or the same as the second date.
Hint: Use isBefore(), isAfter(), and isEqual() methods from the LocalDate

Name : Utakarsh Jain
Date : 28/09/2026

*/

import java.time.LocalDate;
import java.util.Scanner;
public class DateComparison {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first date (yyyy-mm-dd): ");
        String dateStr1 = sc.nextLine();
        System.out.print("Enter the second date (yyyy-mm-dd): ");
        String dateStr2 = sc.nextLine();
        LocalDate date1 = LocalDate.parse(dateStr1); //Parsing the first date
        LocalDate date2 = LocalDate.parse(dateStr2); //Parsing the second date
        DateComparison obj = new DateComparison();
        obj.compareDates(date1, date2);
        sc.close();
    }
    public void compareDates(LocalDate date1, LocalDate date2) {
        if (date1.isBefore(date2)) { //Checking if the first date is before the second date
            System.out.println(date1 + " is before " + date2);
        } else if (date1.isAfter(date2)) { //Checking if the first date is after the second date
            System.out.println(date1 + " is after " + date2);
        } else { //If the first date is neither before nor after the second date, it is the same
            System.out.println(date1 + " is the same as " + date2);
        }
    }
}

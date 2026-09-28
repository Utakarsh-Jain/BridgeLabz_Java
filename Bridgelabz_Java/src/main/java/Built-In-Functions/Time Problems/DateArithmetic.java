/*

Problem 2
Date Arithmetic Create a program that:
➢ Takes a date input and adds 7 days, 1 month, and 2 years to it.
➢ Then subtracts 3 weeks from the result.
Hint: Use LocalDate.plusDays(), plusMonths(), plusYears(), and
minusWeeks() methods.

Name : Utakarsh Jain
Date : 28/09/2026

*/

import java.time.*;
import java.util.*;
public class DateArithmetic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-mm-dd): ");
        String dateStr = sc.nextLine();
        LocalDate date = LocalDate.parse(dateStr);
        DateArithmetic obj = new DateArithmetic();
        obj.addDays(date);
        obj.addMonths(date);
        obj.addYears(date);
        obj.subtractWeeks(date);
        sc.close();
    }
    public void addDays(LocalDate date) {
        LocalDate result = date.plusDays(7); //Adding 7 days
        System.out.println("After adding 7 days: " + result);
    }
    public void addMonths(LocalDate date) {
        LocalDate result = date.plusMonths(1); //Adding 1 month
        System.out.println("After adding 1 month: " + result);
    }
    public void addYears(LocalDate date) {
        LocalDate result = date.plusYears(2); //Adding 2 years
        System.out.println("After adding 2 years: " + result);
    }
    public void subtractWeeks(LocalDate date) {
        LocalDate result = date.minusWeeks(3); //Subtracting 3 weeks
        System.out.println("After subtracting 3 weeks: " + result);
    }
}

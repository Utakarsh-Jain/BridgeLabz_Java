/*

Date Formatting Write a program that:
➢ Displays the current date in three different formats:
■ dd/MM/yyyy
■ yyyy-MM-dd
■ EEE, MMM dd, yyyy

Hint: Use DateTimeFormatter with custom patterns for date formatting.

Name : Utakarsh Jain
Date : 28/09/2026

*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateFormatting {
    public static void main(String args[]) {
        DateFormatting obj = new DateFormatting();
        obj.displayDate();
    }
    public void displayDate() {
        LocalDate date = LocalDate.now(); //Getting the current date
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Formatting the date in dd/MM/yyyy format
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd"); //Formatting the date in yyyy-MM-dd format
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy"); //Formatting the date in EEE, MMM dd, yyyy format
        System.out.println("dd/MM/yyyy: " + date.format(formatter1)); //Printing the date in dd/MM/yyyy format
        System.out.println("yyyy-MM-dd: " + date.format(formatter2)); //Printing the date in yyyy-MM-dd format
        System.out.println("EEE, MMM dd, yyyy: " + date.format(formatter3)); //Printing the date in EEE, MMM dd, yyyy format
    }
}

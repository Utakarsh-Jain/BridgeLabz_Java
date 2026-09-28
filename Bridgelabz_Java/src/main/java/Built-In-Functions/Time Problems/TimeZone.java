/*

/*
Problem 14: Time Zones and ZonedDateTime Write a program that displays the current
time in different time zones:
➢ GMT (Greenwich Mean Time)
➢ IST (Indian Standard Time)
➢ PST (Pacific Standard Time)
Hint: Use ZonedDateTime and ZoneId to work with different time zones.

Name : Utakarsh Jain
Date : 28/09/2026

*/

import java.time.*;
public class TimeZone {
    public static void main(String args[]) {
        TimeZone obj = new TimeZone();
        obj.displayTime();
    }
    public void displayTime() {
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT")); //Getting the current time in GMT
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata")); //Getting the current time in IST
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/New_York")); //Getting the current time in PST
        System.out.println("GMT: " + gmt);
        System.out.println("IST: " + ist);
        System.out.println("PST: " + pst);
    }
}

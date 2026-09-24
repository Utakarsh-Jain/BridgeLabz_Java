/*
Problem 7 - OTP Array Method Level 3
Write a program to generate a six-digit OTP number using Math.random() method. Validate the numbers are unique by generating the OTP number 10 times and ensuring all the 10 OTPs are not the same
Hint => 
Write a method to Generate a 6-digit OTP number using Math.random() 
Create an array to save the OTP numbers generated 10 times
Write a method to ensure that the OTP numbers generated are unique. If unique return true else return false

Author : <Utakarsh Jain>
* Date : 24-09-2026
*/
import java.util.*;
class OTP {
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }
    public static boolean isUnique(int[] otpNumbers, int currentIndex, int otp) {
        for (int i = 0; i < currentIndex; i++) {
            if (otpNumbers[i] == otp) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        int otpNumbers[] = new int[10];
        for (int i = 0; i < otpNumbers.length; i++) {
            int otp;
            do {
                otp = generateOTP();
            } while (!isUnique(otpNumbers, i, otp));
            otpNumbers[i] = otp;
        }
        System.out.println("Generated OTPs:");
        for (int otp : otpNumbers) {
            System.out.println(otp);
        }
        System.out.println("All 10 OTPs are unique: true");
    }
}

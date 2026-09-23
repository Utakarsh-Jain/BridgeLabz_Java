/*
Problem 2 - GCR Array Method Level 1
Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for number of students
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Write a method to use the combination formulae to calculate the number of handshakes

Author : <Utakarsh Jain>
* Date : 23-09-2026
*/
import java.util.Scanner;
class Handshakes {
    public int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2; //calculating the number of handshakes
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt(); //asking the user to enter the number of students
        Handshakes obj = new Handshakes();
        int handshakes = obj.calculateHandshakes(n); //calling the method to calculate the number of handshakes
        System.out.println("Maximum number of handshakes: " + handshakes); 
        sc.close();
    }
}

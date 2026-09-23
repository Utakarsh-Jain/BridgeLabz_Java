/*
Problem 4 - GCR Array Method Level 1
An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => 
Take user input for 3 sides of a triangle 
The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
Write a Method to compute the number of rounds user needs to do to complete 5km run

Author : <Utakarsh Jain>
* Date : 23-09-2026
*/
import java.util.Scanner;
class TringularPark
{
    public double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3; //calculating the perimeter of the park
        double rounds = 5000 / perimeter; //calculating the amount of rounds to be completed for 5km run
        return rounds; //retuning the amount of rounds
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1:");
        double side1 = sc.nextDouble(); //taking the value of side 1 from user
        System.out.print("Enter side 2:");
        double side2 = sc.nextDouble(); //taking the value of side 2 from user
        System.out.print("Enter side 3:");
        double side3 = sc.nextDouble(); //taking the value of side 3 from user
        TringularPark obj = new TringularPark();
        double rounds = obj.calculateRounds(side1, side2, side3); //calling the method to calculate the number of rounds
        System.out.println("Number of rounds: " + rounds);
        sc.close(); 
    }
}
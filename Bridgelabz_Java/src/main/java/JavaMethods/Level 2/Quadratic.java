/*
Problem 11 - GCR Array Method Level 2
Write a program Quadratic to find the roots of the equation ax2+ bx + c. Use Math functions Math.pow() and Math.sqrt()
Hint => 
Take a, b, and c as input values to find the roots of x.
The roots are computed using the following formulae
delta = b2+ 4*a*c
If delta is positive the find the two roots using formulae 
root1 of x = (-b + delta)/(2*a) 
root1 of x = (-b - delta)/(2*a)
If delta is zero then there is only one root of x  
root of x = -b/(2*a)
If delta is negative return empty array or nothing 
Write a Method to find find the roots of a quadratic equation and return the roots
Author : <Utakarsh Jain>
* Date : 23-09-2026
*/

import java.util.Scanner;
public class Quadratic {
    public double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta >= 0) {
            double[] roots = new double[2];
            roots[0] = (-b + Math.sqrt(delta)) / (2 * a);
            roots[1] = (-b - Math.sqrt(delta)) / (2 * a);
            return roots;
        } else {
            return new double[0]; //return empty array if delta is negative
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        Quadratic obj = new Quadratic();
        double[] roots = obj.findRoots(a, b, c);
        if (roots.length == 0) {
            System.out.println("No real roots found");
        } else if (roots.length == 1) {
            System.out.println("Only one root found: " + roots[0]);
        } else {
            System.out.println("Two roots found: " + roots[0] + " and " + roots[1]);
        }
        sc.close();
    }
}

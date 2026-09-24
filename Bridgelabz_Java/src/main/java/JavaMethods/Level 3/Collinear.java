/*

Write a program to find the 3 points that are collinear using the slope formulae and area of triangle formulae. check  A (2, 4), B (4, 6) and C (6, 8) are Collinear for sampling. 
Hint => 
Take inputs for 3 points x1, y1, x2, y2, and x3, y3
Write a Method to find the 3 points that are collinear using the slope formula. The 3 points A(x1,y1), b(x2,y2), and c(x3,y3) are collinear if the slopes formed by 3 points ab, bc, and cd are equal. 
slope AB = (y2 - y1)/(x2 - x1), slope BC = (y3 - y2)/(x3 - x3)
slope AC = (y3 - y1)/(x3 - x1) Points are collinear if
slope AB = slope BC = slope Ac
The method to find the three points is collinear using the area of the triangle formula. The Three points are collinear if the area of the triangle formed by three points is 0. The area of a triangle is 
area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2))

*/
import java.util.*;
class Collinear {
    public static boolean areCollinear(double x1, double y1, double x2, double y2, double x3, double y3) {
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1); //Finds the 3 points that are collinear using the slope formula.
    }
    public static boolean areCollinearArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        return 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) == 0; //Finds the 3 points that are collinear using the area of the triangle formula.
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1:");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1:");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2:");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2:");
        double y2 = sc.nextDouble();
        System.out.print("Enter x3:");
        double x3 = sc.nextDouble();
        System.out.print("Enter y3:");
        double y3 = sc.nextDouble();
        if (areCollinear(x1, y1, x2, y2, x3, y3)) { //Checks if the points are collinear
            System.out.println("The points are collinear");
        } else {
            System.out.println("The points are not collinear");
        }
        if (areCollinearArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear");
        } else {
            System.out.println("The points are not collinear");
        }
        sc.close();
    }
}

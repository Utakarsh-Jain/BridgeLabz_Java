import java.util.Scanner;
class FeetConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();
        double feetPerYard = 3;
        double yardsPerMile = 1760;
        double distanceInYards = distanceInFeet / feetPerYard;
        double distanceInMiles = distanceInYards / yardsPerMile;
        System.out.println("The distance in feet is " + distanceInFeet + ", in yards is " + distanceInYards + " and in miles is " + distanceInMiles);
        sc.close();
    }
}
import java.util.Scanner;
class HeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = sc.nextDouble();
        double inchesPerFoot = 12;
        double cmPerInch = 2.54;
        double totalInches = heightInCm / cmPerInch;
        double feet = (int) (totalInches / inchesPerFoot);
        double remainingInches = totalInches % inchesPerFoot;
        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + feet + " and inches is " + remainingInches);
        sc.close();
    }
}
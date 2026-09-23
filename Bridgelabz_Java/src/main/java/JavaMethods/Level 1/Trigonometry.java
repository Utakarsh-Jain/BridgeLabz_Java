import java.util.Scanner;
class Trigonometry {
    public double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); //converting the angle from degrees to radians
        double sine = Math.sin(radians); //calculating the sine of the angle
        double cosine = Math.cos(radians); //calculating the cosine of the angle
        double tangent = Math.tan(radians); //calculating the tangent of the angle
        return new double[]{sine, cosine, tangent};
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: "); //taking the angle from user
        double angle = sc.nextDouble();
        Trigonometry obj = new Trigonometry();
        double result[] = obj.calculateTrigonometricFunctions(angle); //calling the method to calculate the trigonometric functions
        System.out.println("Sine: " + result[0]);
        System.out.println("Cosine: " + result[1]);
        System.out.println("Tangent: " + result[2]);
        sc.close();
    }
}
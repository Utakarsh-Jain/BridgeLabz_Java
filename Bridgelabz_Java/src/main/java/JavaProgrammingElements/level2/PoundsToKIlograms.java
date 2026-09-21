import java.util.Scanner;
class PoundsToKilograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = sc.nextDouble();
        double kilogramsPerPound = 2.2;
        double weightInKg = weightInPounds / kilogramsPerPound;
        System.out.println("The weight of the person in pound is "
                + weightInPounds + " and in kg is "
                + weightInKg);
        sc.close();
    }
}
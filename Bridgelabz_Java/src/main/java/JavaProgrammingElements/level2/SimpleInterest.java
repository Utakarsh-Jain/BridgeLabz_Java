import java.util.Scanner;
class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter time: ");
        double time = sc.nextDouble();
        double simpleInterest =
                (principal * rate * time) / 100;
        System.out.println("The Simple Interest is "
                + simpleInterest
                + " for Principal " + principal
                + ", Rate of Interest " + rate
                + " and Time " + time);
        sc.close();
    }
}
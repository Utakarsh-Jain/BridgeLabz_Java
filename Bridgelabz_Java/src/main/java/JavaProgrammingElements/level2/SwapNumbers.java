import java.util.Scanner;
class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int number2 = sc.nextInt();
        int temporary = number1;
        number1 = number2;
        number2 = temporary;
        System.out.println("The swapped numbers are "
                + number1 + " and " + number2);
        sc.close();
    }
}
import java.util.Scanner;
class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();
        int operation1 = a + b * c;
        int operation2 = a * b + c;
        int operation3 = c + a / b;
        int operation4 = a % b + c;
        System.out.println("The results of Int Operations are "
                + operation1 + ", " + operation2 + ", "
                + operation3 + ", and " + operation4);
        sc.close();
    }
}

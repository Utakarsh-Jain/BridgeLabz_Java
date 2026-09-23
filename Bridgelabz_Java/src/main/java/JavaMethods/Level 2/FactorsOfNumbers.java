/*
Problem 1 - GCR Array Method Level 2
Create a program to find the factors of a number taken as user input, store the factors in an array and display the factors. Also find the sum, sum of square of factors and product of the factors and display the results
Hint => 
Take the input for a number
Write a static Method to find the factors of the number and save them in an array and return the array. 
To find factors and save to array will have two loops. The first loop to find the count and initialize the array with the count. And the second loop save the factors into the array
Write a method to find the sum of the factors using factors array
Write a method to find the product of the factors using factors array
Write a method to find the sum of square of the factors using Math.pow() method

Author : <Utakarsh Jain>
* Date : 23-09-2026
*/
import java.util.Scanner;
class FactorsOfNumber {
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) { //finding the number of factors
            if (number % i == 0) { //checking if the number is divisible by i
                count++;
            }
        }
        int factors[] = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) { //saving the factors into the array
            if (number % i == 0) { //checking if the number is divisible by i
                factors[index] = i;
                index++; //incrementing the index
            }
        }
        return factors;
    }
    public int findSum(int factors[]) {
        int sum = 0;
        for (int factor : factors) { //calculating the sum
            sum += factor;
        }
        return sum;
    }
    public long findProduct(int factors[]) {
        long product = 1;
        for (int factor : factors) { //calculating the product
            product *= factor;
        }
        return product;
    }

    public double findSumOfSquares(int factors[]) {
        double sum = 0;
        for (int factor : factors) { //calculating the sum of square
            sum += Math.pow(factor, 2); 
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        FactorsOfNumber obj = new FactorsOfNumber();
        int factors[] = findFactors(number);
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        int sum = obj.findSum(factors); //calling the method to find the sum
        long product = obj.findProduct(factors); //calling the method to find the product
        double sumOfSquares = obj.findSumOfSquares(factors); //calling the method to find the sum of squares
        System.out.println("\nSum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
    }
}
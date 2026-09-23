/*
Problem 12 - GCR Array Method Level 2
Write a program that generates five 4 digit random values and then finds their average value, and their minimum and maximum value. Use Math.random(), Math.min(), and Math.max().
Hint => 
Write a method that generates array of 4 digit random numbers given the size as a parameter as shown in the method signature 
public int[] generate4DigitRandomArray(int size)
Write a method to find average, min and max value of an array 
public double[] findAverageMinMax(int[] numbers) 
Author : <Utakarsh Jain>
* Date : 23-09-2026
*/
import java.util.*;
class RandomNumberAnalysis {
    public int[] generate4DigitRandomArray(int size) {
        int numbers[] = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return numbers;
    }
    public double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int minimum = numbers[0];
        int maximum = numbers[0];
        for (int number : numbers) {
            sum += number;
            minimum = Math.min(minimum, number);
            maximum = Math.max(maximum, number);
        }
        double average = sum / numbers.length;
        return new double[]{average, minimum, maximum};
    }

    public static void main(String[] args) {
        RandomNumberAnalysis obj = new RandomNumberAnalysis();
        int numbers[] = obj.generate4DigitRandomArray(5);
        double result[] = obj.findAverageMinMax(numbers);
        System.out.println("Random numbers: " + Arrays.toString(numbers));
        System.out.println("Average: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
    }
}
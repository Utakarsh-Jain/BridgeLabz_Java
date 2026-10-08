/*

Bubble Sort - Sort Student Marks
Problem Statement:
A school maintains student marks in an array. Implement Bubble Sort to sort the student marks in ascending order.
Hint:
Traverse through the array multiple times.
Compare adjacent elements and swap if needed.
Repeat the process until no swaps are required.


*/

package main.java.SortingAlogrithms;

public class BubbleSort {

    // Sort student marks using Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] marks = {67, 89, 45, 98, 76};
        System.out.println("Marks before sorting: ");
        printArray(marks);
        bubbleSort(marks);
        System.out.println("Marks after sorting: ");
        printArray(marks);
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }   
    
}

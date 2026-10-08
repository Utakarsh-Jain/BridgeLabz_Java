/* 
Sort a Stack Using Recursion
Problem: Given a stack, sort its elements in ascending order using recursion.
Hint: Pop elements recursively, sort the remaining stack, and insert the popped element back at the correct position.
Name : Utakarsh Jain
Date : 07/10/2026
*/

import java.util.Stack;
public class SortStack {
    // Function to sort the stack using recursion
    public static void sortStack(Stack<Integer> stack) {
        // Base case: If stack is empty, nothing to sort
        if (stack.isEmpty()) {
            return;
        }
        // Remove the top element
        int temp = stack.pop();
        // Recursively sort the remaining stack
        sortStack(stack);
        // Insert the removed element at the correct position
        insertSorted(stack, temp);
    }
    // Function to insert an element at the correct position in a sorted stack
    private static void insertSorted(Stack<Integer> stack, int element) {
        // Base case: If stack is empty or element is greater than top, push it
        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element);
            return;
        }
        // Remove the top element
        int temp = stack.pop();
        // Recursively insert the element
        insertSorted(stack, element);
        // Push the removed element back
        stack.push(temp);
    }
    // Method to display the stack elements
    public static void displayStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        // Create a temporary stack to display in correct order
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()) {
            int element = stack.pop();
            temp.push(element);
        }
        System.out.print("Sorted Stack: ");
        while (!temp.isEmpty()) {
            int element = temp.pop();
            System.out.print(element + " ");
            stack.push(element); // Restore the original stack
        }
        System.out.println();
    }
    // Main method to test the sortStack function
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        // Push elements into the stack
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);
        
        System.out.println("Original Stack:");
        displayStack(stack);
        
        // Sort the stack
        sortStack(stack);
        
        // Display the sorted stack
        displayStack(stack);
    }
}

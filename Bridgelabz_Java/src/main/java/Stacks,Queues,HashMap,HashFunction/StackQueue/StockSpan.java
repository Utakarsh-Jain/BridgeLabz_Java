/*
Stock Span Problem
Problem: For each day in a stock price array, calculate the span (number of consecutive days the price was less than or equal to the current day's price).
Hint: Use a stack to keep track of indices of prices in descending order.
Name : Utakarsh Jain
Date : 07/10/2026
*/
public class StockSpan {
    // Method to calculate stock spans
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] spans = new int[n];
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        for (int i = 0; i < n; i++) {
            // Pop elements from stack while stack is not empty and price at stack top is less than or equal to current price
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }
            // If stack is empty, span is i + 1 (all previous days)
            // Otherwise, span is the difference between current index and stack top index
            spans[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            // Push current index onto stack
            stack.push(i);
        }
        return spans;
    }
    // Method to display the stock spans
    public static void displaySpans(int[] prices, int[] spans) {
        System.out.println("Day | Price | Span");
        System.out.println("---------------------");
        for (int i = 0; i < prices.length; i++) {
            System.out.printf("%3d | %5d | %4d\n", (i + 1), prices[i], spans[i]);
        }
    } 
    // Main method to test the stockSpan function
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};  
        System.out.println("Stock Prices:");
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println("\n");    
        // Calculate spans
        int[] spans = calculateSpan(prices);
        // Display spans
        displaySpans(prices, spans);
    }
}

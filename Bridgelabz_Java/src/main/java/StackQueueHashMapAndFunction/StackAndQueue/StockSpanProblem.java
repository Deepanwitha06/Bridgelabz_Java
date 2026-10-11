package StackQueueHashMapAndFunction.StackAndQueue;
import java.util.Stack;
import java.util.Arrays;

public class StockSpanProblem {
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Remove indices whose prices are <= current price
            while (!stack.isEmpty() &&
                    prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // Calculate the span
            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }

            // Store the current day's index
            stack.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] span = calculateSpan(prices);

        System.out.println("Stock Prices: " +Arrays.toString(prices));
        System.out.println("Stock Spans:  " +Arrays.toString(span));
    }
}
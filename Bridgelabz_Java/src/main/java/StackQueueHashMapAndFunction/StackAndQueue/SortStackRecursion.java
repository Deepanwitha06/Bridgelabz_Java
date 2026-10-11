package StackQueueHashMapAndFunction.StackAndQueue;
import java.util.Stack;
public class SortStackRecursion {
    // Insert an element in its correct position
    public static void insertSorted(Stack<Integer> stack, int value) {
        // Base case: stack is empty or top is smaller than value
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;
        }

        // Remove the top element temporarily
        int top = stack.pop();

        // Recursively find the correct position
        insertSorted(stack, value);

        // Restore the removed element
        stack.push(top);
    }

    // Sort the stack using recursion
    public static void sortStack(Stack<Integer> stack) {
        // Base case
        if (stack.isEmpty()) {
            return;
        }

        // Remove the top element
        int top = stack.pop();

        // Sort the remaining stack
        sortStack(stack);

        // Insert the removed element in sorted order
        insertSorted(stack, top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(30);
        stack.push(10);
        stack.push(40);
        stack.push(20);

        System.out.println("Original Stack: " + stack);

        sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
        System.out.println("Smallest element: " + stack.firstElement());
        System.out.println("Largest element: " + stack.peek());
    }
}
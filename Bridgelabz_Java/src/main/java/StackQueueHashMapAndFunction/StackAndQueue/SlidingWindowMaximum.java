package StackQueueHashMapAndFunction.StackAndQueue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Arrays;

public class SlidingWindowMaximum {
    public static void findMaximum(int[] arr,int k) {
        Deque<Integer> deque=new ArrayDeque<>();
        for(int i=0;i<arr.length;i++) {
            // Remove indices outside the current window
            while(!deque.isEmpty() && deque.peekFirst()<=i-k) {
                deque.pollFirst();
            }
            // Remove smaller elements from the back
            while(!deque.isEmpty() && arr[deque.peekLast()]<arr[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            // Print maximum when the first window is complete
            if(i>=k-1) {
                System.out.print(arr[deque.peekFirst()]+" ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,3,-1,-3,5,3,6,7};
        int k=3;
        System.out.println("Array: "+Arrays.toString(arr));
        System.out.print("Window maximums: ");
        findMaximum(arr,k);
    }
}
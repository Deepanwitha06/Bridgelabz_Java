package Sorting;
import java.util.Arrays;
public class HeapSort {
    public static void heapSort(int[] salaries) {
        int n = salaries.length;

        // Build a Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Extract the largest element one by one
        for (int i = n - 1; i > 0; i--) {
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Restore the Max Heap for the remaining elements
            heapify(salaries, i, 0);
        }
    }

    public static void heapify(int[] salaries, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check whether the left child is larger
        if (left < n && salaries[left] > salaries[largest]) {
            largest = left;
        }

        // Check whether the right child is larger
        if (right < n && salaries[right] > salaries[largest]) {
            largest = right;
        }

        // If a child is larger, swap and continue heapifying
        if (largest != i) {
            int temp = salaries[i];
            salaries[i] = salaries[largest];
            salaries[largest] = temp;

            heapify(salaries, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] salaries = {45000, 25000, 60000, 30000, 50000};

        System.out.println("Before sorting: " + Arrays.toString(salaries));

        heapSort(salaries);

        System.out.println("After sorting: " + Arrays.toString(salaries));
    }
}

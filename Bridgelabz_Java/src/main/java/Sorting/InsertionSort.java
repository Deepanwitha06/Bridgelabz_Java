package Sorting;
import java.util.Arrays;
/*
      array into sorted and unsorted...
      while comparing each element from undorted with the sorted and place it in proper position
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] employeeIds = {105, 102, 108, 101, 104};

        System.out.println("Before sorting: " + Arrays.toString(employeeIds));

        //insertion sort
        for(int i=1;i<employeeIds.length;i++){
            int key=employeeIds[i];
            int j=i-1;
            while(j>=0 && employeeIds[j]>key){
                employeeIds[j+1]=employeeIds[j];
                j--;
            }
            employeeIds[j+1]=key;
        }
        System.out.println("After sorting: " + Arrays.toString(employeeIds));
    }
}
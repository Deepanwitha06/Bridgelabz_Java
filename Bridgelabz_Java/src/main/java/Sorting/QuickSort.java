package Sorting;
import java.util.Arrays;
/*
      take a pivot..all the small ones than pivot to left and greater ones to right
      lower bound is fist element in array and upper bound is last
      start from lower bound....traverse start till start is grater than pivot
      end from upper bound ...traverse till end is till lower or equal to pivot
        then swap start and end only if start<end
             else swap pivot and end
             then we get pivots correct position
 */
public class QuickSort {
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void quickSort(int[] arr,int lb,int ub){
       if(lb<ub) {
           int loc = partiton(arr, lb, ub);
           quickSort(arr, lb, loc - 1);
           quickSort(arr, loc + 1, ub);
       }
    }
    public static int partiton(int[] arr,int lb,int ub){
        int start=lb;
        int end=ub;
        int pivot=arr[lb];
        while(start<end){
            while (start<=ub && arr[start]<=pivot){
                start++;
            }
            while(end>=lb&&arr[end]>pivot){
                end--;
            }
            if(start<end){
                swap(arr,start,end);
            }
        }
        swap(arr,lb,end);
        return end;
    }

    public static void main(String[] args) {
        int[] prices = {450, 120, 300, 150, 500, 200};

        System.out.println("Before sorting: " + Arrays.toString(prices));

        quickSort(prices, 0, prices.length - 1);

        System.out.println("After sorting: " + Arrays.toString(prices));
    }
}
package Sorting;
import java.util.Arrays;
/*
       mergesort : divide the arrays into half continuously
                  and combine by while keeping them in order
 */
public class MergeSort {
    public static void mergesort(int[] arr,int left,int right){
        if(left<right){
            int mid=left+(right-left)/2;
            mergesort(arr,left,mid);
            mergesort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }

    public static void merge(int[] arr,int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;

        int[] leftarr=new int[n1];
        int[] rightarr=new int[n2];

        for(int i=0;i<n1;i++){
            leftarr[i]=arr[left+i];
        }
        for(int j=0;j<n2;j++){
            rightarr[j]=arr[mid+1+j];
        }
        int i=0;
        int j=0;
        int k=left;
        while(i<n1 && j<n2){
            if(leftarr[i]>=rightarr[j]){
                arr[k]=rightarr[j];
                j++;
            }else{
                arr[k]=leftarr[i];
                i++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=leftarr[i];
            k++;
            i++;
        }
        while(j<n2){
            arr[k]=rightarr[j];
            k++;
            j++;
        }
    }
    public static void main(String[] args) {
        int[] prices = {450, 120, 300, 150, 500, 200};

        System.out.println("Before sorting: " + Arrays.toString(prices));

        mergesort(prices, 0, prices.length - 1);

        System.out.println("After sorting: " + Arrays.toString(prices));
    }
}

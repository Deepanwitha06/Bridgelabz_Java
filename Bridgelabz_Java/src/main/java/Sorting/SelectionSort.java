package Sorting;
import java.util.Arrays;
/*
      selection sort like bubble sort but,
          for i loop ,,minIndex=i
              then j loop compares with minindex value instead of j+1 and minIndex=j
              then swap i and min;
 */
public class SelectionSort{
    public static void main(String[] args) {
        int[] scores = {78, 45, 92, 60, 35};

        System.out.println("Before sorting: " + Arrays.toString(scores));

        //selection sort
        for(int i=0;i<scores.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<scores.length;j++){
                if(scores[minIndex]>scores[j]){
                    minIndex=j;
                }
            }
            int temp=scores[i];
            scores[i]=scores[minIndex];
            scores[minIndex]=temp;
        }

        System.out.println("After sorting: " + Arrays.toString(scores));
    }
}

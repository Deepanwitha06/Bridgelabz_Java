package Sorting;
import java.util.Arrays;
/*
       bubble sort: compare side by side ones
 */
public class BubbleSort{
    public static void main(String[] args) {
        int[] marks = {75, 45, 90, 60, 30};

        System.out.println("Before sorting: " + Arrays.toString(marks));

        //bubble sort
        for(int i=0;i<marks.length-1;i++){
            boolean swapped=false;
            for(int j=0;j<marks.length-i-1;j++){
                if(marks[j]>marks[j+1]){
                    int temp=marks[j];
                    marks[j]=marks[j+1];
                    marks[j+1]=temp;
                    swapped=true;
                }

            }
            if(swapped==false){
                break;
            }
        }
        System.out.println("After sorting: "+Arrays.toString(marks));
    }

}
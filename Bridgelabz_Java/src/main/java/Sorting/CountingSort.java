package Sorting;
import java.util.Arrays;
public class CountingSort{
    public static int[] countingSort(int[] ages){
        int min=10;
        int max=18;
        int[] count=new int[max-min+1];

        for(int i:ages){
            count[i-min]++;
        }

        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }

        int index=0;
        int[] output=new int[ages.length];
        for(int i=ages.length-1;i>=0;i--){
            int ageIndex=ages[i]-10;
            output[count[ageIndex]-1]=ages[i];
            count[ageIndex]--;
        }
        return output;
    }
    public static void main(String[] args) {
        int[] ages = {15, 12, 18, 10, 12, 16, 15, 11};

        System.out.println("Before sorting: " + Arrays.toString(ages));

        int[] sortedAges = countingSort(ages);

        System.out.println("After sorting: " + Arrays.toString(sortedAges));
    }
}

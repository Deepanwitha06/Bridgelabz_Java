package javaMethods.level2;
import java.util.Scanner;
import java.lang.Math;
/* create a class to  generates five 4 digit random values and
        then finds their average value,
         and their minimum and maximum value
 */
public class MinMaxRandom {
    //create a method to generate array of 4 digit random numbers of given size
    public int[] generate4DigitRandomArray(int size){
        int[] array=new int[size];
        for (int i=0;i<size;i++){
            array[i]=(int)(Math.random()*9000)+1000;
        }
        return array;
    }

    //create an array to calculate
    public double[] findAverageMinMax(int[] numbers){
        double sum=0;
        double max=numbers[0];
        double min=numbers[0];
        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
            max=Math.max(max,numbers[i]);
            min=Math.min(min,numbers[i]);
        }
        double avg=sum/(numbers.length);
        double[] result={avg,min,max};
        return result;
    }

    public static void main(String[] args){
        //create scanner object and class object
        Scanner input=new Scanner(System.in);
        MinMaxRandom mmr=new MinMaxRandom();

        //create variables and take input
        System.out.println("Enter the size:");
        int size=input.nextInt();

        //calling methods
        int[] array= mmr.generate4DigitRandomArray(size);
        System.out.println("the numbers are :");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]+" ");
        }
        double[] result= mmr.findAverageMinMax(array);
        System.out.println("The average , minimum and maximum of the numbers are "+result[0]+", "+result[1]+" and "+result[2]);
        input.close();
    }
}

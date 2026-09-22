package javaArrays;
import java.util.Scanner;
//create class to calculate mean of the heights
public class MeanHeight {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create array to collect the heights of players
        double[] heights=new double[11];
        System.out.println("Enter the heights of everyone in the team:");
        for(int i=0;i<heights.length;i++){
            heights[i]=input.nextDouble();
        }

        //calculating mean
        double total=0;
        for(int i=0;i<heights.length;i++){
            total+=heights[i];
        }
        System.out.println("The mean height is "+(total/heights.length));
        input.close();
    }
}

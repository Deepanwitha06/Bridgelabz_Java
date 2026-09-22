package javaArrays;
import java.util.Scanner;
//create class to convert 2D array to 1D array
public class TwotoOneDimension {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create array and take input
        System.out.println("Enter no.of rows and columns:");
        int row=input.nextInt();
        int col=input.nextInt();
        int[][] array2D=new int[row][col];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                array2D[i][j]=input.nextInt();
            }
        }

        //converting 2D to 1D array
        int index=0;
        int[] array1D=new int[row*col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                array1D[index]=array2D[i][j];
                index++;
            }
        }
        System.out.println("The 1D array is :");
        for(int i=0;i<array1D.length;i++){
            System.out.print(array1D[i]+" ");
        }
        input.close();
    }
}

package javaArrays;
import java.util.Scanner;
//creating class to display multiplication table from 6 to 9
public class MultiplicationSixToNine {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variable and take user input
        System.out.print("Enter the number:");
        int number=input.nextInt();

        //create multiplication table array named result and store the values in it
        int[] result=new int[4];
        for(int i=0;i<result.length;i++){
            result[i]=number*(i+1);
        }

        //display the table
        System.out.println("Multiplication Table of "+number);
        for(int i=0;i<result.length;i++){
            System.out.println(number+" * "+(i+6)+" = "+result[i]);
        }
        input.close();
    }
}

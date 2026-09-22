package javaArrays;
import java.util.Scanner;
//create class to show all numbers and sum till the number is zero ro neagtive
public class SumTillZeroorNegative {
    public static void main(String[] args){
        //create a scanner object
        Scanner input=new Scanner(System.in);

        //create array and initialize required variables
        double[] n=new double[10];
        double total=0;
        int index=0;

        while(true){
            if (index==n.length){
                break;
            }
            System.out.println("Enter a number:");
            int num=input.nextInt();
            if(num<=0){
                break;
            }
            n[index]=num;
            index++;
        }
        System.out.println("The numbers are : ");
        for(int i=0;i<index;i++){
            System.out.println(n[i]);
            total+=n[i];
        }
        System.out.println("Sum = "+total);
        input.close();
    }
}

package javaControlFlow.level1;
import java.util.Scanner;
//creating a class to add the user inputs till it is zero or negative
public class SumUntillZeroorNegative {
    public static void main(String[] args){
        //creating scanner object
        Scanner input=new Scanner(System.in);

        //initializing variables
        double total=0;
        double n;
        //infinite while loop break when zero or infinite
        while(true){
            System.out.print("Enter a number:");
            n=input.nextDouble();
            if(n<=0){
                break;
            }

            total+=n;
        }
        System.out.print("Total = "+total);
        input.close();
    }
}

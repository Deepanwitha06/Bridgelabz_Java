package javaStrings.BuiltinFunctions;
import java.util.Scanner;
/*
   create a class to display the fibonacci series upto specified no.of terms
 */
public class Fibonacci {
    // amethod for the series
    public static void series(int n){
        int count=0;
        int i=0;
        int j=1;
        while(count<n){
            System.out.println(i+" ");
            int temp=i+j;
            i=j;
            j=temp;
            count++;
        }
    }

    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create a variable and take user input
        System.out.println("Enter the no.of numbers in seriess:");
        int n=input.nextInt();

        series(n);

        input.close();
    }
}

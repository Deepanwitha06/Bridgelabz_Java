package javaControlFlow.level1;
import java.util.Scanner;
//creating class to add the inputs till the input is zero
public class SumUntilZero {
    public static void main(String[] main){
        //creating scanner object
        Scanner input=new Scanner(System.in);

        //initialize variables to 0
        double total=0;
        double n;

        //Enter a number
        System.out.println("Enter a number:");
        n=input.nextDouble();

        //while loop for collecting variables till the input is zero and add them
        while(n!=0){
            total+=n;
            System.out.println("Enter a number:");
            n=input.nextDouble();
        }
        System.out.print("Total = "+total);
        input.close();

    }
}

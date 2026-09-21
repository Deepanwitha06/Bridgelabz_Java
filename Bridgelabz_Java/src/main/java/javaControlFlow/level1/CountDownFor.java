package javaControlFlow.level1;
import java.util.Scanner;
//creating class to print countdown using for loop
public class CountDownFor {
    public static void main(String[] args){
        //creating scanner onject
        Scanner input=new Scanner(System.in);

        //creating variable for counter and take user input
        System.out.print("Enter the countdown start:");
        int counter=input.nextInt();

        //for loop for countdown
        for(int i=counter;i>=1;i--){
            System.out.println(i);
        }
        input.close();
    }
}

package javaControlFlow.level1;
import java.util.Scanner;
//creating class to check whether given numver is positive,negative or zero
public class Positivenegativezero {
    public static void main(String[] args){
        //creating scanner object
        Scanner input=new Scanner(System.in);

        //Creating variable and taking user input
        System.out.print("Enter a number: ");
        int number=input.nextInt();

        //checking positive,negative or zero
        System.out.print(number==0?"Zero":(number>0?"Positive":"Negative"));
        input.close();
    }
}

package javaControlFlow.level3;
import java.util.Scanner;
//create a class to count the no.od digits in a number
public class digitsCount {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create a variable and take user input
        System.out.print("Enter the number: ");
        int number=input.nextInt();

        //counting no.of digits
        int count=0;
        while(number!=0){
            number=number/10;
            count++;
        }
        System.out.print("The given number contains "+count+" no.of digits");
        input.close();
    }
}

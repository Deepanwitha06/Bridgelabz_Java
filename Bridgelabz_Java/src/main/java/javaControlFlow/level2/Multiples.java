package javaControlFlow.level2;
import java.util.Scanner;
//create a class for displaying multiples of a number below 100
public class Multiples {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variable and take user input
        System.out.print("Enter the number:");
        int number=input.nextInt();
        System.out.println("Multiples below 100 are:");
        //display multiples
        for(int i=100;i>=1;i--){                      // for(int i=100;i>=number;
            if(i%number==0){
                System.out.println(i);
            }
        }
    }
}

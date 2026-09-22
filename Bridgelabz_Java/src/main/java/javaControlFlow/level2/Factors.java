package javaControlFlow.level2;
import java.util.Scanner;
//create a class to print factors
public class Factors {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create a variable and take user input
        System.out.print("Enter the number : ");
        int number=input.nextInt();
        System.out.println("Factors of the number are:");
        //print factors
        for(int i=1;i<number;i++){
            if(number%i==0){
                System.out.println(i);
            }
        }
        input.close();
    }
}

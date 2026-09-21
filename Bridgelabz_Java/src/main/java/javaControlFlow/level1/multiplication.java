package javaControlFlow.level1;
import java.util.Scanner;

//creating a class to print multiplication table from 6 to9
public class multiplication {
    public static void main(String[] args){
        //creating scanner object
        Scanner input=new Scanner(System.in);

        //create variable and take user input
        System.out.print("Enter the number:");
        int num=input.nextInt();
        for(int i=6;i<10;i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
        input.close();

    }
}

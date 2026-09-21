package javaControlFlow.level1;
import java.util.Scanner;

//creating class for calculating bonus
public class bonus {
    public static void main(String[] args){
        //creating scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take user inputs
        System.out.print("Enter the salary and year of service :");
        double salary=input.nextInt();
        int yos=input.nextInt();

        //calculating bonus
        if(2024-yos>5){
            double bonus= (salary)*0.05;
            System.out.print("Bonus : "+bonus);
        }else{
            System.out.print("No bonus");
        }
        input.close();

    }
}

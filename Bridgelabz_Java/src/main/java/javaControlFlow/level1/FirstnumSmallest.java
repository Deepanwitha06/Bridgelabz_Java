package javaControlFlow.level1;
import java.util.Scanner;

//Creating class to check whether first number among given three numbers is smallest or not
public class FirstnumSmallest {
    public static void main(String[] args){
        //Creating Scanner object
        Scanner input= new Scanner(System.in);

        //Creating variables for 3 numbers and taking user inputs
        System.out.println("Enter three numbers:");
        int number1=input.nextInt();
        int number2=input.nextInt();
        int number3=input.nextInt();

        //Comparing the first number with other 2 numbers
        if (number1<number2 && number1<number3){
            System.out.print("Is the first number the smallest? yes");
        } else{
            System.out.print("Is the first number the smallest? No");
        }
        input.close();
    }
}

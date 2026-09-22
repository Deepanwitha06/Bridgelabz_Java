package javaControlFlow.level3;
import java.util.Scanner;
//create a class that function as calculator using switch....case
public class calculator {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take user input
        System.out.print("Enter the two numbers and the operator:");
        double first=input.nextDouble();
        double second=input.nextDouble();
        String op=input.next();

        switch(op){
            case "+":
                System.out.print("Result = "+(first+second));
                break;
            case "-":
                System.out.print("Result = "+(first-second));
                break;
            case "*":
                System.out.print("Result = "+(first*second));
                break;
            case "/":
                System.out.print("Result = "+(first/second));
                break;
            default:
                System.out.println("Invalid operator");
        }
        input.close();
    }
}

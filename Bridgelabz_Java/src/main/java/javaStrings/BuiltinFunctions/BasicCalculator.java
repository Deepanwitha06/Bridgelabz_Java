package javaStrings.BuiltinFunctions;
import java.util.Scanner;
/*
   create a class to perform basic calculator operations
 */
public class BasicCalculator {
    // a method to perform addition
    public static double addition(double num1,double num2){
        return num1+num2;
    }

    // a method to perform subtraction
    public static double subtraction(double num1,double num2){
        return num1-num2;
    }

    // a method to perform multiplication
    public static double multiplication(double num1,double num2){
        return num1*num2;
    }

    // a method to perform division
    public static double division(double num1,double num2){
        return num1/num2;
    }

    // a method to display
    public static void display(double result){
        System.out.println("The result is "+result);
    }

    public static void main(String[] args){
        //create a scanner object
        Scanner input=new Scanner(System.in);

        System.out.println("Enter two number: ");
        double num1=input.nextDouble();
        double num2=input.nextDouble();
        System.out.println("Choose the operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice=input.nextInt();


        if(choice>=1 && choice<=4){

            if(choice==1){
                display(addition(num1,num2));
            }else if(choice==2){
                display(subtraction(num1,num2));
            }else if(choice==3){
                display(multiplication(num1,num2));
            }else{
                display(division(num1,num2));
            }
        }else{
            System.out.println("Invalid choice");
        }

        input.close();
    }
}
package javaStrings.BuiltinFunctions;
import java.util.Scanner;
/*
   create a class to find GCD and LCM of two numbers
 */
public class GcdLcm {
    // a method to find GCD
    public static int gcd(int num1,int num2){
        int gcd=1;
        for(int i=1;i<=num1 && i<=num2;i++){
            if(num1%i==0 && num2%i==0){
                gcd=i;
            }
        }
        return gcd;
    }

    // a method to find LCM
    public static int lcm(int num1,int num2){
        int lcm;
        lcm=(num1*num2)/gcd(num1,num2);
        return lcm;
    }

    // a method to display
    public static void display(int gcd,int lcm){
        System.out.println("GCD is "+gcd);
        System.out.println("LCM is "+lcm);
    }

    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take user input
        System.out.println("Enter two numbers:");
        int num1=input.nextInt();
        int num2=input.nextInt();

        int gcdResult=gcd(num1,num2);
        int lcmResult=lcm(num1,num2);

        display(gcdResult,lcmResult);

        input.close();
    }
}
package javaStrings.BuiltinFunctions;
import java.util.Scanner;
/*
     A class to check whether prime or not
 */
public class IsPrime {
    //a method to check prime
    public static String primeChecker(int num){
        if(num<2){
            return "Not a prime";
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                return "Not a prime";
            }
        }
        return "A prime";
    }

    public static void main(String[] args){
        //create a scanner object
        Scanner input=new Scanner(System.in);

        //create a variable and take user input
        System.out.println("Enter the number: ");
        int num=input.nextInt();
        System.out.println(primeChecker(num));

        input.close();
    }
}

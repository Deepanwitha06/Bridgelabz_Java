package javaMethods.level2;
import java.util.Scanner;
/* create a class to mal=ke comparisions
   Comparisions : negative or positive
                             - even or odd
                             - equal,greater or less
 */
public class NumberComparisions {
    //create a method to check whether given number is positive or negative
    public static boolean isPositive(int n){
        if(n>=0){
            return true;
        }else{
            return false;
        }
    }

    //create method to check whether the positive number is even or odd
    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static int compare(int number1,int number2){
        if(number1>number2){
            return 1;
        }else if(number1==number2){
            return 0;
        }else{
            return -1;
        }
    }

    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create an array to collect the inputs
        System.out.println("Enter any 5 numbers: ");
        int[] numbers=new int[5];
        for(int i=0;i<5;i++){
            numbers[i]=input.nextInt();
        }

        //methods calling
        for(int i=0;i<5;i++){
            if(isPositive(numbers[i])){
                System.out.print("The given number is Positive and ");
                if(isEven(numbers[i])){
                    System.out.println("even");
                }else{
                    System.out.println("Odd");
                }
            }else{
                System.out.println("The given number is Negative");
            }
        }

        //comparing first and last elements
        int result=compare(numbers[0],numbers[4]);
        if(result==1){
            System.out.println("The first number is greater than the last number");
        }else if(result==0){
            System.out.println("The first number and the last number are equal");
        }else{
            System.out.println("The first number is smaller than the last element");
        }

        input.close();
    }
}

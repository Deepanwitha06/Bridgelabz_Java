package javaArrays;
import java.util.Scanner;
//create class for some comparisons
public class NumberCheck {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create array and  collect 5 numbers
        System.out.println("Enter any 5 numbers: ");
        int[] numbers=new int[5];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=input.nextInt();
        }

        //check conditions
        for (int i=0;i<numbers.length;i++){
            if(numbers[i]==0){                                                //check positive,negative or zero
                System.out.println(numbers[i]+" is Zero");
            }else if(numbers[i]<0){
                System.out.println(numbers[i]+" is Neagtive");
            }else{
                System.out.print(numbers[i]+" is Positive");
                if (numbers[i]%2==0){                                        //if positive check even or odd
                    System.out.println(" and a even number");
                }else{
                    System.out.println(" and a odd number");
                }
            }
        }

        //compare first and last element
        if(numbers[0]==numbers[numbers.length-1]){
            System.out.println("First and last numbers are equal");
        }else if(numbers[0]>numbers[numbers.length-1]){
            System.out.println("First number is greater than last number");
        }else{
            System.out.println("First number is les than last number");
        }
        input.close();
    }
}

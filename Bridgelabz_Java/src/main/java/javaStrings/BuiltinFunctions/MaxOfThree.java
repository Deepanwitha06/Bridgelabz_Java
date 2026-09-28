package javaStrings.BuiltinFunctions;
import java.util.Scanner;
/*
    create a class to find the maximum of three numbers
    Modularity function
 */
public class MaxOfThree {
    //a method to take inputs
    public static int[] getInput(){
        //create scanner variable
        Scanner input=new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int n1=input.nextInt();
        int n2=input.nextInt();
        int n3=input.nextInt();;
        int[] userInput={n1,n2,n3};
        return userInput;

    }

    //a method to compare
    public static int maxNumber(int[] numbers){
        int max=numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(max<numbers[i]){
                max=numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] numbers=getInput();
        int max=maxNumber(numbers);
        System.out.println("Maximum= "+max);
    }
}

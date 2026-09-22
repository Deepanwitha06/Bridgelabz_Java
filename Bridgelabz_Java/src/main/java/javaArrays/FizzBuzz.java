package javaArrays;
import java.util.Scanner;
//create a class to display Fizz for multiple of 3 ,Buzz for multiple of 5 ,FizzBuzz for multiple of both and number in other case
public class FizzBuzz {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variable and take user input
        System.out.print("Enter the number:");
        int number=input.nextInt();
        String[] result=new String[number];

        //pattern
        if(number>0) {
            for (int i = 1; i <=number; i++) {
                if (i%3==0 && i%5==0){
                    result[i-1]="FizzBuzz";
                }else if(i%3==0){
                    result[i-1]="Fizz";
                }else if(i%5==0){
                    result[i-1]="Buzz";
                }else{
                    result[i-1]=String.valueOf(i);
                }
            }
        }
        for(int i=0;i<number;i++){
            System.out.println(result[i]);
        }
        input.close();
    }
}

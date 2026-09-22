package javaArrays.level2;
import java.util.Scanner;
//create a class to reverse a number
public class ReverseANumuber {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //Create a variable and take user input
        System.out.println("Enter the number:");
        int number=input.nextInt();
        int temp=number;
        int count=0;
        //count no.od digits
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        //to take the digits of the number in the same order
        int[] digits=new int[count];
        for(int i=0;i<count;i++){
            digits[count-1-i]=number%10;
            number=number/10;
        }
        //display reversed number
        System.out.println("Reversed Number =");
        for(int i=count-1;i>=0;i--){
            System.out.print(digits[i]);
        }
        input.close();
    }
}

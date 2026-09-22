package javaArrays.level2;
import java.util.Scanner;
//create a class Frequency of digit
public class FrequencyOfDigit {
    public static void main(String[] args){
        //create scanner input
        Scanner input=new Scanner(System.in);

        //Create a variable and user input
        System.out.println("Enter the number:");
        int number=input.nextInt();
        int count=0;
        int temp=number;

        //count the digits
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        //Digits
        int[] digits=new int[count];
        int index=0;
        temp=number;
        while(temp!=0){
            digits[index]=temp%10;
            temp=temp/10;
            index++;
        }
        int[] freq=new int[10];
        for(int i=0;i<count;i++){
            freq[digits[i]]++;
        }
        System.out.println("Digit frequency: ");
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.println(i+" = "+freq[i]);
            }
        }
        input.close();
    }
}

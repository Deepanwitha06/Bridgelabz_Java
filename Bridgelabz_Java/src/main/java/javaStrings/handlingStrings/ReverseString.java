package javaStrings.handlingStrings;
import java.util.Scanner;
/*
Reverse a string without using built in reverse functions
 */
public class ReverseString {
    //a method to reverse the string
    public static void stringReverse(String text){
        int len=text.length();
        String result="";
        for(int i=len-1;i>=0;i--){
            result+=text.charAt(i);
        }
        System.out.println("The reverse of string is: "+result);
    }

    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create a variable and take the string input
        System.out.println("Enter the string: ");
        String text= input.nextLine();

        //calling the method
        stringReverse(text);

        input.close();
    }
}

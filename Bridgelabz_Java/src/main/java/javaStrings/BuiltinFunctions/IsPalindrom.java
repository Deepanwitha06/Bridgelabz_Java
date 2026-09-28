package javaStrings.BuiltinFunctions;
import java.util.Scanner;
/*
     create class to check palindrom
     modularity
 */
public class IsPalindrom {
    // a mthod to take input
    public static String getInput(){
        //create a scanner object
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the string: ");
        String userInput=input.next();
        return userInput;
    }

    // a method to check the condition
    public static boolean palindromChecker(String text){
        int end=text.length()-1;
        int start=0;
        while(start<end){
            if(text.charAt(start)!=text.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // a method to diplsy
    public static void display(boolean checker){
        if(checker){
            System.out.println("Is a palindrom");
        }else{
            System.out.println("Is not a palindrom");
        }
    }

    public static void main(String[] args){
        String userInput=getInput();
        display(palindromChecker(userInput));
    }
}

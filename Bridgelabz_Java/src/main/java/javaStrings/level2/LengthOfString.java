package javaStrings.level2;
import java.util.Scanner;
/* create a class to find the length of string without using length() method
    logic / condition : use infinite while loop using charAt and when a runtime exception occurs handle the exception
*/
public class LengthOfString {
    //create a method to find the length of the string without using length()
    public static int stringLength(String text) {
        int count = 0;
        try {
            while (true) {
                char ch = text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            System.out.println("Exception handled" + e.getMessage());
        }
        return count;
    }

    public static void main(String[] args){
        //scanner object creation
        Scanner input=new Scanner(System.in);

        //create a variable and take user input
        System.out.println("Enter the string:");
        String text=input.next();

        int len=stringLength(text);
        if(len==text.length()){
            System.out.println("The length of the string through both thr methods is same and is "+len);
        }else{
             System.out.println("The length of the string through the user define method is "+len+" and through built in method is "+text.length());
        }

        input.close();
    }
}

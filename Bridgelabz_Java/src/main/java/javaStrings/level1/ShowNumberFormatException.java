package javaStrings.level1;
import java.util.Scanner;
import java.lang.Integer;
/* demonstrate NumberFormatException
  NumberFormatException: when string is converted to number but it doesnot contain a valid number
 */
public class ShowNumberFormatException {
    //create a method to get exception (before refactor)
    /*
    public static void getException(String s){
        System.out.println(Integer.parseInt(s));
    }
    */
    //create a method to handle exception (after refactor)
    public static void handleException(String s){
        try{
            System.out.println(Integer.parseInt(s));
        }catch(NumberFormatException e){
            System.out.println("The exception is handled. "+e.getMessage());
        }catch(RuntimeException e){
            System.out.println("Runtime exception handled. "+e.getMessage());
        }
    }

    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create a variable and take user input
        System.out.println("Enter the string:");
        String text=input.next();
        //getException(text);
        handleException(text);
        input.close();
    }
}

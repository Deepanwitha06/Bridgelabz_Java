package javaStrings.level1;
import java.util.Scanner;
/* Demonstarte StringIndexOutOfBoundsException
   StringIndexOutOfBoundsException: when an element at an index from out of the range is beingv accessed
 */
public class ShowStringIndexOutOfBoundsException {
    //create a method to generate Exception (before refactor)
    /*
    public static void getexception(String s) {
        int index = s.length();
        System.out.println(s.charAt(index));
    }
    */
    //create a method to handle the exception(after refactor)
    public static void handleexception(String s) {
        try {
            int index = s.length();
            System.out.println(s.charAt(index));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("The Exception is handled. "+e.getMessage());
        }
    }

    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create a variable and take input
        System.out.println("Enter the string: ");
        String s=input.next();
        //getexception(s);
        handleexception(s);
        input.close();
    }
}

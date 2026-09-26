package javaStrings.level1;
import java.util.Scanner;
/* Create a class to handle the  IllegalArgumentException
     IllegalArgumentException : when the arguments are logically incorrect
 */
public class ShowIllegalArgumentException {
    //create a method to generate Exception (before refactor)
    /*
    public static void getexception(String s,int startIndex,int endIndex) {
        System.out.println(s.substring(startIndex, endIndex));
    }
    */

    //create a method to handle the exception(after refactor)
    public static void handleexception(String s,int startIndex,int endIndex) {
        try {
            System.out.println(s.substring(startIndex, endIndex));
        }catch(IllegalArgumentException e){
            System.out.println("Exception handled. "+e.getMessage());
        }catch (RuntimeException e) {
            System.out.println("Runtime exception handled. " + e.getMessage());
        }
    }

    public static void main(String[] args){
        //create a scanner variable
        Scanner input=new Scanner(System.in);

        //create a variable and take user input
        System.out.println("Enter the string: ");
        String text=input.next();
        System.out.println("Enter the startand end index for the substring:");
        int startIndex=input.nextInt();
        int endIndex=input.nextInt();
        //getexception(text,startIndex,endIndex);
        handleexception(text,startIndex,endIndex);
        input.close();
    }
}

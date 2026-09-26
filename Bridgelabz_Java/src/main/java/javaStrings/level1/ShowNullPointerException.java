package javaStrings.level1;
import java.util.Scanner;
/* Demonstrate NullPointerException
    NullPointerException : pointer poiting to null
 */
public class ShowNullPointerException {
    //create a method to generate Exception (before refactor)
    //create a method to handle the exception(after refactor)
    public static void exception() {
        String text = null;
        try {
            System.out.println(text.length());
        }catch(NullPointerException e){
            System.out.println("Exception handeled after refcatoring."+e.getMessage());
        }
    }

    public static void main(String[] args){
        exception();
    }
}

package javaStrings.level1;
import java.util.Scanner;
/* create a class that demonstartes the ArrayIndexOutOfBoundsException
    ArrayIndexOutOfBoundsException: array indx=ex logical pbm
 */
public class ShowArrayIndexOutOfBoundsException {
    //create a method to get the exception (before refactor)
    /*
    public static void getException(String[] array){

        System.out.println(array[array.length]);
    }
    */
    //create a method to handle exception (after refcator)
    public static void handleException(String[] array) {
        try {
            System.out.println(array[array.length]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The exception is handled. "+e.getMessage());
        }catch (RuntimeException e){
            System.out.println("Runtime Exception"+e.getMessage());
        }
    }
    public static void main(String[] args){
        //create a scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take user user inputs
        System.out.println("Enter the number of names:");
        int count=input.nextInt();
        String[] names=new String[count];
        System.out.println("Enter the names: ");
        for(int i=0;i<count;i++){
            names[i]=input.next();
        }

        //getException(names);     (before refactor)
        handleException(names);     //after refactor
        input.close();

    }
}

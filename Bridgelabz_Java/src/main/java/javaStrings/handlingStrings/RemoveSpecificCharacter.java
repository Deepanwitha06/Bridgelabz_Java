package javaStrings.handlingStrings;
import java.util.Scanner;
/*
    create a class to remove a specific character from the string and display it
 */
public class RemoveSpecificCharacter {
    //a method to remove the specific character
    public static String characterRemoval(String text,char speicificChar){
        int n=text.length();
        String res="";
        for(int i=0;i<n;i++){
            if(text.charAt(i)!=speicificChar){
                res+=text.charAt(i);
            }
        }
        return res;
    }

    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create the variables and take user inputs
        System.out.println("string:");
        String text=input.nextLine();
        System.out.println("character to removed: ");
        char removal=input.next().charAt(0);

        System.out.println("Modified String: "+characterRemoval(text,removal));

        input.close();
    }
}

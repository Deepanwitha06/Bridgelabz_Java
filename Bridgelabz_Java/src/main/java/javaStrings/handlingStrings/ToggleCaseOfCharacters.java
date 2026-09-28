package javaStrings.handlingStrings;
import java.util.Scanner;
/*
     create a class to convert upper case to lowercase and viceversa
 */
public class ToggleCaseOfCharacters {
    //a method to convert upper case letters to lower case and vice versa
    public static String toggleCharacters(String text){
        int n=text.length();
        char[] res=text.toCharArray();
        for(int i=0;i<n;i++){
            int ascii=(int) res[i];
            if(ascii>=65 && ascii<=90){
                ascii+=32;
            }else if(ascii>=97 && ascii<=122){
                ascii-=32;
            }
            res[i]=(char)ascii;
        }
        return String.valueOf(res);
    }

    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create a variable to take input
        System.out.println("Enter the string: ");
        String text=input.nextLine();

        String result=toggleCharacters(text);
        System.out.println(result);

        input.close();
    }
}

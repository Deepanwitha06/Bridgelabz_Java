package javaStrings.handlingStrings;
import java.util.Scanner;
/*
create a string to remove all the duplicate characters
 */
public class RemoveDuplicates {
    //a method to remove all duplicates from the string
    public static String duplicatesRemoval(String text){
        String res="";
        for(int i=0;i<text.length();i++){
            boolean duplicate=false;
            for(int j=0;j<i;j++){
                if(text.charAt(i)==text.charAt(j)){
                    duplicate=true;
                }
            }
            if(!duplicate){
                res+=text.charAt(i);
            }
        }
        return res;
    }

    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create a variable and take input
        System.out.println("Enter the string: ");
        String text=input.nextLine();

        String result=duplicatesRemoval(text);
        System.out.println("The modified string is :"+result);

        input.close();
    }
}

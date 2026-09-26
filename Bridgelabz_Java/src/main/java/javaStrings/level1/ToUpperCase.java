package javaStrings.level1;
import java.util.Scanner;
import java.lang.String;
/* create a class to convert lower case alphabets in the string to uppercase
   methods: using builin charAt()
   logic: the difference between any lower case and its upper case ASCII value is 32
 */
public class ToUpperCase {
    //create a method to convert lower case to upper case
    public static String convertToUpperCase(String text){
        String result="";
        for(int i=0;i<text.length();i++){
            int ascii=text.charAt(i);
            if(ascii>96 && ascii<123){
                ascii-=32;
            }
            result+=(char)ascii;
        }
        return result;
    }

    //create a method to compare two string
    public static boolean isSame(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }else{
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create a variable and take input
        System.out.println("Enter the string:");
        String text=input.nextLine();
        String text1=convertToUpperCase(text);
        String text2=text.toUpperCase();
        if(isSame(text1,text2)){
            System.out.println("The string in upper case from both ways are same and is :"+text1);
        }else{
            System.out.println("The string in upper case in method using charAt() is :"+text1+" and using toUpperCase() is "+text2);
        }

        input.close();
    }
}

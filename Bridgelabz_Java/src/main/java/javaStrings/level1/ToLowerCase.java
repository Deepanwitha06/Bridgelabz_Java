package javaStrings.level1;
import java.util.Scanner;
import java.lang.String;
/* create a class to convert upper case alphabets in the string to lowercase
   methods: using builin charAt()
   logic: the difference between any lower case and its upper case ASCII value is 32
 */
public class ToLowerCase {
    //create a method to convert upper case to lower case
    public static String convertToLowerCase(String text){
        String result="";
        for(int i=0;i<text.length();i++){
            int ascii=text.charAt(i);
            if(ascii<91 && ascii>64){
                ascii+=32;
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
        String text1=convertToLowerCase(text);
        String text2=text.toLowerCase();
        if(isSame(text1,text2)){
            System.out.println("The string in lower case from both ways are same and is :"+text1);
        }else{
            System.out.println("The string in lower case in method using charAt() is :"+text1+" and using toLowerCase() is "+text2);
        }

        input.close();
    }
}

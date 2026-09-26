package javaStrings.level1;
import java.util.Scanner;
/* create a class to display all the characters in the string
  method: user defined method to display characters
          and compare with toCharArray()
 */
public class CharactersInString {
    //create a class to display all the characters in a string
    public static char[] charArray(String s){
        char[] result=new char[s.length()];
        for(int i=0;i<s.length();i++){
            result[i]=s.charAt(i);
        }
        return result;
    }

    //create a method to compare two arrays
    public static boolean isSame(char[] array1,char[] array2){
        if(array1.length!=array2.length){
            return false;
        }else{
            for(int i=0;i<array1.length;i++){
                if(array1[i]!=array2[i]){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] main){
        //create a scanner object
        Scanner input=new Scanner(System.in);

        //create a variable and take user input
        System.out.println("Entre the string:");
        String s=input.next();
        char[] resultUserDefined=charArray(s);
        char[] resultBuiltIn=s.toCharArray();

        //calling comparision method
        if(isSame(resultBuiltIn,resultUserDefined)){
            System.out.println("Both are same. The characters in the string are:");
            for(int i=0;i<resultBuiltIn.length;i++){
                System.out.print(resultUserDefined[i]+" ");
            }
        }else{
            System.out.println("The characters in the string according to user defined method are :");
            for(int i=0;i<resultUserDefined.length;i++){
                System.out.print(resultUserDefined[i]+" ");
            }
            System.out.println("The characters in the string according to Built in method are :");
            for(int i=0;i<resultBuiltIn.length;i++){
                System.out.print(resultBuiltIn[i]+" ");
            }
        }

        input.close();
    }
}

package javaStrings.level1;
import java.util.Scanner;
/* create a class to create a substring
   methods: - substring using charAt()
               Also substring using built in method substring() and compare
 */
public class SubString {
    //create a method to create substring using charAT()
    public static String subString(String s,int startIndex,int endIndex){
        String result="";
        for(int i=startIndex;i<endIndex;i++){
            result= result +s.charAt(i);
        }
        return result;
    }

    //create a class to compare two strings
    public static boolean isSame(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables to take the string,start Index and end Index as inputs
        System.out.println("Enter the string:");
        String s=input.next();
        System.out.println("Enter the index from where the substring should start and end:");
        int startIndex=input.nextInt();
        int endIndex=input.nextInt();

        //calling the method
        String stringPart=subString(s,startIndex,endIndex);

        //create substring using built in method
        String stringBuiltinPart=s.substring(startIndex,endIndex);
        if(isSame(stringPart,stringBuiltinPart)){
            System.out.println("The substrings created by both methods (using charAt() and built in) are same and is "+stringPart);
        }else{
            System.out.println("The substring created by method using charAt() is "+stringPart+" and by built in method is "+stringBuiltinPart);
        }

        input.close();

    }
}

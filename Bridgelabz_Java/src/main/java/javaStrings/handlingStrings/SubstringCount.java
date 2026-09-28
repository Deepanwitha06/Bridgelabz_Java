package javaStrings.handlingStrings;
import java.util.Scanner;
/*
   create a class to count the number of times the given sub string is repeated in the string (no overlap)
 */
public class SubstringCount {
    //method to count the non overlapping occurances of substring
    public static int substringCount(String text,String sub){
        int len=text.length();
        int sublen=sub.length();
        int count=0;
        int i=0;
        while(i+sublen<=len){
            if((text.substring(i,i+sublen)).equals(sub)){
                count++;
                i+=sublen;
            }else {
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create a variable and take user input
        System.out.println("Enter the string: ");
        String text=input.nextLine();
        System.out.println("Enter the substring: ");
        String subString=input.nextLine();

        int res=substringCount(text,subString);
        System.out.println("The substring repeates for "+res+" times in the given string");

        input.close();
    }
}

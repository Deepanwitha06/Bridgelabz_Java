package javaStrings.level2;
import java.util.Scanner;
/*
 create a class to trim the string without directly using trim() built in method
        and then comparing it with the one using direct built in method
 */
public class TrimUserDefined {
    //create a method to find the actual start and end indexes
    public static int[] realIndices(String s){
        int startIndex=0;
        while(s.charAt(startIndex)==' '){
            startIndex++;
        }
        int endIndex=s.length()-1;
        while(s.charAt(endIndex)==' '){
            endIndex--;
        }
        int[] result={startIndex,endIndex};
        return result;
    }

    //create a substring using the real indices
    public static String actutalText(String s,int start,int end){
        return s.substring(start,end+1);
    }

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
        System.out.println("Enter the string: ");
        String text=input.nextLine();
        int[] result=realIndices(text);
        String s1=actutalText(text,result[0],result[1]);
        String s2=text.trim();
        if (isSame((s1), s2)) {
            System.out.println("Both are same and the string is :"+s2);
        }else{
            System.out.println("By built in :"+s2+"\n By unser defined method : "+s1);
        }

        input.close();
    }
}

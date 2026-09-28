package javaStrings.handlingStrings;
import java.util.Scanner;
/*
  create a class to check whether given string is palinf=drom or not
 */
public class isPalindrome {
    //a method to check whether palindrome or not using the start and end indices
    public static boolean palindromeIndicesCheck(String text){
        int start=0;
        int end=text.length()-1;
        while(start<end){
            if(text.charAt(start)!=text.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    //method to checkwhether boolean or not through recursive
    public static boolean palindromeRecursiveCheck(String text,int start,int end){
        if(start>=end){
            return true;
        }
        if(text.charAt(start)!=text.charAt(end)){
            return false;
        }
        return palindromeRecursiveCheck(text,start+1,end-1);
    }

    //method using charAt
    public static int palindromCharAtCheck(String text){
        int n=text.length();
        String res="";
        for(int i=n-1;i>=0;i--){
            res+=text.charAt(i);
        }
        return text.compareTo(res);
    }

    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create a variable and take user input
        System.out.println("Enter the string: ");
        String text=input.nextLine();

        boolean result1=palindromeIndicesCheck(text);
        boolean result2=palindromeRecursiveCheck(text,0,text.length()-1);
        int result=palindromCharAtCheck(text);
        boolean result3;
        if(result==0){
            result3=true;
        }else{
            result3=false;
        }
        System.out.println("Palindrome using loop: "+result1);
        System.out.println("Palindrome using recursion: "+result2);
        System.out.println("Palindrome using character arrays: "+result3);
    }
}

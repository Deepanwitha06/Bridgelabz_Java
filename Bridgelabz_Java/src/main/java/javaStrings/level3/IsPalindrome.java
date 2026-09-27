package javaStrings.level3;
import java.util.Scanner;
/*
   create a class to check if a text is palindrome
   use three different logics to check palindrome
*/
public class IsPalindrome {
    // Logic 1: Compare characters from start and end
    public static boolean palindromeUsingLoop(String text) {
        int start=0;
        int end=text.length()-1;
        while(start<end) {
            if(text.charAt(start)!=text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Compare characters using recursion
    public static boolean palindromeUsingRecursion(String text,int start,int end) {
        if(start>=end) {
            return true;
        }
        if(text.charAt(start)!=text.charAt(end)) {
            return false;
        }
        return palindromeUsingRecursion(text,start+1,end-1);
    }

    // Logic 3: Reverse the string using charAt()
    public static char[] reverseString(String text) {
        char[] reverse=new char[text.length()];
        int index=0;
        for(int i=text.length()-1;i>=0;i--) {
            reverse[index]=text.charAt(i);
            index++;
        }
        return reverse;
    }

    // Compare original and reverse character arrays
    public static boolean palindromeUsingArray(String text) {
        char[] original=text.toCharArray();
        char[] reverse=reverseString(text);
        for(int i=0;i<original.length;i++) {
            if(original[i]!=reverse[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // create a scanner object
        Scanner input=new Scanner(System.in);

        // create a variable and take input
        System.out.print("Enter a text: ");
        String text=input.nextLine();

        // Logic 1
        boolean result1=palindromeUsingLoop(text);
        // Logic 2
        boolean result2=palindromeUsingRecursion(text,0,text.length()-1);
        // Logic 3
        boolean result3=palindromeUsingArray(text);

        if(result1==result2 && result2==result3) {
            System.out.println("All three logics give the same result and the result is "+result1);
        }else{
            System.out.println("The results are different");
            System.out.println("Palindrome using loop: "+result1);
            System.out.println("Palindrome using recursion: "+result2);
            System.out.println("Palindrome using character arrays: "+result3);
        }
        input.close();
    }
}
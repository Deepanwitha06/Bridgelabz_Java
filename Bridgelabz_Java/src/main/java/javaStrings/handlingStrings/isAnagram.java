package javaStrings.handlingStrings;
import java.util.Scanner;
/*
    create a class to find whether given two strings are anagrams or not
 */
public class isAnagram {
    //a method to check anagram or not
    public static boolean anagramCheck(String s1,String s2){
        int[] freq1=new int[256];
        int[] freq2=new int[256];
        for(int i=0;i<s1.length();i++){
            int ascii=(int)s1.charAt(i);
            freq1[ascii]++;
        }
        for(int i=0;i<s2.length();i++){
            int ascii=(int)s2.charAt(i);
            freq2[ascii]++;
        }
        for(int i=0;i<256;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and store input
        System.out.println("Enter the two strings:");
        String s1=input.nextLine();
        String s2=input.nextLine();
        if(anagramCheck(s1,s2)){
            System.out.println("Is an anagram");
        }else{
            System.out.println("Is not an anagram");
        }

        input.close();
    }
}

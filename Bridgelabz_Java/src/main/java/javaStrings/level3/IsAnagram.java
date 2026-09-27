package javaStrings.level3;
import java.util.Scanner;
/*
   create a class to check if two texts are anagrams
   use frequency of characters to check anagram
*/
public class IsAnagram {
    // A method to check if two texts are anagrams
    public static boolean checkAnagram(String text1,String text2) {
        // Check if lengths are equal
        if(text1.length()!=text2.length()) {
            return false;
        }
        // Create arrays to store frequency of characters
        int[] frequency1=new int[256];
        int[] frequency2=new int[256];
        // Find frequency of characters in first text
        for(int i=0;i<text1.length();i++) {
            int ascii=(int)text1.charAt(i);
            frequency1[ascii]++;
        }
        // Find frequency of characters in second text
        for(int i=0;i<text2.length();i++) {
            int ascii=(int)text2.charAt(i);
            frequency2[ascii]++;
        }

        // Compare frequency of characters
        for(int i=0;i<256;i++) {
            if(frequency1[i]!=frequency2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // create a scanner object
        Scanner input=new Scanner(System.in);

        // create variables and take inputs
        System.out.print("Enter first text: ");
        String text1=input.nextLine();
        System.out.print("Enter second text: ");
        String text2=input.nextLine();

        boolean result=checkAnagram(text1,text2);
        if(result) {
            System.out.println("The two texts are anagrams");
        }else{
            System.out.println("The two texts are not anagrams");
        }

        input.close();
    }
}
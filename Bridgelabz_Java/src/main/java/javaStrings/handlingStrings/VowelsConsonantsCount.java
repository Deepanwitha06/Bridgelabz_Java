package javaStrings.handlingStrings;
import java.util.Scanner;
/*
create a class to count the no.of vowels and consonants
 */
public class VowelsConsonantsCount {
    //a method to count no.of vowels
    public static int[] noOfVowelConsonants(String text){
        int n=text.length();
        int vowelCount=0;
        int consonantCount=0;
        text=text.toLowerCase();
        for(int i=0;i<n;i++){
            char t=text.charAt(i);
            if(t>='a' && t<='z'){
                if((t=='a') ||t=='e' || t=='i' ||t=='o' ||t=='u'){
                    vowelCount++;
                }else{
                    consonantCount++;
                }
            }
        }
        int[] result={vowelCount,consonantCount};
        return result;
    }

    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create a variable to take input and take the string
        System.out.println("Enter the string:");
        String text=input.nextLine();

        //calling the method
        int[] result=noOfVowelConsonants(text);
        System.out.println("There are "+result[0]+" vowels and "+result[1]+" consonants in the string");

        input.close();
    }
}

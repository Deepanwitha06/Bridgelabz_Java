package javaStrings.level2;
import java.util.Scanner;
/*
  create a class to find the vowels and consonants count
 */
public class VowelsConsonantaCount {
    //create a method to check whether the character is vowel,consonant or not a letter
    public static String vowelConsonantNotletter(char ch){
        int ascii=(int)ch;
        if(ascii>96 && ascii<123){
            ascii-=32;
        }
        if( ascii==65 || ascii==69 || ascii==73 || ascii==79 || ascii==85){
            return "Vowel";
        }else if(ascii>64 && ascii<91){
            return "Consonant";
        }else{
            return "Not a letter";
        }
    }

    //create a method which counts the no.of vowels and consonents using charAt
    public static int[] vowelConsonantCount(String s){
        int count=s.length();
        int vcount=0;
        int ccount=0;
        for(int i=0;i<count;i++){
            if(vowelConsonantNotletter(s.charAt(i)).equals("Vowel")){
                vcount++;
            }else if(vowelConsonantNotletter(s.charAt(i)).equals("Consonant")){
                ccount++;
            }
        }
        int[] rcount={vcount,ccount};
        return rcount;
    }

    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create a variable and take input
        System.out.print("Enter the string:");
        String text=input.nextLine();

        int[] result=vowelConsonantCount(text);
        System.out.println("There are "+result[0]+" vowels and "+result[1]+" consonants present");

        input.close();
    }
}

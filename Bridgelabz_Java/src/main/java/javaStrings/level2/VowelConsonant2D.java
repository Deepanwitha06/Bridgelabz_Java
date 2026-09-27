package javaStrings.level2;
import java.util.Scanner;
/*
create a class to display the characters and their types in tabular format in a string
method:
-vowel or consonant or not a letter
- 2D array with letter and type
- display
 */
public class VowelConsonant2D {
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

    //create a methoid to store the letter and its type
    public static String[][] letterAndType(String s){
        String[][] info=new String[s.length()][2];
        for(int i=0;i<s.length();i++){
            info[i][0]=String.valueOf(s.charAt(i));
            info[i][1]=vowelConsonantNotletter(s.charAt(i));
        }
        return info;
    }

    //display
    public static void display(String[][] info){
        System.out.println("Character \t Type");
        for(int i=0;i<info.length;i++){
            System.out.printf("%s\t\t%s\n",info[i][0],info[i][1]);
        }
    }

    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create a variable and take input
        System.out.println("Enter the string: ");
        String text=input.nextLine();
        String[][] info=letterAndType(text);
        display(info);

        input.close();
    }

}

package javaStrings.handlingStrings;
import java.util.Scanner;
/*
     to replace a word with another word
 */
public class ReplaceWord {
    //replace a word with another word
    public static void wordReplacement(String text,String oldWord,String newWord){
        String[] words=text.split(" ");
        for(int i=0;i<words.length;i++){
            if(words[i].equals(oldWord)) {
                words[i] = newWord;
            }
        }
        String res="";
        for(int i=0;i<words.length;i++){
            res+=(words[i]+" ");
        }
        System.out.println("Nodified string : "+res);
    }

    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and inputs
        System.out.println("Enter the string: ");
        String text=input.nextLine();
        System.out.println("old word:");
        String oldWord=input.next();
        System.out.println("New word: ");
        String newWord=input.next();

        wordReplacement(text,oldWord,newWord);

        input.close();
    }
}

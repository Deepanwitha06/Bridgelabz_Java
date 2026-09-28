package javaStrings.handlingStrings;
import java.util.Scanner;
/*
create a class to display the longest word in the string
 */
public class LongestWord {
    // a method to return the longest word in the string
    public static String getLongestWord(String text){
        String[] words=text.split(" ");

        int[] wordsLength=new int[words.length];
        int maxLength=0;
        int maxLengthIndex=0;
        for(int i=0;i<words.length;i++){
            wordsLength[i]=words[i].length();
            if(maxLength<wordsLength[i]){
                maxLengthIndex=i;
                maxLength=wordsLength[i];
            }
        }
        return words[maxLengthIndex];
    }

    public static void main(String[] args){
        //create a scanner object
        Scanner input=new Scanner(System.in);

        //create a variable and take input
        System.out.println("Enter the string: ");
        String text=input.nextLine();

        String result=getLongestWord(text);
        System.out.println("The longest word is "+result);

        input.close();
    }
}

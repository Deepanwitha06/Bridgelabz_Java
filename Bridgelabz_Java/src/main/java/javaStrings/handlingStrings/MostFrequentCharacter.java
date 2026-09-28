package javaStrings.handlingStrings;
import java.util.Scanner;
/*
    create a class to display the most frequent number

 */
public class MostFrequentCharacter {
    //a method to find the most frequent character
    /*public static char frequentCharacter(String text){
        //count the character
        String res="";
        char[] characters=text.toCharArray();
        int totallen=text.length();
        for(int i=0;i<totallen;i++){
            boolean found=false;
            for(int j=0;j<i;j++){
                if(characters[i]==characters[j]){
                    found=true;
                    break;
                }
            }

            if(!found){
                res+=characters[i];
            }
        }
        char[] differentCharacter=res.toCharArray();
        int[] characterFrequency=new int[differentCharacter.length];
        for(int i=0;i<differentCharacter.length;i++){
            int count=0;
            for(int j=0;j<characters.length;j++){
                if(characters[j]==differentCharacter[i]){
                    count++;
                }
            }
            characterFrequency[i]=count;
        }

        //comparision of characterfrequency
        int mostFrequentCharIndex=0;
        int max=0;
        for(int i=0;i<res.length();i++){
            if(max<characterFrequency[i]){
                max=characterFrequency[i];
                mostFrequentCharIndex=i;
            }
        }

        return differentCharacter[mostFrequentCharIndex];
    }
    */
    public static char frequentCharacter(String text){
        int[] freq=new int[256];
        for(int i=0;i<text.length();i++){
            int ascii=(int) text.charAt(i);
            freq[ascii]++;
        }

        int max=0;
        int index=0;
        for(int i=0;i<256;i++){
            if(max<freq[i]){
                max=freq[i];
                index=i;
            }
        }
        return (char)index;
    }

    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create a variable and take input
        System.out.println("Enter the string: ");
        String text=input.nextLine();
        System.out.println("The most frequent character : "+frequentCharacter(text));

        input.close();
    }
}

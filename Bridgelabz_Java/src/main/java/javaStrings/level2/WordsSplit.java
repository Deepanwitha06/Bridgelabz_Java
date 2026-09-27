package javaStrings.level2;
import java.util.Scanner;
/*  create a class to split text into words
         using user defined method
 */
public class WordsSplit {
    //create a method to get the length of a string
    public static int stringLength(String s){
        int count=0;
        try{
            while(true){
                char ch=s.charAt(count);
                count++;
            }
        }catch (RuntimeException e){
            //just leave empty
        }
        return count;
    }

    //create a method to split text into words
    public static String[] textToWords(String s,int count){
        int wordsCount=0;
        for(int i=0;i<count;i++){
            if(s.charAt(i)==' '){
                wordsCount++;
            }
        }
        wordsCount= wordsCount+1;
        int[] spacesIndex=new int[wordsCount-1];
        int index=0;
        for(int i=0;i<count;i++){
            if(s.charAt(i)==' '){
                spacesIndex[index]=i;
                index++;
            }
        }
        String[] Words=new String[wordsCount];
        Words[0]=s.substring(0,spacesIndex[0]);
        for(int i=1;i<wordsCount-1;i++){
            Words[i]=s.substring(spacesIndex[i-1]+1,spacesIndex[i]);
        }
        Words[wordsCount-1]=s.substring(spacesIndex[wordsCount-2]+1);
        return Words;
    }

    //method to compare two string arrays
    public static boolean isSame(String[] array1,String[] array2){
        if(array1.length!=array2.length){
            return false;
        }else {
            for(int i=0;i<array1.length;i++){
                if(!array1[i].equals(array2[i])){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args){
        //create a scanner object
        Scanner input=new Scanner(System.in);

        //create a variable and collect input
        System.out.println("Enter the text:");
        String text=input.nextLine();

        int numberOfWords=stringLength(text);
        String[] words=textToWords(text,numberOfWords);
        String[] wordBuiltIn=text.split(" ");
        if(isSame(words,wordBuiltIn)){
            System.out.println("The words are same and they are :");
            for(int i=0;i<words.length;i++){
                System.out.println(words[i]);
            }
        }else{
            System.out.println("The words through user defined method are : ");
            for(int i=0;i<words.length;i++){
                System.out.println(words[i]);
            }
            System.out.println("and the words through built in method are : ");
            for(int i=0;i<wordBuiltIn.length;i++){
                System.out.println(wordBuiltIn[i]);
            }
        }

        input.close();
    }
}

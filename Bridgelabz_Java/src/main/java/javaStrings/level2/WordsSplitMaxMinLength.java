package javaStrings.level2;
import java.util.Scanner;
/*
    create a class to split the words and collect them into an 2D array along with the length of the word
      and then display the shortest and longest strings
 */
public class WordsSplitMaxMinLength {
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

    //create a method to  take the word array and return a 2D String array of the word and its corresponding length
    public static String[][] wordAndLength(String[] words){
        String[][] result=new String[words.length][2];
        for(int i=0;i<words.length;i++){
            result[i][0]=words[i];
            result[i][1]=String.valueOf(stringLength(words[i]));
        }
        return result;
    }

    //create a method to find the shortest and longesr strings
    public static int[] shortestLongestString(String[][] info){
        int shortestIndex=0;
        int longestIndex=0;
        int shortestLength=Integer.parseInt(info[0][1]);
        int longestLength=Integer.parseInt(info[0][1]);
        for(int i=1;i<info.length;i++){
            if(shortestLength>Integer.parseInt(info[i][1])){
                shortestLength=Integer.parseInt(info[i][1]);
                shortestIndex=i;
            }
            if(longestLength<Integer.parseInt(info[i][1])){
                longestLength=Integer.parseInt(info[i][1]);
                longestIndex=i;
            }
        }
        int[] result={shortestIndex,longestIndex};
        return result;
    }
    public static void main(String[] args){
        //create a scanner object
        Scanner input=new Scanner(System.in);

        //create a variable and collect input
        System.out.println("Enter the text:");
        String text=input.nextLine();

        //callinf methods
        int numberOfWords=stringLength(text);
        String[] words=textToWords(text,numberOfWords);
        String[][] result=wordAndLength(words);
        System.out.println("The words and there lengths are  :");
        for(int i=0;i<result.length;i++){
            System.out.println(result[i][0]+" contains "+Integer.parseInt(result[i][1])+ " letters");
        }
        //calling method to find the shortest and longest word
        int[] minmax=shortestLongestString(result);
        System.out.println("The shortest and longest words are "+result[minmax[0]][0]+" and "+result[minmax[1]][0]+" respectively");
        input.close();
    }
}

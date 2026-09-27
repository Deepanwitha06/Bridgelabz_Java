package javaStrings.level3;
import java.util.Scanner;
/*
   create a class to find the frequency of characters in a string using nested loops
   use toCharArray() to store the characters
*/
public class FrequencyUsingNestedLoops {
    // A method to find the frequency of characters
    public static String[] characterFrequency(String text) {
        char[] characters=text.toCharArray();
        int[] frequency=new int[characters.length];

        for(int i=0;i<characters.length;i++) {
            if(characters[i]!='0') {
                frequency[i]=1;
                for(int j=i+1;j<characters.length;j++) {
                    if(characters[i]==characters[j]) {
                        frequency[i]++;
                        characters[j]='0';
                    }
                }
            }
        }
        // Create a 1D String array to store characters and frequencies
        String[] result=new String[characters.length];
        int index=0;
        for(int i=0;i<characters.length;i++) {
            if(characters[i]!='0') {
                result[index]=String.valueOf(characters[i])+" "+frequency[i];
                index++;
            }
        }
        // Create a new array with exact size
        String[] finalResult=new String[index];
        for(int i=0;i<index;i++) {
            finalResult[i]=result[i];
        }
        return finalResult;
    }

    public static void main(String[] args) {
        // create a scanner object
        Scanner input=new Scanner(System.in);

        // create a variable and take input
        System.out.print("Enter a string: ");
        String text=input.nextLine();

        String[] result=characterFrequency(text);
        System.out.println("Character\tFrequency");
        for(int i=0;i<result.length;i++) {
            String[] parts=result[i].split(" ");
            System.out.printf("%s\t\t%s%n",parts[0],parts[1]);
        }

        input.close();
    }
}
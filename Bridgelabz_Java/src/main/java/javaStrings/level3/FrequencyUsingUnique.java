package javaStrings.level3;
import java.util.Scanner;
/*
   create a class to find the frequency of characters in a string using unique characters
   use ASCII values to find the frequency of characters
*/
public class FrequencyUsingUnique {
    // A method to find unique characters
    public static char[] uniqueCharacters(String text) {
        int length=text.length();
        char[] unique=new char[length];
        int uniqueCount=0;
        for(int i=0;i<length;i++) {
            int count=0;
            for(int j=0;j<i;j++) {
                if(text.charAt(i)==text.charAt(j)) {
                    count++;
                }
            }
            if(count==0) {
                unique[uniqueCount]=text.charAt(i);
                uniqueCount++;
            }
        }

        char[] result=new char[uniqueCount];
        for(int i=0;i<uniqueCount;i++) {
            result[i]=unique[i];
        }
        return result;
    }

    // A method to find the frequency of characters
    public static String[][] characterFrequency(String text) {
        int[] frequency=new int[256];
        for(int i=0;i<text.length();i++) {                                      // Find the frequency of each character
            int ascii=(int)text.charAt(i);
            frequency[ascii]++;
        }

        char[] unique=uniqueCharacters(text);                                  // Call uniqueCharacters() method
        String[][] result=new String[unique.length][2];                        // Create an array to store characters and frequencies
        for(int i=0;i<unique.length;i++) {
            int ascii=(int)unique[i];
            result[i][0]=String.valueOf(unique[i]);
            result[i][1]=String.valueOf(frequency[ascii]);
        }
        return result;
    }

    public static void main(String[] args) {
        // create a scanner object
        Scanner input=new Scanner(System.in);

        // create a variable and take input
        System.out.print("Enter a string: ");
        String text=input.nextLine();

        String[][] result=characterFrequency(text);
        System.out.println("Character\tFrequency");
        for(int i=0;i<result.length;i++) {
            System.out.printf("%s\t\t%s%n",result[i][0],result[i][1]);
        }

        input.close();
    }
}
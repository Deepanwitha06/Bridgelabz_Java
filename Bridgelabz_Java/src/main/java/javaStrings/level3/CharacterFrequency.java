package javaStrings.level3;
import java.util.Scanner;
/*
   create a class to find the frequency of characters in a stringusing charAt()
   use ASCII values to find the frequency of characters
*/

public class CharacterFrequency {
    // A method to find the frequency of characters
    public static String[][] characterFrequency(String text) {
        int[] frequency = new int[256];
        // Find the frequency of each character
        for (int i=0;i<text.length();i++) {
            int ascii=(int)text.charAt(i);
            frequency[ascii]++;
        }

        // Count the number of different characters
        int uniqueCount=0;
        for (int i=0;i<text.length();i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                uniqueCount++;
            }
        }

        // Create an array to store characters and frequencies
        String[][] result = new String[uniqueCount][2];
        int index=0;

        // Store characters and their frequencies
        for (int i=0;i<text.length();i++) {
            boolean found=false;
            for (int j=0;j<i;j++) {
                if (text.charAt(i)==text.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                int ascii=(int)text.charAt(i);
                result[index][0]=String.valueOf(text.charAt(i));
                result[index][1]=String.valueOf(frequency[ascii]);
                index++;
            }
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
        for (int i=0;i<result.length;i++) {
            System.out.printf("%s\t\t%s%n",result[i][0],result[i][1]);
        }

        input.close();
    }
}
package javaStrings.level3;
import java.util.Scanner;
/*
   create a class to display the Unique Characters in a string using charAt()
   use 2 loops to compare the characters
*/
public class UniqueCharacters {
    // a method to find length without using String.length()
    public static int stringLength(String text) {
        int count=0;
        try {
            while(true) {
                text.charAt(count);
                count++;
            }
        } catch(RuntimeException e) {
            // End of string reached
        }
        return count;
    }

    // A method to find unique characters
    public static char[] uniqueCharacters(String text) {
        int length=stringLength(text);
        // Array to temporarily store unique characters
        char[] unique=new char[length];
        int uniqueCount=0;
        for(int i=0;i<length;i++) {
            int count=0;
            for(int j=0;j<length;j++) {                      // Check whether the character appeared before
                if (text.charAt(i)==text.charAt(j)) {
                    count++;
                }
            }
            if(count==1) {                              // If character has not appeared before, store it
                unique[uniqueCount]=text.charAt(i);
                uniqueCount++;
            }
        }
        // Create a new array with exact number of unique characters
        char[] result=new char[uniqueCount];
        for (int i=0;i<uniqueCount;i++) {
            result[i]=unique[i];
        }
        return result;
    }

    public static void main(String[] args) {
        //create a scanner object
        Scanner input=new Scanner(System.in);
        //create a variable and take input
        System.out.print("Enter a string: ");
        String text=input.nextLine();

        char[] result=uniqueCharacters(text);
        System.out.print("Unique characters: ");
        for(int i=0;i<result.length;i++) {
            System.out.print(result[i] + " ");
        }

        input.close();
    }
}
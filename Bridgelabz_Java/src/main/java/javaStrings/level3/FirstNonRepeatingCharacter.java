package javaStrings.level3;
import java.util.Scanner;
/*
   create a class to find the first non-repeating characterin a string using charAt()
   use ASCII values to find the frequency of characters
*/
public class FirstNonRepeatingCharacter {
    // a method to find the first non-repeating character
    public static char firstNonRepeatingCharacter(String text) {
        int[] frequency=new int[256];
        // Find the frequency of each character
        for (int i=0;i<text.length();i++) {
            int ascii=(int)text.charAt(i);
            frequency[ascii]++;
        }
        // Find the first character whose frequency is 1
        for (int i=0;i<text.length();i++) {
            int ascii=(int)text.charAt(i);
            if (frequency[ascii]==1) {
                return text.charAt(i);
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        // create a scanner object
        Scanner input=new Scanner(System.in);

        // create a variable and take input
        System.out.print("Enter a string: ");
        String text=input.nextLine();

        char result=firstNonRepeatingCharacter(text);
        if (result!='\0'){
            System.out.println("First non-repeating character: " + result);
        } else{
            System.out.println("There is no non-repeating character");
        }

        input.close();
    }
}
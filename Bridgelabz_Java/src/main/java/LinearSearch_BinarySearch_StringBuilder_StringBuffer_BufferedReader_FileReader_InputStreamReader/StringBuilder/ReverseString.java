package LinearSearch_BinarySearch_StringBuilder_StringBuffer_BufferedReader_FileReader_InputStreamReader.StringBuilder;
import java.util.Scanner;
import java.lang.StringBuilder;
/*
          Reverse a string
          using String Builder
 */
public class ReverseString {
    public static void main(String[] args){
        //create a scanner variable
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String text=input.nextLine();

        //string builder
        StringBuilder sb=new StringBuilder();
        sb.append(text);
        sb.reverse();
        System.out.println("Reverse: "+sb.toString());

        input.close();
    }
}
package LinearSearch_BinarySearch_StringBuilder_StringBuffer_BufferedReader_FileReader_InputStreamReader.StringBuilder;
import java.util.Scanner;
import java.util.HashSet;
import java.lang.StringBuilder;

/*
      Remove duplicate elements
      use string builder and hashSet(stroe unique elements only)
 */

public class RemoveDuplicates {
    public static void main(String[] args){
        //create scanner variable
        Scanner input=new Scanner(System.in);
        System.out.println("ENter the string: ");
        String text=input.nextLine();

        //string builder
        StringBuilder sb=new StringBuilder();
        HashSet<Character> characters=new HashSet<>();

        for(int i=0;i<text.length();i++){
            if(!characters.contains(text.charAt(i))){
                characters.add(text.charAt((i)));
                sb.append(text.charAt(i));
            }
        }

        System.out.println("String with duplicates removed: "+sb.toString());
        input.close();
    }
}
package LinearSearch_BinarySearch_StringBuilder_StringBuffer_BufferedReader_FileReader_InputStreamReader.LinearSearch;
import java.util.Scanner;
public class SearchWordInSentences {
    public static String linearSearch(String[] sentences,String target){
        for(String sent:sentences){
            String[] words=sent.split(" ");
            for(String word:words){
                if(word.equalsIgnoreCase(target)){
                    return sent;
                }
            }
        }return "Not Found";
    }

    public static void main(String[] args){
        String[] sentences={"I have apple","She has orange","he have mango"};
        String target="mango";
        System.out.println(linearSearch(sentences,target));
    }
}
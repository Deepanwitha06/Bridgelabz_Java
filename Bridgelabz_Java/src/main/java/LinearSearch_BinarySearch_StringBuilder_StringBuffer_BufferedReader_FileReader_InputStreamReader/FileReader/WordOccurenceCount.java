package LinearSearch_BinarySearch_StringBuilder_StringBuffer_BufferedReader_FileReader_InputStreamReader.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

/*
      count the occurence of word in file
      usinf filereader
 */
public class WordOccurenceCount {
    public static void main(String[] args){
        //create file
        try(FileWriter fw=new FileWriter("Text.txt")){
            fw.write("Hello");
            fw.write("Writing file");
            fw.write("\nReading file");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        //create filereader object
        try(FileReader fr=new FileReader("Text.txt")){
            BufferedReader br=new BufferedReader(fr);
            String line;
            String target="file";
            int count=0;
            while((line=br.readLine())!=null){
                String[] words=line.split("\\s+");;
                for(String word:words){
                    if(word.equals(target)){
                        count++;
                    }
                }
            }
            System.out.println("The word "+target+" reapeated "+count+" no.of times");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

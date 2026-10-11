package LinearSearch_BinarySearch_StringBuilder_StringBuffer_BufferedReader_FileReader_InputStreamReader.InputStreamReader;
import java.io.*;
import java.nio.charset.StandardCharsets;

/*
       Byte stream to character stream conversion
       using the inputStreamRead
 */
public class BytestreamToCharacterstream {
    public static void main(String[] args){
        //create file
        try(FileWriter fw=new FileWriter("Text.txt")){
            fw.write("Hello");
            fw.write("Writing file");
            fw.write("\nReading file");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        //create input stream object
        try(InputStreamReader isr=new InputStreamReader(new FileInputStream("Text.txt"),StandardCharsets.UTF_8)){
            BufferedReader br=new BufferedReader(isr);
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

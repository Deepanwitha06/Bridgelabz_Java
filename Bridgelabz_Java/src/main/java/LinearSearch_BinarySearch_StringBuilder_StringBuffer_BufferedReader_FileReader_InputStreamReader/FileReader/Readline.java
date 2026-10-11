package LinearSearch_BinarySearch_StringBuilder_StringBuffer_BufferedReader_FileReader_InputStreamReader.FileReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
       read a file line by line
       using fileReader
 */
public class Readline {
    public static void main(String[] args) {
        //create file
        try(FileWriter fw=new FileWriter("Text.txt")){
            fw.write("Hello");
            fw.write("Writing file");
            fw.write("\nReading file");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        //create filereader object
        try (FileReader fr = new FileReader("Text.txt")) {

        //wrap the file reader in a bufferedReader
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line=br.readLine()) != null) {
            System.out.println(line);
        }
    } catch (IOException e) {
        System.out.println("Error reading file");
    }
}
}

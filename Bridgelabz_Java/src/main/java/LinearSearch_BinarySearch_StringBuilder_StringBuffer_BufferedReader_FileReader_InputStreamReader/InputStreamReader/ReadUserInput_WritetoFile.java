package LinearSearch_BinarySearch_StringBuilder_StringBuffer_BufferedReader_FileReader_InputStreamReader.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

/*
         Read User Input and Write to Fil
         Using InputStreamReader

 */
public class ReadUserInput_WritetoFile {
    public static void main(String[] args){
        try(InputStreamReader isr=new InputStreamReader(System.in)){
            BufferedReader br=new BufferedReader(isr);
            FileWriter fr=new FileWriter("Text.txt");

            System.out.println("Enter exit to exit");
            String line;
            while((line= br.readLine())!=null){
                if(line.equalsIgnoreCase("Exit")){
                    break;
                }
                fr.write(line+"\n");
            }
            System.out.println("Input saved to Text.txt");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}

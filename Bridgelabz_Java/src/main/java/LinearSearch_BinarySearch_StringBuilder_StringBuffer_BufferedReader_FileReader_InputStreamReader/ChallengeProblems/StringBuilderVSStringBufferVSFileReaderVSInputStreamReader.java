package LinearSearch_BinarySearch_StringBuilder_StringBuffer_BufferedReader_FileReader_InputStreamReader.ChallengeProblems;
import java.io.*;
import java.lang.StringBuilder;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;

/*
    Comparision
    StringBuilder VS StringBuffer VS FileReader VS InputStreamReader
*/
public class StringBuilderVSStringBufferVSFileReaderVSInputStreamReader {
    public static void main(String[] args){
        //String Builder vs string buffer
        //string builder
        StringBuilder sbr=new StringBuilder();
        long start1=System.nanoTime();
        for(int i=0;i<1000000;i++){
            sbr.append("hello");
        }
        long end1=System.nanoTime();
        long elapse1=end1-start1;

        //string buffer
        StringBuffer sbf=new StringBuffer();
        long start2=System.nanoTime();
        for(int i=0;i<1000000;i++){
            sbf.append("hello");
        }
        long end2=System.nanoTime();
        long elapse2=end2-start2;

        //Filereader vs InputStreamReader
        //create file
        try(FileWriter fw=new FileWriter("text.txt",StandardCharsets.UTF_8)){
            fw.write("HI");
            fw.write("\nHello");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        //file reader
        try(BufferedReader br=new BufferedReader(new FileReader("text.txt",StandardCharsets.UTF_8))){
            String line1;
            int count=0;
            long start3=System.nanoTime();
            while((line1=br.readLine())!=null){
                String[] words=line1.split("\\s+");
                for(String word:words){
                    count++;
                }
            }
            long end3=System.nanoTime();
            long elapse3=end3-start3;
            System.out.println("Word count by file reader: "+count);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        //input stram
        try(BufferedReader isr=new BufferedReader(new InputStreamReader(new FileInputStream("text.txt"), StandardCharsets.UTF_8))){
            String line2;
            int count=0;
            long start4=System.nanoTime();
            while((line2=isr.readLine())!=null){
                String[] words=line2.split("\\s+");
                for(String word:words){
                    count++;
                }
            }
            long end4=System.nanoTime();
            long elapse4=end4-start4;
            System.out.println("Word count by file reader: "+count);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }


        System.out.println("String Buffer: "+elapse2+"\nString Builder: "+elapse1);

        if(elapse1<elapse2) {
            System.out.println("StringBuilder is faster than StringBuffer");
        } else if(elapse2<elapse1) {
            System.out.println("StringBuffer is faster than StringBuilder");
        } else {
            System.out.println("Both took the same time");
        }



    }
}

package LinearSearch_BinarySearch_StringBuilder_StringBuffer_BufferedReader_FileReader_InputStreamReader.StringBuffer;

/*
          Concatenate strings
          using string buffer
 */
public class ConcatenateStrings{
    public static void main(String[] args){
        String[] words={"Hello","World",".Good","Morning"};

        //create string buffer
        StringBuffer sb=new StringBuffer();
        for(String word:words){
            sb.append(word).append(" ");
        }

        System.out.println(sb.toString());
    }
}